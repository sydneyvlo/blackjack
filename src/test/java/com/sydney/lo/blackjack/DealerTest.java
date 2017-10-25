package com.sydney.lo.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;

public class DealerTest {

    @Test
    /**
     * Makes sure the dealer hits when it has a hand value of 16 or less.
     */
    public void takeTurnTest() {
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        deck.shuffle(1000);

        while (dealer.getHandValue() <= 16) {
            assertEquals("hit", dealer.takeTurn());
            dealer.hit(deck.getCard());
        }
    }
}