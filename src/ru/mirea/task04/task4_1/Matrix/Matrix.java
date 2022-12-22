// Создать класс Матрица. Класс должен иметь следующие поля:
// 1) двумерный массив вещественных чисел;
// 2) количество строк и столбцов вматрице.
// Класс должен иметь следующие методы:
// 1) сложение с другойматрицей;
// 2) умножение на число;
// 3) вывод на печать;
// 4) умножение матриц -по желанию.

package ru.mirea.task04.task4_1.Matrix;

public class Matrix {
    public double[][] items;
    public int n; // Кол-во строк
    public int m; // Кол-во столбцов

    Matrix(int n, int m, double[][] items) {
        this.n = n;
        this.m = m;
        this.items = items;
    }

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.items = new double[n][m];
    }

    public Matrix addition(Matrix matrix) {
        if (matrix.n == this.n && matrix.m == this.m) {
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.m; j++) {
                    this.items[n][m]+=matrix.items[n][m];
                }
            }
        } else {
            throw new IllegalArgumentException("Размеры матриц должны быть идентичны!");
        }
        return this;
    };

    public double[][] addition(double[][] matrix) {
        if (matrix.length == this.n && matrix[0].length == this.m) {
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.m; j++) {
                    this.items[n][m]+=items[n][m];
                }
            }
        } else {
            throw new IllegalArgumentException("Размеры матриц должны быть идентичны!");
        }
        return this.items;
    };

    public Matrix multipleByNumber (Matrix matrix, int x) {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                matrix.items[n][m]*=-1;
            }
        }
        return matrix;
    };

    public double[][] multipleByNumber (int x) {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                this.items[i][j]*=-1;
            }
        }
        return this.items;
    };

    public Matrix subtraction (Matrix matrix) {
        return addition(multipleByNumber(matrix, -1));
    };

    public double[][] subtraction (double[][] matrix) {
        return addition(multipleByNumber(-1));
    };

    public void print() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.println(this.items[i][j] + " ");
            }
            System.out.println();
        }
    }

}
