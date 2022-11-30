package ru.mirea.Practice3.EmpoyeeReport;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.format("%50s %50s\n", "Имя" , "Зарплата");
        for (Employee employee:employees) {
            System.out.format("%50s %50.2f\n", employee.getFullname() , employee.getSalary());
        }
    }
}
