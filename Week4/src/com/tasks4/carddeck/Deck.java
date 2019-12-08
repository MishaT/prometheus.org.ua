package com.tasks4.carddeck;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    private List<Card> cards = new LinkedList<Card>();


    // creates a card deck of 36 cards
    public Deck() {
        cards.clear();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void order() {
        cards.sort(new Comparator<Card>() {

            @Override
            public int compare(Card c1, Card c2) {
                return c1.seqNo() - c2.seqNo();
            }
        });
    }

    public boolean hasNext() {
        return cards.size() > 0;
    }

    public Card drawOne() {
        if (hasNext()) {
            Card card = cards.get(cards.size() - 1);
            cards.remove(cards.size() - 1);
            return card;
        } else
            return null;
    }

}
