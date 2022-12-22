package ru.mirea.task02.Exe7;

public class BookShelf {
    private Book[] warehouse;

    public BookShelf(int n) {
        this.warehouse = new Book[n];
    }

    public BookShelf() {
        this.warehouse = new Book[0];
    }

    public void setWarehouse(Book[] warehouse) {
        this.warehouse = warehouse;
    }

    public void print () {
        for (int i = 0; i < warehouse.length; i++) {
            System.out.println(warehouse[i].toString());
        }
    }

    public void minDate(){
        int minYear = 0;
        for (int i = 0; i < warehouse.length; i++) {
            if(warehouse[i].getYearOfWriting() < minYear){
                minYear = warehouse[i].getYearOfWriting();
            }
        }
        System.out.println("Минимальная дата: "+minYear);
    }

    public void maxDate(){
        int maxYear = 0;
        for (int i = 0; i < warehouse.length; i++) {
            if(warehouse[i].getYearOfWriting() > maxYear){
                maxYear = warehouse[i].getYearOfWriting();
            }
        }
        System.out.println("Максимальная дата: "+maxYear);
    }

    public void sortByYear(){
        for (int i = warehouse.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if( warehouse[j].getYearOfWriting() < warehouse[j + 1].getYearOfWriting() ) {
                    Book tmp = warehouse[j];
                    warehouse[j] = warehouse[j + 1];
                    warehouse[j + 1] = tmp;
                }
            }
        }
    }
}
