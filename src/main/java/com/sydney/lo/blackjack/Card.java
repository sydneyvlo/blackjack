package com.sydney.lo.blackjack;

import java.util.HashMap;

public class Card {
    // Member Variable
    private CardType card;
    private int numOfCardTypes = 13;

    public Card(int cardId) {
        card = CardType.fromInteger(cardId);
    }

    public int getCardId() {
        return card.getCardId();
    }

    public int getCardValue() {
        return card.getCardValue();
    }
}
