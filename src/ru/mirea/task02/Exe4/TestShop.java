package ru.mirea.task02.Exe4;

import java.util.Scanner;
public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько комьютеров вы хотите загрузить в магазин? ");
        int num = scanner.nextInt();
        Computer[] computers = new Computer[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Введите модель процессора: ");
            String CPU = scanner.next();
            System.out.println("Введите объём ОЗУ: ");
            int RAM = scanner.nextInt();
            System.out.println("Введите объём ПЗУ: ");
            int ROM = scanner.nextInt();
            computers[i] = new Computer(i, CPU, RAM, ROM);
        }
        Shop shop = new Shop(computers);
        Computer[] allPC = shop.getAll().toArray(new Computer[0]);

        for (int i = 0; i < allPC.length; i++) {
            System.out.println(allPC[i].toString());
        }
    }
}
