//Создать класс точка Point, описывающий точку на плоскости. Создать
//        Circle класс, в котором одно поле представляет точку – центр окружности, и
//        добавить другие свойства, позволяющие задать точку на плоскости. Создать
//        третий класс Tester который использует для хранения объектов массив
//        объектов Circle и второе поле количество элементов в массиве.


package ru.mirea.Practice2.Exe3;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        setXY(x,y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                "};";
    }
}
