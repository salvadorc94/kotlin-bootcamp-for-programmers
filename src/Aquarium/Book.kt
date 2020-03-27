package src.Aquarium

const val MAXIMUM_NUMBER_OF_BORROWED_BOOKS = 3

fun main(args: Array<String>) {
    val book = Book("Titel", "Martin", 2010)

    println("Here is your book ${book.getTitleAuthor().first} written by ${book.getTitleAuthor().second} in ${book.getTitleAuthorYear().third}")

    val allBooks = setOf(
       "title1",
        "title2",
        "title3"
    )

    val library = mapOf(
        "William Shakespeare" to allBooks
    )

    library.any { it.value.contains("Hamlet")}

    val moreBooks = mutableMapOf(
        "Harry Potter" to "JK Rowling"
    )

    moreBooks.getOrPut("Hamlet", {"William Shakespeare"})
}

class Book(private val title: String, private val author: String, private val year: Int) {

    companion object {
        const val BASE_URL = "www.books.com"
    }

    fun getTitleAuthor() = title to author
    fun getTitleAuthorYear() = Triple(title, author, year)

    fun canBorrow() = MAXIMUM_NUMBER_OF_BORROWED_BOOKS

    fun printUrl() = println("$BASE_URL$title.html")
}
