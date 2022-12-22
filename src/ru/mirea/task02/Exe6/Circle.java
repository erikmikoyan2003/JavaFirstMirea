package ru.mirea.task02.Exe6;

public class Circle {
    private int r;
    private int i = 0;
    private Circle[] circle = new Circle[2];
    private final double PI = Math.PI;

    public Circle(int r){
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getLength(){
        return 2*PI*r;
    }

    public double getSquare(){
        return PI * Math.pow(r, 2);
    }

    public void setCircle(int i, int newValue){
        circle[i].r = newValue;
    }

    public Circle comparison(Circle circle){
        if (circle.r < this.r){
            System.out.println("Круг с радиусом " + this.r + " больше, чем круг с радиусом " + circle.r);
            return this;
        } else if (circle.r == this.r) {
            System.out.println("Круги равны");
            return this;
        } else {
            System.out.println("Круг с радиусом " + circle.r + " больше, чем круг с радиусом " + this.r);
            return circle;
        }
    }
}