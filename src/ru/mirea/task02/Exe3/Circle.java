package ru.mirea.task02.Exe3;

public class Circle {
    private Point point;

    public Circle(double x, double y) {
        point = new Point(x, y);
    }
    public void newPoint(double x, double y) {
        Point _point = new Point(x, y);
    }
    public void setPoint(double x, double y) { point.setXY(x, y); }
}
