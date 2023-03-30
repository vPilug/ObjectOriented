package OOP.library.catalog;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    List<Book> booksArray = new ArrayList<>();

    void addBook(Book book) {
        booksArray.add(book);
    }

    void deleteBook(Book book) {
        booksArray.remove(book);
    }


    void listBooks() {
        for(Book myBook : booksArray) {
            System.out.println(myBook);
        }
        System.out.println("__________");
    }

    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Book noise = new Book("Noise", 278);
        libraryCatalog.addBook(noise);
        libraryCatalog.listBooks();

        Book harryPotter = new Novel("Harry Potter" , 212, "Science Fiction");
        libraryCatalog.addBook(harryPotter);
        libraryCatalog.listBooks();

        Book ghostStory = new Novel("Ghost Story", 145, "Horror");
        libraryCatalog.addBook(ghostStory);
        libraryCatalog.listBooks();

        Book travel = new ArtAlbum("Travel", 35, "Recycled Paper");
        libraryCatalog.addBook(travel);
        libraryCatalog.listBooks();

        Book family = new ArtAlbum("Family", 20, "Silk");
        libraryCatalog.addBook(family);
        libraryCatalog.listBooks();

        libraryCatalog.deleteBook(noise);
        libraryCatalog.listBooks();

        Book romeoAndJuliet = new Novel("Romeo and Juliet", 190, "Romance");
        libraryCatalog.addBook(romeoAndJuliet);
        libraryCatalog.listBooks();

        libraryCatalog.deleteBook(travel);
        libraryCatalog.listBooks();

        libraryCatalog.addBook(noise);
        libraryCatalog.listBooks();
        libraryCatalog.addBook(travel);
        libraryCatalog.listBooks();
    }
}
