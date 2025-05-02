package domain;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> bookCollection = new ArrayList<>();

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("------ Library Info ------");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println();
    }


    public void addBookToCollection(Book book) {
        bookCollection.add(book);
    }

    public void searchBook(String title) {
        System.out.println("------ Search Result ------");
        for (Book book : bookCollection) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayInfo();
                return;
            }
        }
        System.out.println("Result not found!");
    }

        public void displayBookCollection() {
            System.out.println("------ " + name + " Book Collection ------");
            for (Book book : bookCollection) {
                book.displayInfo();
            }
        }


        public void setName (String name){
            this.name = name;
        }

        public String getName () {
            return this.name;
        }

        public void setAddress (String address){
            this.address = address;
        }

        public String getAddress () {
            return this.address;
        }
    }
