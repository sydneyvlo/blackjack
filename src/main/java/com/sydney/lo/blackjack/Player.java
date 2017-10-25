package com.sydney.lo.blackjack;

import java.util.ArrayList;

public class Player {

    // Member variables
    private ArrayList<Card> hand;
    private int handValue;

    /**
     * Constructor initializes the member variables.
     */
    public Player() {
        hand = new ArrayList<Card>();
        handValue = 0;
    }

    /**
     * Adds the Card object passed from the parameter into the ArrayList hand.
     * Additionally, updates the hand's value appropriately.
     *
     * @param c Card object to be added to the hand.
     */
    public void hit(Card c) {
        hand.add(c);

        // Update the value of the hand
        handValue += c.getCardValue();
    }

    /**
     * Returns the value of the hand.
     *
     * @return Returns as an int, the value of the hand.
     */
    public int getHandValue() {
        return handValue;
    }

    /**
     * Returns the hand member variable.
     *
     * @return ArrayList of Card objects.
     */
    public ArrayList<Card> getHand() {
        return hand;
    }
}
