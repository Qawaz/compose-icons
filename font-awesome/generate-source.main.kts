@file:Repository("https://jitpack.io")
@file:Repository("https://dl.google.com/dl/android/maven2/")
@file:Repository("https://repo.maven.apache.org/maven2/")
@file:Repository("file:///home/devsrsouza/.m2/repository")

// svg-to-compose
@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.8.1")
@file:DependsOn("com.google.guava:guava:23.0")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

// Jgit
@file:DependsOn("org.eclipse.jgit:org.eclipse.jgit:6.4.0.202211300538-r")

import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

val buildDir = File("build/").makeDirs()

val githubId = "FortAwesome/Font-Awesome"
val repository = "https://github.com/$githubId"
val version = "6.2.1"
val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"
val blobGithubRepository = "$repository/blob/$version"

val repoCloneDir = createTempDir(suffix = "git-repo")

println("Cloning repository")
val git = Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()
git.checkout().setName("refs/tags/$version").call()

val iconsDir = File(repoCloneDir, "svgs")

// renaming to match to svg-to-compose
iconsDir.walkTopDown().filter { it.extension == "svg" }
    .forEach {
        val newFile = File(it.parentFile, it.name.replace("-", "_"))
        it.renameTo(newFile)
    }

fun replacePathName(path: String): String {
    val iconName = path.substringAfterLast('/')
    val newIconName = iconName.replace("_", "-")
    return path.replace(iconName, newIconName)
}

val srcDir = File("font-awesome/src/commonMain/kotlin").apply { mkdirs() }
srcDir.deleteRecursively()
srcDir.mkdirs()

fun String.removeSuffix(suffix: String, ignoreCase: Boolean): String {
    if(ignoreCase) {
        val index = lastIndexOf(suffix, ignoreCase = true)

        return if(index > -1) substring(0, index) else this
    } else {
        return removeSuffix(suffix)
    }
}

println("Generating all svg to compose")

val result = Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "FontAwesomeIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons",
)

println("Copying LICENSE from the Icon pack")

val licensePath = "LICENSE.txt"
val licenseFile = File(repoCloneDir, licensePath)

val resDir = File("font-awesome/src/commonMain/resources").makeDirs()
val licenseInResource = File(resDir, "font-awesome-license.txt")

licenseFile.copyTo(licenseInResource, overwrite = true)

println("Generating documentation")

data class DocumentationGroup(
    val groupName: String,
    val groupAccessingFormat: String,
    val icons: List<DocumentationIcon>,
)

data class DocumentationIcon(
    val accessingFormat: String,
    val svgFilePathRelativeToRepository: String,
)

fun ParsingResult.asDocumentationGroupList(
    previousAccessingGroupFormat: String? = null
): List<DocumentationGroup> {
    val accessingGroupFormat = if(previousAccessingGroupFormat != null)
        "$previousAccessingGroupFormat.${groupName.second}"
    else groupName.second

    return listOf(asDocumentationGroup(accessingGroupFormat)) + generatedGroups.flatMap {
        it.asDocumentationGroupList(accessingGroupFormat)
    }
}

fun ParsingResult.asDocumentationGroup(
    accessingGroupFormat: String
): DocumentationGroup {
    return DocumentationGroup(
        groupName = groupName.second,
        groupAccessingFormat = accessingGroupFormat,
        icons = generatedIconsMemberNames.map {
            DocumentationIcon(
                "$accessingGroupFormat.${it.value.simpleName}",
                it.key.relativeTo(repoCloneDir).path
            )
        }
    )
}

fun markdownSvg(doc: DocumentationIcon): String {
    return "![](${rawGithubRepository + "/" + replacePathName(doc.svgFilePathRelativeToRepository) })"
}

fun markdownIconDocumentation(doc: DocumentationIcon): String {
    return "${markdownSvg(doc)} | ${doc.accessingFormat}"
}

val chunks = 2
fun List<DocumentationIcon>.iconsTableDocumentation(): String = sortedBy { it.accessingFormat }
    .chunked(chunks).map {
        "| ${it.map { markdownIconDocumentation(it) }.joinToString(" | ")} |"
    }.joinToString("\n")

val documentationGroups = result.asDocumentationGroupList()
    .filter { it.icons.isNotEmpty() }
    .map {
        """
            ## ${it.groupName}
            
            |${" Icon | In Code |".repeat(chunks)}
            |${" --- | --- |".repeat(chunks)}
        """.trimIndent() + "\n" + it.icons.iconsTableDocumentation()
    }.joinToString("\n<br /><br />\n")

val header = """
    # [Font Awesome](https://fontawesome.com/icons)
    
    <br />
    
""".trimIndent()

val license = """
    ## [License]($blobGithubRepository/$licensePath)
    
    ```
    
    """.trimIndent() + licenseFile.readText().trimEnd { it == '\n' } + "\n```\n\n<br /><br />\n\n"

File("font-awesome/DOCUMENTATION.md").apply{
    if(exists().not()) createNewFile()
}.writeText(
    header + "\n" + license + "\n" + documentationGroups
)
