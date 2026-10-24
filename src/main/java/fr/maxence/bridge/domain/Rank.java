package fr.maxence.bridge.domain;

public enum Rank {
    DEUX(0,"2"), TROIS(0,"3"), QUATRE(0,"4"), CINQ(0,"5"), SIX(0,"6"), SEPT(0,"7"),
    HUIT(0,"8"), NEUF(0,"9"), DIX(0,"10"), VALET(1,"J"), DAME(2,"Q"), ROI(3,"K"), AS(4,"A");

    private final int honorPoints;
    private final String rankSymbol;

    Rank(int honorPoints,String rankSymbol) {
        this.honorPoints = honorPoints;
        this.rankSymbol = rankSymbol;
    }

    public int getHonorPoints() {
        return honorPoints;
    }

    public String getRankSymbol(){
        return rankSymbol;
    }
}
    

