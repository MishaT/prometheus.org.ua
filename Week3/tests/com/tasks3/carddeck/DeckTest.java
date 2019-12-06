package com.tasks3.carddeck;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {
    Deck deck = new Deck();

    @Test
    public void testOrderedDeck() {
        Card expectedCard = new Card(Rank.NINE, Suit.HEARTS);

        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();

        Card actualCard = deck.drawOne();

        assertEquals(expectedCard, actualCard);
    }

    @Test
    public void testShuffledDeck() {
        Card expectedCard = new Card(Rank.ACE, Suit.HEARTS);

        deck.shuffle();

        Card actualCard = deck.drawOne();
        deck.order();

        assertNotEquals(expectedCard, actualCard);
    }

    @Test
    public void testEndOfDeck() {

        while (deck.hasNext()) {
            deck.drawOne();
        }
        Card actualCard = deck.drawOne();

        assertNull(actualCard);
    }
}
