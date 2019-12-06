package com.tasks3.carddeck;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    private List<Card> cards = new LinkedList<Card>();

    // creates a card deck of 36 cards
    public Deck() {
        cards.clear();

        for (Suit suit : Suit.values) {
            for (Rank rank : Rank.values) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    // Перемішує колоду у випадковому порядку
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /*
     * * Впорядкування колоди за мастями та значеннями Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES для
     * кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 Наприклад
     * HEARTS Ace HEARTS King HEARTS Queen HEARTS Jack HEARTS 10 HEARTS 9 HEARTS
     * 8 HEARTS 7 HEARTS 6 І так далі для DIAMONDS, CLUBS, SPADES
     */
    public void order() {
        cards.sort(new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                return 100*java.util.Arrays.asList(Suit.values).indexOf(c1.getSuit()) -
                        100 * java.util.Arrays.asList(Suit.values).indexOf(c2.getSuit())
                        + java.util.Arrays.asList(Rank.values).indexOf(c1.getRank())
                        - java.util.Arrays.asList(Rank.values).indexOf(c2.getRank());

            }
        });
    }

    // Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return cards.size() > 0;
    }

    // "Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    // Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть
    // SPADES 6 потім
    // SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (hasNext()) {
            Card card = cards.get(cards.size() - 1);
            cards.remove(cards.size() - 1);
            return card;
        } else
            return null;
    }
}
