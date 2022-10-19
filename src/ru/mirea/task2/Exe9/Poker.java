package ru.mirea.Practice2.Exe9;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
        int n = sc.nextInt();

        String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] cardtype = { "Hearts", "Spades", "Diamonds", "Clubs"};
        int quantity = cards.length * cardtype.length;
        if (n < 2){
            System.out.println("В покер вдвоём не играют");
        } else if (n * 5 > quantity) {
            System.out.println("В покер впятером не играют");
        }

        String[] pack = new String[quantity];
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cardtype.length; j++) {
                pack[(cardtype.length * i) + j] = cards[i] + " " + cardtype[j];
                System.out.println(pack[(cardtype.length * i) + j]);
            }
        }

        for (int i = 0; i < quantity; i++) {
            int k = i + (int) (Math.random() * (quantity-i));
            String temp = pack[k];
            pack[k] = pack[i];
            pack[i] = temp;
        }

        for (int i = 0; i < n * 5; i++) {
            System.out.println(pack[i]);
            if (i % 5 == 5 - 1){
                System.out.println();
            }
        }
    }
}