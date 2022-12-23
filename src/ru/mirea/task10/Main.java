package ru.mirea.task10;

import java.util.Scanner;

import java.util.Scanner;

class SortingStudentByGPA{
    Scanner sc = new Scanner(System.in);
    public Student[] idNumber;
    int size;

    public void setArray() {
        double gpa_inp;

        System.out.print("Введите размер списка: ");
        size = sc.nextInt();sc.nextLine();
        idNumber = new Student[size];

        for (int i = 0; i < size; i++) {
            idNumber[i] = new Student();
            System.out.print("Введите имя студента: ");
            idNumber[i].setName(sc.nextLine());

            System.out.print("Введите фамилию студента: ");
            idNumber[i].setSurname(sc.nextLine());

            System.out.print("Введите курс студента: ");
            idNumber[i].setCourse(sc.nextInt());

            System.out.print("Введите группу студента: ");
            idNumber[i].setGroup(sc.nextLine());

            System.out.print("Введите специальность студента: ");
            idNumber[i].setSpecialty(sc.nextLine());

            System.out.print("Введите средний балл студента: ");
            idNumber[i].setGpa(sc.nextDouble());

            sc.nextLine();
            System.out.println();
        }
    }

    public void outArray() {
        for (int i = size-1; i >= 0; i--) {
            System.out.println(idNumber[i].toString());
        }
    }

    public void quicksort(int low, int high) {
        if (low >= high) return;

        int i = low, j = high, middle = low + (high - low) / 2;
        double base = idNumber[middle].getGpa();

        while (i <= j) {
            while (idNumber[i].getGpa() < base) {
                i++;
            }
            while (idNumber[j].getGpa() > base) {
                j--;
            }
            if (i <= j) {
                Student temp = idNumber[i];
                idNumber[i] = idNumber[j];
                idNumber[j] = temp;
                i++;j--;
            }
        }

        if (low < j) quicksort(low, j);
        if (high > 1) quicksort(i, high);
    }


    public void insertSortByGPA() {
        int prev, now;
        Student temp;

        for (int i = 1; i < size; i++) {
            prev = i - 1;
            now = i;
            while (prev >= 0 && idNumber[prev].getGpa() > idNumber[now].getGpa()) {
                temp = idNumber[now];
                idNumber[i] = idNumber[prev];
                idNumber[prev] = temp;
                prev--; now--;
            }
        }
    }

    public void insertSortByCourse()
    {
        int prev, now;
        Student temp;

        for (int i = 1; i < size; i++) {
            prev = i - 1;
            now = i;
            while (prev >= 0 && idNumber[prev].getCourse() > idNumber[now].getCourse()) {
                temp = idNumber[now];
                idNumber[i] = idNumber[prev];
                idNumber[prev] = temp;
                prev--; now--;
            }
        }
    }

    public void extendArray(Student[] otherArray) {
        int newSize = size + otherArray.length;

        Student[] newArray = new Student[newSize];

        for (int i = 0; i < newSize; i++) {
            newArray[i] = (i < size) ?
                    idNumber[i] : otherArray[i-size];
        }
        size = newSize;
        idNumber = newArray;
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Первый список студентов: ");
        SortingStudentByGPA tester1 = new SortingStudentByGPA();
        tester1.setArray();

        System.out.println("Второй список студентов: ");
        SortingStudentByGPA tester2 = new SortingStudentByGPA();
        tester2.setArray();

        System.out.println("Быстрая сортировка по среднему баллу: ");
        tester1.quicksort(0, tester1.size - 1);
        tester1.outArray();

        System.out.println("Сортировка вставками по курсу: ");
        tester2.insertSortByCourse();
        tester2.outArray();

        System.out.println("Объедининение списка: ");
        tester1.extendArray(tester2.idNumber);
        tester1.outArray();

        System.out.println("Сортировка общего списка по среднему баллу: ");
        tester1.insertSortByGPA();
        tester1.outArray();
    }
}
