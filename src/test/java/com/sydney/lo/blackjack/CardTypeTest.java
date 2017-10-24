package com.sydney.lo.blackjack;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTypeTest {

    // Makes sure the fromInteger returns the correct CardType object given it's associated
    // id.
    @Test
    public void fromIntegerTest() {
        for (int i = 0; i < 13; i++) {
            CardType card = CardType.fromInteger(i);
            assertEquals(i, card.getCardId());
        }
    }

    // Makes sure that the function returns the appropriate card id.
    @Test
    public void getCardIdTest() {
        CardType card = CardType.TWO;
        assertEquals(0, card.getCardId());

        card = CardType.KING;
        assertEquals(11, card.getCardId());
    }

    @Test
    public void getCardValueTest() {
        CardType card = CardType.TWO;
        assertEquals(2, card.getCardValue());

        card = CardType.KING;
        assertEquals(10, card.getCardValue());
    }

}