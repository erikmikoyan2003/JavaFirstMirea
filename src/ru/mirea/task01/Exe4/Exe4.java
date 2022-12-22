package ru.mirea.task01.Exe4;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ввод длины массива
        System.out.print("Введите длину массива: ");
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите целое число: ");
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
            } else {
                System.out.println("Вы ввели нецелое число, программа остановлена");
                return;
            }
        }

        System.out.println("Сумма элементов через цикл while: " + sumByWhile(array));
        System.out.println("Сумма элементов через цикл do while: " + sumByDoWhile(array));
        System.out.println("Максимальный элемент массива: " + max(array));
        System.out.println("Минимальный элемент массива: " + min(array));
    }

    public static int sumByDoWhile(int[] array) {
        int sum = 0, i = 0;

        do {
            sum += array[i];
            i++;
        } while (i < array.length);

        return sum;
    }

    public static int sumByWhile(int[] array) {
        int sum = 0, i = 0;

        while (i < array.length) {
            sum += array[i];
            i++;
        };

        return sum;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] > max || max == 0) {
                max = array[j];
            }
        }

        return max;
    }

    public static int min(int[] array) {
        int min = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0 || min == 0) {
                min = array[j];
            }
        }

        return min;
    }
}
