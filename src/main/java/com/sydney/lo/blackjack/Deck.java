package com.sydney.lo.blackjack;
import java.util.ArrayList;

public class Deck {

    // Member variables.

    // ArrayList (no synchronization needed)
    private ArrayList<Card> deck;

    /**
     * Generate 52 cards, 4 of each type of card.
     *
     * @return Returns an instance of the deck class that can be used to play card games.
     */
    public Deck() {
        deck = generateNewDeck();
    }

    /**
     * Populate a ArrayList with 52 cards, with four of each type.
     *
     * @return Returns an ArrayList of cards generated in the same order they are listed in CardType.
     */
    public ArrayList<Card> generateNewDeck() {

    }

    /**
     * Takes the ArrayList of Card objects and randomly swaps the elements around.
     *
     * @param deck An ArrayList of Card objects.
     */
    public void shuffle(ArrayList<Card> deck) {

    }

    /**
     * Removes the first Card object from the deck.
     *
     * @return Returns a Card object from the Arraylist.
     */
    public Card dealCard() {

    }
}
