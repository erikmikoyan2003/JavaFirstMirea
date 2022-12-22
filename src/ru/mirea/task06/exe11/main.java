package ru.mirea.task06.exe11;

interface Convertable {
    double convertfahrenheit();
    double convertKelvin();
}

class Celsius implements Convertable {
    private final double value;

    public Celsius(double value) {
        this.value = value;
    }

    @Override
    public double convertfahrenheit() {
        return value * 1.8 + 32;
    }

    @Override
    public double convertKelvin() {
        return value + 273.15;
    }
}
