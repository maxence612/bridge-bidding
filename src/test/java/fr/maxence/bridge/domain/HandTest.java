package fr.maxence.bridge.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class HandTest {
    private static final Map<Character, Rank> RANKS = Map.ofEntries(
        Map.entry('2', Rank.DEUX),  Map.entry('3', Rank.TROIS),
        Map.entry('4', Rank.QUATRE), Map.entry('5', Rank.CINQ),
        Map.entry('6', Rank.SIX),   Map.entry('7', Rank.SEPT),
        Map.entry('8', Rank.HUIT),  Map.entry('9', Rank.NEUF),
        Map.entry('T', Rank.DIX),   Map.entry('J', Rank.VALET),
        Map.entry('Q', Rank.DAME),  Map.entry('K', Rank.ROI),
        Map.entry('A', Rank.AS));

private static final Suit[] SUIT_ORDER =
        {Suit.SPADES, Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS};

private static Hand handOf(String notation) {
    String[] groups = notation.trim().split("\\s+");
    List<Card> cards = new ArrayList<>();
    for (int i = 0; i < groups.length; i++) {
        for (char symbol : groups[i].toCharArray()) {
            cards.add(new Card(RANKS.get(symbol), SUIT_ORDER[i]));
        }
    }
    return new Hand(cards);
}
    @Test
void toStringShowsSuitsFromSpadesDown() {
    Hand hand = handOf("AKQJ2 AKQ 32 432");
    assertThat(hand.toString()).isEqualTo("♠ A K Q J 2  ♥ A K Q  ♦ 3 2  ♣ 4 3 2");
}
}




