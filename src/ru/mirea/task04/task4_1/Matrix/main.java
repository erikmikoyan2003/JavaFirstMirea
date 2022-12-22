package ru.mirea.task04.task4_1.Matrix;

public class main {
    public static void main(String[] args) {
        Matrix matrix1, matri2x;
        matrix1 = new Matrix(2,2, new double[][]{{1, 2}, {3, 4}});
        matrix1.multipleByNumber(-1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1.items[i][j] + " ");
            }
            System.out.println();
        }
    }
}
