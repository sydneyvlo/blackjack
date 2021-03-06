package com.sydney.lo.blackjack;
import java.util.ArrayList;
import java.util.Random;

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

    /**
     * Returns the number of remaining cards in the deck.
     *
     * @return An int value that represents the number of cards left in the deck.
     */
    public int cardsLeft() {
        return deck.size();
    }

    /**
     * Shuffles the elements in the ArrayList of Card objects in the deck class.
     *
     * @param numberOfSwaps The number of random swaps performed on the ArrayList of Card objects.
     */
    public void shuffle(int numberOfSwaps) {
        // Inclusive
        int numOfCards = this.cardsLeft();
        Random r = new Random();

        // Shuffling a deck containing one card is nonsensical.
        if (numOfCards > 1) {
            for (int i = 0; i < numberOfSwaps; i++) {
                int pos1 = r.nextInt(numOfCards);
                int pos2 = r.nextInt(numOfCards);

                swap(pos1, pos2);
            }
        }
    }

    /**
     * Swaps the element in pos1 with the element in pos2.
     *
     * @param pos1 The index of the first element that will be apart of the swap.
     * @param pos2 The index of the second element that will be apart of the swap.
     */
    private void swap(int pos1, int pos2) {
        // Make sure the indices are valid.
        if (pos1 >= this.cardsLeft() || pos2 >= this.cardsLeft()) {
            return;
        } else {
            Card temp = deck.get(pos1);

            // Store the element at pos2 at pos1.
            deck.set(pos1, deck.get(pos2));

            // Store the element at pos1 at pos2.
            deck.set(pos2, temp);
        }
    }

    /**
     * Removes the last Card object from the deck if it isn't empty.
     *
     * @return Returns a Card object from the Arraylist or null if the deck is empty.
     */
    public Card getCard() {
        Card c = null;
        int numOfCards = this.cardsLeft();
        if (numOfCards > 0) {
            // Last element in the ArrayList
            c = deck.remove(numOfCards-1);
        }

        return c;
    }

    /**
     * Returns the ArrayList object which is the internal representation of the deck.
     * This function is mainly used for testing purposes.
     *
     * @return ArrayList object holding cards.
     */
    public ArrayList<Card> getArrayList() {
        return deck;
    }
}
