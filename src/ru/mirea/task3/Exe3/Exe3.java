package ru.mirea.Practice3.Exe3;
import java.util.Random;

public class Exe3 {
    public static void main(String[] args) {
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + 89*Math.random());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        boolean isIncreasingConsistency = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                isIncreasingConsistency = false;
                break;
            }
        }
        System.out.println(isIncreasingConsistency ? "Это возрастающая последовательность!" : "Это НЕ возрастающая последовательность");
    }
}
