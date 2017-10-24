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
    public void shuffleTest() {
    }

    @Test
    public void dealCardTest() {
    }

}