package fr.maxence.bridge.domain;

public enum Suit {
    TREFLE(♣),CARREAU(♦),COEUR(♥),PIQUE(♠);

    private final String suitSymbol;

    Suit(String suitSymbol) {
        this.suitSymbol = suitSymbol;
    }

    public String getsuitSymbol() {
        return suitSymbol;
    }
}
