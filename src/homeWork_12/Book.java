package homeWork_12;

public class Book {

    private String bookName;
    private Author author;
    private int publicationYear;

    public Book(String bookName, int publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = new Author(author.getName(), author.getSurname());
    }


    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getBookAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    /*
        Добавлено : toString, equals, hashCode
    */

    public String toString() {
        return "\"" + bookName + "\" " + this.author.toString() + " - " + publicationYear;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return toString().equals(other.toString());
    }
    public int hashCode() {
        return java.util.Objects.hash(toString());
    }

}
