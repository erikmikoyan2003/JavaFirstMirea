package ru.mirea.Practice2.Exe5;

import java.util.Scanner;

public class Kennel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество собак, которых нужно добавить: ");
        int n = sc.nextInt();
        Dog[] dogs = new Dog[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Как зовут пёсика? ");
            String name = sc.next();
            System.out.println("Сколько ему лет? ");
            int age = sc.nextInt();
            dogs[i] = new Dog(age, name);
        }
    }
}
