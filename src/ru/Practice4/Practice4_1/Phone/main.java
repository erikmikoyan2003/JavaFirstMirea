package ru.mirea.Practice4.Practice4_1.Phone;

public class main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[] {
                new Phone("Iphuck 10", "89999999999", Math.ceil(Math.ceil(Math.random()*Math.pow(10, 3)))),
                new Phone("MiniSoftPhone", "81111111111", Math.ceil(Math.ceil(Math.random()*Math.pow(10, 3)))),
                new Phone("Gogol byte 1 mini", "89996711504", Math.ceil(Math.ceil(Math.random()*Math.pow(10, 3)))),
        };

        for (Phone phone: phones) {
            System.out.printf("Model: " + phone.model);
            System.out.printf("    Number: " + phone.number);
            System.out.println("    Weight: " + phone.weight);
        }

        sendMessage(getNumbers(phones));
    }

    public static String[] getNumbers(Phone[] phones) {
        String[] numbers = new String[phones.length];
        for (int i = 0; i < phones.length; i++) {
            numbers[i] = phones[i].getNumber();
        };
        return numbers;
    }

    public static void sendMessage (String[] numbers) {
        for (String number: numbers) {
            System.out.println(number);
        }
    }
}
