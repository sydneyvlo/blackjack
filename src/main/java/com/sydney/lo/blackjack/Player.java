package com.sydney.lo.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

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

    /**
     * Takes input from the human player to determine the players move.
     *
     * @return A string containing the word "hit" or "stay".
     */
    public String takeTurn() {
        // Print out a prompt to the user.
        String prompt = "Here is your hand's value: " + this.getHandValue()
                + "\nEnter 'h' to hit or 's' to stay.";
        System.out.println(prompt);

        Scanner s = new Scanner(System.in);
        String userInput = s.next();
        String action;

        if (userInput.equals("h")) {
            action = "hit";
        } else {
            action = "stay";
        }

        return action;
    }
}
