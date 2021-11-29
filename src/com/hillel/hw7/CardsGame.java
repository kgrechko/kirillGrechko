package com.hillel.hw7;

import com.hillel.hw7.PokerMachine;

public class CardsGame {
    public static void main(String[] args) {

        PokerMachine PokerMachine = new PokerMachine();
       Card[] deck = PokerMachine.createDeck();
        PokerMachine.shuffleCards(deck);
        PokerMachine.serveCards(deck);





    }
}