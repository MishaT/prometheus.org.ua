package com.tasks4.carddeck;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

    Card card = new Card(Rank.JACK, Suit.HEARTS);

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

    @Test
    public void testCardToString() {
        Card expectedCard = new Card(Rank.JACK, Suit.HEARTS);
        assertEquals(expectedCard.toString(), "HEARTS JACK");

    }

}
