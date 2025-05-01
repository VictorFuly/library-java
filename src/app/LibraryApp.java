package app;

import domain.Book;
import domain.Library;

public class LibraryApp {
    public static void main(String[] args) {
        Book bookItTheThing = new Book("It: The Thing", "Stephen King");
        Book bookHarryPotter = new Book("Harry Potter", "J. K. Rowling");

        /**
        bookItTheThing.displayInfo();
        bookHarryPotter.displayInfo();
        **/

        Library libraryCoolBooks = new Library("Cool Books", "Washigton, 405");
        libraryCoolBooks.displayInfo();

        libraryCoolBooks.addBookToCollection(bookItTheThing);
        libraryCoolBooks.addBookToCollection(new Book("1984", "George Orwell"));
        libraryCoolBooks.displayBookCollection();

    }
}
