package ru.mirea.task06.exe10;

class Processor {
    private int frequency;

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public Processor(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                '}';
    }
}

class Monitor {
    private int frequency;
    private int size;

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Monitor(int frequency, int size) {
        this.frequency = frequency;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "frequency=" + frequency +
                ", size=" + size +
                '}';
    }
}

class Memory {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Memory(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "volume=" + volume +
                '}';
    }
}

enum Brand {
    MiniSoft,
    ElectricArt,
    HahaPapa;
}

public class Computer {
    private int cost;
    private Processor processor;
    private Monitor monitor;
    private Memory memory;
    private Brand brand;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Computer(int cost, Processor processor, Monitor monitor, Memory memory, Brand brand) {
        this.cost = cost;
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", processor=" + processor +
                ", monitor=" + monitor +
                ", memory=" + memory +
                ", brand=" + brand +
                '}';
    }
}
