package ru.mirea.task09.exe1;

import java.util.ArrayList;

class Tester {
    ArrayList<Student> iDNumber;
    Tester() {
        this.iDNumber = new ArrayList<>();
        iDNumber.add(new Student(1));
        iDNumber.add(new Student(2));
        iDNumber.add(new Student(3));
        iDNumber.add(new Student(4));
        iDNumber.add(new Student(5));
        iDNumber.add(new Student(16));
        iDNumber.add(new Student(17));
    }

    public void insertSort() {
        for (int left = 0; left < iDNumber.size(); left++) {
            Student temp = iDNumber.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if (temp.compareTo(iDNumber.get(i)) < 1) {
                    iDNumber.set(i + 1, iDNumber.get(i));
                } else {
                    break;
                }
            }
            iDNumber.set(i + 1, temp);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Student student : iDNumber) {
            result.append("\n").append(student.getId());
        }
        return result.toString();
    }
}

class Student implements Comparable<Student> {
    private final int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return (this.getId() < o.getId()) ? 0 : 1;
    }
}

public class main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.insertSort();
        System.out.println(tester);
    }
}