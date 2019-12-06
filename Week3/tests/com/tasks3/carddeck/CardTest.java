package com.tasks3.carddeck;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {
    Card card = new Card(Rank.JACK, Suit.HEARTS);


    @Test
    public void testCardRank() {
        assertEquals(Rank.JACK, card.getRank());
        assertEquals(Rank.JACK.getName(), card.getRank().getName());
    }

    @Test
    public void testCardSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
        assertEquals(Suit.HEARTS.getName(), card.getSuit().getName());
    }

    @Test
    public void testCardEqual() {
        Card expectedCard = new Card(Rank.JACK, Suit.HEARTS);
        assertEquals(card, card);
        assertEquals(expectedCard, card);
    }

    @Test
    public void testOherCard() {
        Card expectedCard1 = new Card(Rank.KING, Suit.HEARTS);
        Card expectedCard2 = new Card(Rank.JACK, Suit.DIAMONDS);
        assertNotEquals(expectedCard1, card);
        assertNotEquals(expectedCard2, card);
    }

    @SuppressWarnings("unlikely-arg-type")
    @Test
    public void testCardNotEqual() {
        String str = new String("some str");
        assertFalse(card.equals(null));
        assertFalse(card.equals(str));
    }

}
