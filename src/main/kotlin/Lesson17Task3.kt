class Folder(
    private val name: String,
    private val quantityOfFiles: Int,
    private val secretFlag: Boolean,
) {
    val folderName: String
        get() {
            if (secretFlag) {
                return "Secret folder. Quantity of files = 0"
            } else {
                return "Folder name = $name. Quantity of files = $quantityOfFiles"
            }
        }
}

fun main() {
    val folder1 = Folder(
        name = "Photos2023",
        quantityOfFiles = 2555,
        secretFlag = true
    )

    val folder2 = Folder(
        name = "Photos2024",
        quantityOfFiles = 4000,
        secretFlag = false
    )

    println(folder1.folderName)
    println(folder2.folderName)
}