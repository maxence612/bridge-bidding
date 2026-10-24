package fr.maxence.bridge.domain;

import java.util.Objects;

public record Card(Rank rank, Suit suit) implements Comparable<Card> {

    public Card {
    Objects.requireNonNull(rank);
    Objects.requireNonNull(suit);
}
@Override
public int compareTo(Card other) {
    int bySuit = suit.compareTo(other.suit);
    if (bySuit != 0) {
        return bySuit;
    } else {
        return other.rank.compareTo(rank); // inversé car le rank se compare dans l'ordre décroissant 
    }
}

}