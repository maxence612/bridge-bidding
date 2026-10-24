package fr.maxence.bridge.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.stream.Stream;

class CardTest {
    @Test
void sortsBySuitThenByDescendingRank() {
    Card aceOfSpades = new Card(Rank.AS, Suit.SPADES);
    Card twoOfSpades = new Card(Rank.DEUX, Suit.SPADES);
    Card kingOfClubs = new Card(Rank.ROI, Suit.CLUBS);

    List<Card> sorted = Stream.of(twoOfSpades, aceOfSpades, kingOfClubs).sorted().toList();

    assertThat(sorted).containsExactly(kingOfClubs, aceOfSpades, twoOfSpades);
}

@Test
void rejectsNullComponents() {
    assertThatThrownBy(() -> new Card(null, Suit.HEARTS))
            .isInstanceOf(NullPointerException.class);
}
}
