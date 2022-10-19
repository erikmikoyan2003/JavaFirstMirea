package ru.mirea.Practice2.Exe6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите радиус первой окружности: ");
        int currentR = sc.nextInt();
        Circle circle1 = new Circle(currentR);
        System.out.println("Длина: " + circle1.getLength());
        System.out.println("Площадь: " + circle1.getSquare());

        System.out.println("Введите радиус второй окружности: ");
        currentR = sc.nextInt();
        Circle circle2 = new Circle(currentR);
        System.out.println("Длина: " + circle2.getLength());
        System.out.println("Площадь: " + circle2.getSquare());

        System.out.println("Введите радиус третьей окружности:");
        currentR = sc.nextInt();
        Circle circle3 = new Circle(currentR);
        System.out.println("Длина: " + circle3.getLength());
        System.out.println("Площадь: " + circle3.getSquare());

        circle3.comparison(circle1.comparison(circle2));
    }
}
