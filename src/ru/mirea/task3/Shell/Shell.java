package ru.mirea.Practice3.Shell;

public class Shell {
    public static void main(String[] args) {
        double[] arrayOfDoubles = new double[] {
                Double.parseDouble("11,5"),
                Double.valueOf(11),
                Double.valueOf('9')
        };

        byte a1 = (byte) 11.5;
        short a2 = (short) 11.5;
        int a3 = (int) 11.5;
        long a4 = (long) 11.5;
        float a5 = (float) 11.5;
        char a6 = (char) 11.5;

        String d = Double.toString(3.14);
        System.out.println(arrayOfDoubles[0]);
        System.out.println(arrayOfDoubles[3]);
    }
}
