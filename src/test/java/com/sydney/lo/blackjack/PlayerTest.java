package com.sydney.lo.blackjack;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    /**
     * Test Player's class ability to add a card to its hand.
     */
    public void addCardToHandTest() {
        Deck d = new Deck();

        Player p1 = new Player();
        p1.hit(d.getCard());

        assertEquals(1, p1.getHand().size());
    }

    @Test
    /**
     * Test whether the added card increase the hand's value appropriately.
     */
    public void handValueTest() {
        Deck d = new Deck();
        Player p1 = new Player();
        int handValue = p1.getHandValue();

        Card c = d.getCard();
        p1.hit(c);

        assertEquals(handValue + c.getCardValue(), p1.getHandValue());
    }

}