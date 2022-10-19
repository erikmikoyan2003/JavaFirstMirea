package ru.mirea.Practice2.Exe4;
import java.util.ArrayList;

public class Shop{
    public ArrayList<Computer> warehouse = new ArrayList<>();
    public int index = 0;

    public Shop(Computer ... computers){
        for (int i = 0; i < computers.length; i++) {
            warehouse.add(computers[i]);
        }
    }

    public void addNewComputer(int index, String  CPU, int RAM, int ROM){
        Computer newComputer = new Computer(index, CPU, RAM, ROM);
        warehouse.add(index, newComputer);
        this.index++;
    }

    public void deleteComputer(int index){
        for (int j = 0; j < warehouse.size(); j++) {
            if(warehouse.get(j).index == index){
                warehouse.remove(j);
                break;
            }
        }
        System.out.println("Компьютер #" + index + " удалён из склада");
    }

    public void search(int index){
        for (int j = 0; j < warehouse.size(); j++)
            if(warehouse.get(j).index == index) {
                System.out.println("Компьютер #" + index + " есть на складе");
                return;
            }
        System.out.println("Компьютер #" + index + " отсутствует на складе");
    }

    public ArrayList<Computer> getAll() {
        return warehouse;
    }
}