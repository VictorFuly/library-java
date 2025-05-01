package app;

import domain.Book;

public class LibraryApp {
    public static void main(String[] args) {
        Book bookItTheThing = new Book("It: The Thing", "Stephen King");
        bookItTheThing.displayInfo();
    }
}
