package ru.mirea.Practice4.Practice4_1.Shape;

abstract class Shape {
    String color;
    boolean filled;

    Shape() {};
    Shape(String color, boolean filled) {};

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0;
    };

    public double getPerimeter() {
        return 0;
    }

    public String toString() {
        return "color:"+color+"filled:"+filled;
    }
}

class Circle extends Shape {
    double radius;

    Circle() {};
    Circle(double radius) {};
    Circle(double radius, String color, boolean filled) {};

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 0;
    };

    public double getPerimeter() {
        return 0;
    }

    public String toString() {
        return "color:"+color+";filled:"+filled+";radius:"+radius;
    }
}

class Rectandle extends Shape {
    double width;
    double length;

    Rectandle() {};
    Rectandle(double width) {};
    Rectandle(double width, double length, String color, boolean filled) {};

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return 0;
    };

    public double getPerimeter() {
        return 0;
    }

    public String toString() {
        return "color:"+color+";filled:"+filled+";length:"+length+";width:"+width;
    }
}

class Square extends Rectandle {
    double side;

    Square() {};
    Square(double side) {};
    Square(double side, String color, boolean filled) {};

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "color:"+color+";filled:"+filled+";length:"+length+";width:"+width+";side"+side;
    }
}


public class main {
}
