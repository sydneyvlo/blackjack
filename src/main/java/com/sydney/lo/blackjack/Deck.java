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
    private ArrayList<Card> generateNewDeck() {
        int numOfCardTypes = 13;
        int numOfCardsPerType = 4;
        ArrayList<Card> d = new ArrayList<Card>();

        for (int i = 0; i < numOfCardTypes; i++) {
            // Generate four card objects per type.
            for (int j = 0; j < numOfCardsPerType; j++) {
                d.add(new Card(i));
            }
        }

        return d;
    }

    public int cardsLeft() {
        return deck.size();
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
