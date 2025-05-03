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

    public void setLibrary(Library library) {
        this.library = library;
    }
}
