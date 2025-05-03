package app;

import domain.Book;
import domain.Library;
import domain.Users.Client;

public class LibraryApp {
    public static void main(String[] args) {
        Book bookItTheThing = new Book("It: The Thing", "Stephen King");
        Book bookHarryPotter = new Book("Harry Potter", "J. K. Rowling");
        Book book1984 = new Book("1984", "George Orwell");

        /**
         bookItTheThing.displayInfo();
         bookHarryPotter.displayInfo();
         **/

        Library libraryCoolBooks = new Library("Cool Books", "Washigton, 405");
        //libraryCoolBooks.displayInfo();

        libraryCoolBooks.addBookToCollection(bookItTheThing);
        libraryCoolBooks.addBookToCollection(bookHarryPotter);
        libraryCoolBooks.addBookToCollection(book1984);

        //libraryCoolBooks.displayBookCollection();
        libraryCoolBooks.searchBook("1984");

        libraryCoolBooks.removeBookToCollection(book1984);
        libraryCoolBooks.displayBookCollection();

        Client client = new Client("Victor", 12345678, libraryCoolBooks);
        client.displayInfo();
        client.borrowBook(bookItTheThing);
        bookItTheThing.displayInfo();
        client.displayInfo();

    }
}
