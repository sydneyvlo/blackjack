package com.sydney.lo.blackjack;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
    static String prompt = "Welcome to Soft Serve 16 Blackjack! Would you like to start a game (y/n)?: ";

    public static void main( String[] args ) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        String response = s.next();
        boolean isPlaying = response.toLowerCase().equals("y");
        Game game = new Game();

        while (isPlaying) {
            game.round();
            System.out.print("Would you like to play again (y/n)?: ");
            response = s.next();
            isPlaying = response.toLowerCase().equals("y");
        }

        System.out.println("Thank you for playing! See you next time.");
    }
}
