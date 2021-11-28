package com.hillel.hw4;

public class Cards {
    public static void main(String[] args) {
        String[] suit = {"clubs", "spades", "diamonds", "hearts" };
        String[] denomination = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        int cards = suit.length * denomination.length;

        String[] deck = new String[cards];
        for (int i = 0; i < denomination.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = denomination[i] + " " + suit[j];
            }
        }

        for (int i = 0; i < cards; i++) {
            int r = i + (int) (Math.random() * (cards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
            System.out.println("player "+ i + " receives " + deck[5*i+j]);
            if (i % 5 == 5 - 1);

        }
        }

    }
}