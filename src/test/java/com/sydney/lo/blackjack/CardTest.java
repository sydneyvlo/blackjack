package com.sydney.lo.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;


public class CardTest {

    @Test
    public void createCardTest() {
        // Create a 2 card.
        Card card = new Card(0);
        assertEquals(0, card.getCardId());
    }
}