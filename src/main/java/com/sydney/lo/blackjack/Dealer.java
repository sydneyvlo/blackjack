package com.sydney.lo.blackjack;

public class Dealer extends Player {

    public Dealer() {
        super();
    }

    @Override
    public String takeTurn() {
        String action = "hit";

        if (this.getHandValue() > 16) {
            action = "stay";
        }

        return action;
    }

}
