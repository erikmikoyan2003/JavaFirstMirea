package ru.mirea.task11.exe1;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date dateOfStart = new Date(1665858271999L);
        Date dateOfFinish = new Date();

        String surname = "Mikoyan";
        System.out.println("Задача получена: " + dateOfStart);
        System.out.println("\nСтудентом " + surname);
        System.out.println("\nИ сдана: " + dateOfFinish);
    }
}
