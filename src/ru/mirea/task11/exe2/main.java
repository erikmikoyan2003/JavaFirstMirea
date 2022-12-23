package ru.mirea.task11.exe2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM");
        Scanner sc = new Scanner(System.in);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        System.out.println("Введите дату: ");
        String now = sc.nextLine();
        int day = Integer.parseInt(now.substring(0,2)),
            month = Integer.parseInt(now.substring(4));

        calendar2.set(Calendar.DAY_OF_MONTH, day);
        calendar2.set(Calendar.MONTH, month - 1);

        System.out.println((calendar1.compareTo(calendar2) < 0) ?
                "Момент уже наступил" : "Момент еще не наступил" );
    }
}
