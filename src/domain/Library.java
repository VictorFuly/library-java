package domain;

import domain.Users.Client;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> bookCollection = new ArrayList<>();
    private List<Client> clientList = new ArrayList<>();

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

    public void removeBookToCollection(Book book) {
        if (!bookCollection.contains(book)) {
            System.out.println("Collection don't have the book!");
            return;
        }
        bookCollection.remove(book);
    }

    public void displayClients() {
        if (clientList == null) {
            System.out.println("The library don't have a Client!");
            return;
        }
        System.out.println("---- " + name + " CLient List ----");
        int listNumber = 1;
        for (Client client : clientList) {
            System.out.println(listNumber + ". " + client.getName());
            listNumber++;
        }
    }

    public void addClient(Client client) {
        for (Client c : clientList) {
            if (c.getRegistration() == client.getRegistration()) {
                System.out.println("Client already registered!");
                return;
            }
        }
        clientList.add(client);
    }

        public void removeCLient (Client client){
            if (!clientList.contains(client)) {
                System.out.println("Client don't registered!");
                return;
            }
            clientList.remove(client);
            client.setLibrary(null);
        }

        // Search book in a foreach with variable book into List bookCollection. So, takes the book title that eguals title parameter
        public void searchBook (String title){
            System.out.println("------ Search Result ------");
            for (Book book : bookCollection) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.displayInfo();
                    return;
                }
            }
            System.out.println("Result not found!");
        }

        public void displayBookCollection () {
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
