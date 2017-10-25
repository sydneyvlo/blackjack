package com.sydney.lo.blackjack;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;

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

    @Test
    /**
     * Test whether the takeTurn function properly prompts the user for input and returns
     * the correct actions based on that input. This case is for hit.
     */
    public void takeTurnHitTest() {
        Player p1 = new Player();
        // Change the input stream to be this stream below to simulate user input from the console.
        ByteArrayInputStream in = new ByteArrayInputStream("h".getBytes());
        System.setIn(in);

        String action = p1.takeTurn();
        assertEquals("hit", action);

        // Change it back to the standard input stream.
        System.setIn(System.in);
    }

    @Test
    /**
     * Test whether the takeTurn function properly prompts the user for input and returns
     * the correct actions based on that input. This case is for stay.
     */
    public void takeTurnStayTest() {
        Player p1 = new Player();

        // Change the input stream.
        ByteArrayInputStream in = new ByteArrayInputStream("s".getBytes());
        System.setIn(in);

        String action = p1.takeTurn();
        assertEquals("stay", action);

        // Change it back to the standard input stream.
        System.setIn(System.in);
    }

    @Test
    /**
     * Test whether the takeTurn function properly prompts the user for input and returns
     * the correct actions based on that input. This case is for random input.
     */
    public void takeTurnInvalidInputTest() {
        Player p1 = new Player();

        // Change the input stream.
        ByteArrayInputStream in = new ByteArrayInputStream("asdfasdfasdf".getBytes());
        System.setIn(in);

        String action = p1.takeTurn();
        assertEquals("stay", action);

        // Change it back to the standard input stream.
        System.setIn(System.in);
    }

}