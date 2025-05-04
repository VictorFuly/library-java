package app;

import domain.Book;
import domain.Library;
import domain.Users.Client;
import domain.Users.Employee;
import domain.Users.User;

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
        //libraryCoolBooks.searchBook("1984");

        //libraryCoolBooks.removeBookToCollection(book1984);
        //libraryCoolBooks.displayBookCollection();

        Employee employee = new Employee("Japinha", 2345678, libraryCoolBooks, 1500);

        Client client = employee.registerClient("Victor", 12345678, libraryCoolBooks);
        client.borrowBook(bookItTheThing);
        bookItTheThing.displayInfo();
        client.displayInfo();
        client.giveBackBook(bookItTheThing);
        client.displayInfo();
        bookItTheThing.displayInfo();


    }
}
