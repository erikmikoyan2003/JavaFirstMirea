package ru.mirea.Practice3.Exe1;
import java.util.Random;

public class Exe1 {
    public static void main(String[] args) {
        double[] array = new double[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = 1000 * rand.nextDouble();
            System.out.println(array[i]);
        }
        System.out.println("Сортировка...");
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    double tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
