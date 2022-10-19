package ru.mirea.Practice1.Exe7;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        int sum = num > 0 ? num : 1;
        for (int i = num-1; i > 0; i--) {
            sum *= i;
        };
        return sum;
    }
}
