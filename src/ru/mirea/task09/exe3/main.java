package ru.mirea.task09.exe3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            list1.add(new Student((int) (Math.random()*100)));
            list2.add(new Student((int) (Math.random()*100)));
        }
        list1.addAll(list2);

        MergeSort<Student> studentMergeSort = new MergeSort<>();
        studentMergeSort.mergeSort(list1);

        for (Student student : list1) {
            System.out.println(student.getId() + " ");
        }
    }
}

class MergeSort <E extends Comparable<E>> {
    void mergeSort(ArrayList<E> arrayList) {
        if (arrayList.size() > 1) {
            ArrayList<E> list1 = new ArrayList<>(arrayList.subList(0, arrayList.size() / 2));
            ArrayList<E> list2 = new ArrayList<>(arrayList.subList(arrayList.size() / 2, arrayList.size()));

            mergeSort(list1);
            mergeSort(list2);

            int l = 0, r = 0;
            arrayList.clear();

            for (int i = 0; i < list1.size() + list2.size(); i++) {
                if (    l != list1.size() &&
                        r != list2.size() &&
                        list1.get(l).compareTo(list2.get(r)) < 0)
                {
                    arrayList.add(i, list1.get(l));
                    l++;
                } else if (l != list1.size() && r != list2.size()) {
                    arrayList.add(i, list2.get(r));
                    r++;
                }
                if (l == list1.size() && l != 0) {
                    arrayList.addAll(list2.subList(r, list2.size()));
                    break;
                } else if (r == list2.size() && r != 0) {
                    arrayList.addAll(list1.subList(l, list1.size()));
                    break;
                }
            }
        }
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
        return this.getId() > o.getId() ? 1 : -1;
    }
}