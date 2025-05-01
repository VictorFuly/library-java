package domain;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String name, String author) {
        this.title = name;
        this.author = author;
        isBorrowed = false;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void giveBack() {
        isBorrowed = false;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
