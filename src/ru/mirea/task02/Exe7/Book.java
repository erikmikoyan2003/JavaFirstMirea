package ru.mirea.task02.Exe7;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int yearOfWriting;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public Book(String title, String author, int pages, int yearOfWriting) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.yearOfWriting = yearOfWriting;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", yearOfWriting=" + yearOfWriting +
                '}';
    }
}
