package ru.mirea.task06.exe08;

import ru.mirea.task06.exe06.Printable;

public class Shop implements Printable {
    private String Name;
    private int hoursOfWork;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Name='" + Name + '\'' +
                ", hoursOfWork=" + hoursOfWork +
                '}';
    }

    @Override
    public void print(){
        System.out.println(this.toString());
    }
}
