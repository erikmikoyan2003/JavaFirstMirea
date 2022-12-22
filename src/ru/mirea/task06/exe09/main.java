package ru.mirea.task06.exe09;

import ru.mirea.task06.exe07.Book;

public class main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("A", "B", 1984);
        books[1] = new Book("A", "B", 1984);
        books[2] = new Book("A", "B", 1984);
        for (Book book: books) {
            book.print();
        }
    }
}