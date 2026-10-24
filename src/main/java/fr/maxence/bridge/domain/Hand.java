package fr.maxence.bridge.domain;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.HashSet;

public final class Hand {
    public static final int HAND_SIZE = 13;
    private final List<Card> cards;

    public Hand(Collection<Card> cards) {
        Objects.requireNonNull(cards, "cards");
        if (cards.size() != HAND_SIZE || new HashSet<>(cards).size() != HAND_SIZE) {
            throw new IllegalArgumentException("Une main contient 13 cartes distinctes");
        }
        this.cards = cards.stream().sorted().toList();
    }

    public int highCardPoints() {
        int total = 0;
        for (Card c : cards) {
            total += c.rank().getHonorPoints();
        }
        return total;
    }

    public List<Card> cards() {
        return cards;
    } // acesseur sur car toList rend la liste non modifiable

    int suitLength(Suit suit) {
        long count;
        count = cards.stream().filter(cards -> cards.suit() == suit).count();
        return (int) count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Suit[] suits = Suit.values();
        for (int i = suits.length - 1; i >= 0; i--) { // pique en premier
            Suit suit = suits[i];
            sb.append(suit.getSymbol());
            for (Card card : cards) {
                if (card.suit() == suit) {
                    sb.append(' ').append(card.rank().getRankSymbol());
                }
            }
            sb.append("  ");
        }
        return sb.toString().trim();
    }

}