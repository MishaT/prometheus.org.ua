package com.tasks3.carddeck;

public class DeckRunner {

    public static void main(String[] args) {

        Integer iterator = 0;
        Deck deck = new Deck();
        deck.shuffle();
        
        while (iterator < 10) {
            iterator++;
            Card card = deck.drawOne();
            System.out.println(iterator.toString() + " " + card.getSuit().getName() + " " + card.getRank().getName());
        }
        
        System.out.println("--------------------------");

        deck.order();
        
        iterator = 0;
        while (deck.hasNext()) {
            iterator++;
            Card card = deck.drawOne();
            System.out.println(iterator.toString() + " " + card.getSuit().getName() + " " + card.getRank().getName());
        }

    }

}
