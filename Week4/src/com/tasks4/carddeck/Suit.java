package com.tasks4.carddeck;


public class Suit {
    public static final Suit HEARTS = new Suit("HEARTS"); // черв
    public static final Suit DIAMONDS = new Suit("DIAMONDS"); // бубна
    public static final Suit CLUBS = new Suit("CLUBS");// треф
    public static final Suit SPADES = new Suit("SPADES");// пик

    public static Suit[] values = { HEARTS, DIAMONDS, CLUBS, SPADES };

    private String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
