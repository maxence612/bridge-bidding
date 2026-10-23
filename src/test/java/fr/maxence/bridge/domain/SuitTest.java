package fr.maxence.bridge.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SuitTest {

    @Test
    void spadesRankAboveHearts() {
        // Act
        int comparison = Suit.SPADES.compareTo(Suit.HEARTS);

        // Assert
        assertThat(comparison).isPositive();
    }

    @Test
    void onlyHeartsAndSpadesAreMajors() {
        assertThat(Suit.HEARTS.isMajor()).isTrue();
        assertThat(Suit.SPADES.isMajor()).isTrue();
        assertThat(Suit.CLUBS.isMajor()).isFalse();
        assertThat(Suit.DIAMONDS.isMajor()).isFalse();
    }
}