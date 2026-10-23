package fr.maxence.bridge.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RankTest {

    @Test
    void Roi_is_three_Points() {
        // Act
        int point = Rank.ROI.getHonorPoints();

        // Assert
        assertThat(point==3);
    }

    @Test
    void As_is_four_Points() {
        // Act
        int point = Rank.AS.getHonorPoints();

        // Assert
        assertThat(point==4);
    }
    @Test
    void Dix_is_zero_Points() {
        // Act
        int point = Rank.DIX.getHonorPoints();

        // Assert
        assertThat(point==0);
    }
}
