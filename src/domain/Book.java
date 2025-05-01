package domain;

public class Book {
    private String title;
    private String author;

    public Book(String name, String author) {
        this.title = name;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
}
