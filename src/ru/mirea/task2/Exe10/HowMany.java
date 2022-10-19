package ru.mirea.Practice2.Exe10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringTokenizer ins = new StringTokenizer(string);

        int words = 0;
        while (ins.hasMoreTokens()){
            words++;
            ins.nextToken();
        }
        System.out.println("Количество слов в тексте: " + words);
    }
}
