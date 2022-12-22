package ru.mirea.task02.Exe7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько книг вы хотите добавить?");
        int n = sc.nextInt();
        BookShelf bookShelf = new BookShelf(n);

        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Название книги: ");
            String title = sc.next();
            System.out.println("Автор: ");
            String author = sc.next();
            System.out.println("Год издания: ");
            int dateOfWriting = sc.nextInt();
            System.out.println("Количество страниц");
            int pages = sc.nextInt();

            books[i] = new Book(title, author, pages, dateOfWriting);
        }

        bookShelf.setWarehouse(books);
        bookShelf.print();
        bookShelf.maxDate();
        bookShelf.minDate();
        bookShelf.sortByYear();
    }
}
