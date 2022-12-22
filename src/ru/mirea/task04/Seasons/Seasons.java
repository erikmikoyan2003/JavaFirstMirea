package ru.mirea.task04.Seasons;

public enum Seasons {
    SPRING(10, "Весна"),
    SUMMER(22, "Лето") {
        public void getDescription() {
            System.out.println("Тёплое время года");
        }
    },
    AUTUMN(10, "Осень"),
    WINTER(-30, "Зима");

    Seasons (double averageTemperature, String nameInRussian) {
        this.averageTemperature = averageTemperature;
        this.nameInRussia = nameInRussian;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getNameInRussia() {
        return nameInRussia;
    }

    public void setNameInRussia(String nameInRussia) {
        this.nameInRussia = nameInRussia;
    }

    private double averageTemperature;
    private String nameInRussia;
}
