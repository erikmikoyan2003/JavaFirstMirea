package ru.mirea.Practice3.Exe4;
import java.util.*;

public class Exe4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Input a number (>0): ");
            n = in.nextInt();
        } while (n <= 0);

        int[] array = new int[n], arrayOfEvenNums = new int[n];
        int countEvenNums = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (n*Math.random());
            System.out.print(array[i] + " ");

            if (array[i] % 2 == 0) {
                arrayOfEvenNums[countEvenNums] = array[i];
                countEvenNums++;
            };
        };

        System.out.println("\nЧетные числа массива:");
        for (int i = 0; i < countEvenNums; i++) {
            System.out.print(arrayOfEvenNums[i] + " ");
        }
    }
}
