package ru.mirea.task04.Seasons;

public class main {
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;

        printInfo(season);
    }

    public static void printInfo(Seasons season) {
        switch (season) {
            case SPRING -> {
                System.out.println("Я люблю, когда на улице " + season.getNameInRussia());
            }
            case SUMMER -> {
                System.out.println("Я люблю, когда на улице " + season.getNameInRussia());
            }
            case AUTUMN -> {
                System.out.println("Я люблю, когда на улице " + season.getNameInRussia());
            }
            case WINTER -> {
                System.out.println("Я люблю, когда на улице " + season.getNameInRussia());
            }
        }
    }
}
