package ru.mirea.task04.task4_1.Phone;

public class Phone {
    public String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String number;
    public double weight;

    Phone (String model, String number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    Phone (String model, String number) {
        this.model = model;
        this.number = number;
    }

    Phone () {}

    public static void ReceiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static void ReceiveCall(String name, String number) {
        System.out.println("Звонит " + name + " номер: " + number);
    }
}
