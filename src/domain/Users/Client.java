package domain.Users;

import domain.Book;
import domain.Library;

import java.util.ArrayList;
import java.util.List;

public class Client extends User{
    private List<Book> booksBorrowed = new ArrayList<>();
    private Library library;

    public Client(String name, int registration, Library library) {
        super(name, registration);
        this.library = library;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Library: " + library.getName() + " | Books Borrowed: " + booksBorrowed.size() );

    }

    public void borrowBook(Book book) {
        if (book.isBorrowed()) {
            System.out.println("The book is already borrowed!");
            return;
        }
        book.borrow();
        booksBorrowed.add(book);
    }

    public void giveBackBook(Book book) {
        if (!booksBorrowed.contains(book)) {
            System.out.println("You don't borrow book!");
            return;
        }
        book.giveBack();
        booksBorrowed.remove(book);
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
