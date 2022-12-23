package ru.mirea.task08;

import java.util.Scanner;

public class main {
    public static void invert(int input) {
        System.out.print(input%10 + " ");

        if (input > 10) {
            invert(input / 10);
        }
    }

    public static void main(String[] args) {
        invert(169);
    }
}
