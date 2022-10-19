package ru.mirea.Practice2.Exe2;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Начальная координата x");
        double x = scanner.nextDouble();
        System.out.println("Начальная координата y");
        double y = scanner.nextDouble();

        Ball ball = new Ball(x, y);

        System.out.println("Проверка метода toString:");
        System.out.println(ball.toString());

        ball.setX(0);
        ball.setY(0);
        ball.setXY(4, 4);
        ball.move(1.5, 1.5);
        System.out.println("Проверка геттеров для x и y");
        System.out.println("x: " + ball.getX() + "\ny: " + ball.getY());
    }
}
