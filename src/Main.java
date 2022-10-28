import java.util.ArrayList;
import homeWork_12.Author;
import homeWork_12.Book;
public class Main {
    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();

        authors.add(new Author("Herman", "Melville"));
        authors.add(new Author("Leo", "Tolstoy"));

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Moby-Dick", 1956, authors.get(0)));
        books.add(new Book("War and Peace", 1981, authors.get(1)));
        books.add(new Book("Anna Karenina", 1965, authors.get(1)));

        System.out.println(books.get(0).toString());

    }
}