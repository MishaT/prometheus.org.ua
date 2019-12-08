package com.tasks4.carddeck;

public final class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int seqNo() {
        return 100 * suit.ordinal() + rank.ordinal();
    }

    @Override
    public boolean equals(Object obj) {
        Card objCard = (Card) obj;
        return rank.equals(objCard.rank) && suit.equals(objCard.suit);
    }

    @Override
    public String toString() {
        return suit.name() + " " + rank.name();
    }

}