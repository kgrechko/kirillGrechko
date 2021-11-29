package com.hillel.hw7;

import java.util.Random;

public class PokerMachine {


    public Card[] createDeck() {


        String[] suites = {"clubs", "spades", "diamonds", "hearts"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        Card[] deck = new Card[suites.length*values.length];

        int count = 0;
        for (String suite : suites) {
            for (String value : values) {
                deck[count ++] = new Card(suite, value);
            }
        }
        return deck;
    }

    public void shuffleCards(Card[] deck){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(52);
            int out = random.nextInt(52);
            Card temp = deck[in];
            deck[in] = deck[out];
            deck[out] = temp;
        }
    }

    public void serveCards(Card[] deck) {

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.println("player " + i + " receives " + deck[5 * i + j]);
                if (i % 5 == 5 - 1) ;

            }
        }
    }

}



