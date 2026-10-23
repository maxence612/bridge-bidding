package fr.maxence.bridge.domain;

public enum Suit {
    CLUBS("♣"),DIAMONDS("♦"),HEARTS("♥"),SPADES("♠");

    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isMajor(){
        return this == HEARTS || this == SPADES ; 
    }
}
