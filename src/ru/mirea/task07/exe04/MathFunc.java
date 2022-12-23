package ru.mirea.task07.exe04;

public class MathFunc implements MathCalculate{
    @Override
    public double pow(int x, double y){
        for (int i = 0; i < x; i++) {
            y*=y;
        }
        return y;
    }

    @Override
    public double complexModulus(int a, int bi) {
        return (a^2+bi^2)^(1/2);
    }


    public static void main(String[] args) {
        MathCalculate m = new MathFunc();
        int R = 10;
        double P = 2*m.PI*R;
    }
}
