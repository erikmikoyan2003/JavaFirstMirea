package ru.mirea.task03.EmpoyeeReport;

public class Employee {
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String fullname;
    private double salary;

    Employee(String fullname, double salary) {
        setFullname(fullname); setSalary(salary);
    }
}
