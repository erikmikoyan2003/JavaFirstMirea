package ru.mirea.task02.Exe8;

public class Sort {
    public static void main(String[] args) {
        String[] array = new String[]{"1", "2", "3", "4", "5"};
        System.out.println("До сортировки:\t");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String temp = "";
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        System.out.println("После сортировки:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}