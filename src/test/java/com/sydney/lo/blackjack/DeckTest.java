package com.sydney.lo.blackjack;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class DeckTest {
    @Test
    public void generateNewDeckTest() {
        Deck d = new Deck();
        assertEquals(52, d.cardsLeft());
    }

    @Test
    /**
     * Test that the right number of each card is generated as expected. That is, in the order
     * that they are defined in the enum CardType.
     */
    public void correctCards() {
        Deck d = new Deck();
        ArrayList<Card> cardArrayList = d.getArrayList();

        int currId = 0;
        for (int i = 0; i < 52; i++) {
            if (i % 4 == 0 && i != 0) {
                currId += 1;
            }

            assertEquals(currId, cardArrayList.get(i).getCardId());
        }
    }

    @Test
    public void shuffleTest() {
    }

    @Test
    public void dealCardTest() {
    }

}