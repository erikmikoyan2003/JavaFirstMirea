package ru.mirea.task05.exe2;

import javax.swing.*;
import java.awt.*;

abstract class Shape {
    private Color color;
    private int x, y;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Rectangle extends Shape {
    int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width, int height, int x, int y, Color color) {
        this.width = width; this.height = height;
        this.setColor(color);
        this.setX(x);this.setY(y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(getX(), getY(), height, width);
    }
}

class Circle extends Shape {
    int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Circle(int width, int height, int x, int y, Color color) {
        this.width = width; this.height = height;
        this.setColor(color);
        this.setX(x);this.setY(y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(getX(), getY(), height, width);
    }
}

public class Frame extends Canvas {
    public void paint (Graphics g) {
        for (int i = 0; i < 20; i++) {
            int[] rgb = new int[3];
            for (int j = 0; j < 3; j++) {
                rgb[j] = (int) (Math.random() * 255);
            }

            int height = 10 + (int) (Math.random()*40);
            int width = 10 + (int) (Math.random()*40);

            int x = (int) (Math.random() * 512);
            int y = (int) (Math.random() * 512);

            Color color = new Color(rgb[0], rgb[1], rgb[2]);

            if (i % 2 == 0) {
                Rectangle rectangle = new Rectangle(width, height, x, y, color);
                rectangle.draw(g);
            } else {
                Circle circle = new Circle(width, height, x, y, color);
                circle.draw(g);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        Frame g = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(g);
        frame.setSize(512,512);
        frame.setVisible(true);
    }
}
