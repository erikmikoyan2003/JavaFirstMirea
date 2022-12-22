package ru.mirea.task03.EmpoyeeReport;

public class EmployeeReport {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Erik Mikoyan", 999999),
                new Employee("Alex Martiny", 100),
                new Employee("Leonardo Markus", 400)
        };

        Report.generateReport(employees);
    }
}
