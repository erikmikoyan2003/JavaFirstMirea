package ru.mirea.Practice2.Exe3;

public class Tester {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        int length = circles.length;

        for (int i = 0; i < length; i++) {
            circles[i] = new Circle(i*2, i/2);
        }
    }
}