package com.hillel.hw10;
import java.util.Scanner;


public class CardsGame {
    public static void main(String[] args) {

        boolean shuffled = false;

        PokerMachine PokerMachine = new PokerMachine();

        Card[] deck = PokerMachine.createDeck();

       try
       {
           shuffled = PokerMachine.shuffleOption();
       }

       catch(NewDeckException e)
       {
           e.printStackTrace();
           System.out.println("You have no choice, deck will be shuffled anyway");
           PokerMachine.shuffleCards(deck);
       }

        if (shuffled == true)
            PokerMachine.shuffleCards(deck);

            PokerMachine.serveCards(deck);

    }
}