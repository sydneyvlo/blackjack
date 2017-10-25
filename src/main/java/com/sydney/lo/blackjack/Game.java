package com.sydney.lo.blackjack;
import java.util.ArrayList;

public class Game {

    // Member variables
    private Deck deck;
    private Dealer dealer;
    private Player player;
    private int pot;

    /**
     * Constructor that sets up the game for one player versus the dealer.
     */
    public Game() {
        deck = new Deck();
        dealer = new Dealer();
        player = new Player();
    }

    /**
     * Plays one round of blackjack.
     */
    public void round() {
        deck = new Deck();
        deck.shuffle(1000);

        deal(deck);

        boolean playersTurn;
        do {
            playersTurn = player.takeTurn() == "hit";

            if (playersTurn) {
                player.hit(deck.getCard());
            }

        } while(playersTurn);

        dealer.takeTurn();
        String winner;

        // Determine who won
        if (player.getHandValue() > 21) {
            winner = "dealer";
        } else if (dealer.getHandValue() > 21) {
            winner = "player";
        } else if (dealer.getHandValue() == player.getHandValue()) {
            winner = "tie";
        } else {
            if (player.getHandValue() < dealer.getHandValue()) {
                winner = "dealer";
            } else {
                winner = "player";
            }
        }

        if (winner == "tie") {
            System.out.println("Tie!");
        } else if (winner == "player") {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        player.resetHand();
        dealer.resetHand();
    }

    /**
     * Deals two cards to each player including the dealer.
     */
    public void deal(Deck deck) {
        player.hit(deck.getCard());
        dealer.hit(deck.getCard());

        player.hit(deck.getCard());
        dealer.hit(deck.getCard());
    }
}
