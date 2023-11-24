package ru.makhmutov.lab.task1.media;

public class Book extends Media {
    private String author;

    public Book(String author, String name) {
        super(name);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + super.getName() + '\'' +
                '}';
    }
}
