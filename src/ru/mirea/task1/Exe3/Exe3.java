package ru.mirea.Practice1.Exe3;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ввод длины массива
        System.out.print("Введите длину массива: ");
        int[] array = new int[sc.nextInt()];

        int sum = 0; // Сумма массива

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите целое число: ");
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
                sum += array[i];
            } else {
                System.out.println("Вы ввели нецелое число, программа остановлена");
                return;
            }
        }

        System.out.println(sum);
        System.out.println(sum/(array.length));
    }
}
