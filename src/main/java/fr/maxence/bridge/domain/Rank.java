package fr.maxence.bridge.domain;

public enum Rank {
    DEUX(0), TROIS(0), QUATRE(0), CINQ(0), SIX(0), SEPT(0),
    HUIT(0), NEUF(0), DIX(0), VALET(1), DAME(2), ROI(3), AS(4);

    private final int honorPoints;

    Rank(int honorPoints) {
        this.honorPoints = honorPoints;
    }

    public int getHonorPoints() {
        return honorPoints;
    }
}
    

