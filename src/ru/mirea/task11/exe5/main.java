package ru.mirea.task11.exe5;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        LinkedList<Integer> a1 = new LinkedList<>();
        a1.add(3);
        a1.add(4);
        a1.add(6);
        a1.add(8);
        a1.remove(1);
        a1.set(0, 12);
        a1.set(1, 13);
        a1.contains(12);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);


        startTime = System.nanoTime();
        ArrayList <Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(4);
        a2.add(6);
        a2.add(8);
        a2.remove(1);
        a2.set(0,12);
        a2.set(1,13);
        a2.contains(12);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}