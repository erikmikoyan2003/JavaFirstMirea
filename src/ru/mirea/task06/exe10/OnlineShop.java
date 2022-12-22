package ru.mirea.task06.exe10;

import java.util.ArrayList;

public class OnlineShop {
    ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {

    }

    public void deleteComputer(Computer computer) {

    }

    public Computer searchComputer(int processorFrequency,
                                   int monitorFrequency,
                                   int monitorSize,
                                   int memoryVolume,
                                   Brand brand) {
        for (Computer computer: computers) {
            if (processorFrequency == computer.getProcessor().getFrequency() &&
                monitorFrequency == computer.getMonitor().getFrequency() &&
                monitorSize == computer.getMonitor().getSize() &&
                memoryVolume == computer.getMemory().getVolume() &&
                brand == computer.getBrand()) {
                    return computer;
            }
        }
        return null;
    }
}
