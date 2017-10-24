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
    /**
     * Makes sure that after the shuffle, the Card objects in the ArrayList are not in the
     * same order.
     */
    public void shuffleTest() {
        // Make a shallow copy of the ArrayList representing the deck.
        Deck d = new Deck();
        ArrayList<Card> unshuffled = (ArrayList<Card>) d.getArrayList().clone();

        d.shuffle(1000);
        ArrayList<Card> shuffled = d.getArrayList();

        boolean isSame = true;

        for (int i = 0; i < d.cardsLeft(); i++) {
            if (unshuffled.get(i) != shuffled.get(i)) {
                isSame = false;
                break;
            }
        }

        assertFalse(isSame);
    }

    @Test
    /**
     * Makes sure that after the shuffle, the same number of cards still exist in the deck.
     */
    public void shuffleSameNumberOfCardsTest() {
        Deck d = new Deck();
        int size = d.cardsLeft();

        d.shuffle(10000);
        int sizeAfterShuffle = d.cardsLeft();

        assertEquals(size, sizeAfterShuffle);
    }

    @Test
    /**
     * Test whether or not the getCard function removes the last card from the ArrayList.
     */
    public void getCardTest() {
        Deck d = new Deck();
        int size = d.cardsLeft();

        Card c = d.getCard();

        assertEquals(size-1, d.cardsLeft());
        assertEquals(12, c.getCardId());
    }

}