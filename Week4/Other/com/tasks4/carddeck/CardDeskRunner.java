package com.tasks4.carddeck;

public class CardDeskRunner {

    public static void main(String[] args) {

        // Card card = new Card(Rank.NINE, Suit.DIAMONDS);
        // System.out.println(card);
        //
        // for (Suit suit : Suit.values()) {
        // System.out.println(suit);
        // }

        Deck deck = new Deck();

        // deck.shuffle();
        // deck.drawOne();
        // deck.drawOne();
        // deck.drawOne();
        // deck.drawOne();
        // deck.drawOne();
        // deck.drawOne();
        // deck.drawOne();

        deck.order();

        while (deck.hasNext()) {
            Card nextCard = deck.drawOne();
            System.out.println(nextCard.toString());
        }


    }

}
