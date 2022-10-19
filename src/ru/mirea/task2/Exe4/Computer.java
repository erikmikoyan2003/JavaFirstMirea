package ru.mirea.Practice2.Exe4;

public class Computer {
    public int index;
    private String CPU;
    private int RAM;
    private int ROM;

    public Computer(int index, String CPU, int RAM, int ROM){
        this.index = index;
        this.CPU = CPU;
        this.RAM = RAM;
        this.ROM = ROM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public String toString() {
        return ("Компьютер #" + index + " {" + "Процессор: " + CPU + ", ОЗУ: " + RAM + ", ПЗУ: " + ROM + "}");
    }
}
