package com.sydney.lo.blackjack;

public enum CardType {
    TWO(0, 2),
    THREE(1, 3),
    FOUR(2, 4),
    FIVE(3, 5),
    SIX(4, 6),
    SEVEN(5, 7),
    EIGHT(6, 8),
    NINE(7, 9),
    TEN(8, 10),
    JACK(9, 10),
    QUEEN(10, 10),
    KING(11, 10),
    ACE(12, 11);

    // Member Variables
    private final int cardId;
    private final int cardValue;

    public static CardType fromInteger(int x) {
        switch(x) {
            case 0:
                return TWO;
            case 1:
                return THREE;
            case 2:
                return FOUR;
            case 3:
                return FIVE;
            case 4:
                return SIX;
            case 5:
                return SEVEN;
            case 6:
                return EIGHT;
            case 7:
                return NINE;
            case 8:
                return TEN;
            case 9:
                return JACK;
            case 10:
                return QUEEN;
            case 11:
                return KING;
            case 12:
                return ACE;
            default:
                // Return two if an invalid integer was given.
                return TWO;
        }
    }

    CardType(int cardId, int cardValue) {
        this.cardId = cardId;
        this.cardValue = cardValue;
    }

    public int getCardId() {
        return this.cardId;
    }

    public int getCardValue() {
        return this.cardValue;
    }
}
