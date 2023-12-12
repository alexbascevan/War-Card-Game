package com.mycompany.app;

/**
 * Authors:
 * Student: Alexander Bascevan ID:991566471
 */

 

import java.util.Scanner;

/**
 * The App class serves as the entry point for the War card game application.
 * It allows the user to play the game and prompts for replay.
 */
public class App {

    /**
     * The main method that initiates the game and handles replay logic.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            playWar(scanner);

            System.out.print("\n\nWould you like to play again? Yes or No: ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        } while (true);

        scanner.close();
    }

    /**
     * Initiates the War game by prompting the player's name and starting the game.
     *
     * @param scanner The scanner used for user input.
     */
    public static void playWar(Scanner scanner) {
        System.out.println("\n\n--------------------------");
        System.out.println("Welcome to the War Game!");
        System.out.println("--------------------------");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        War war = new War(playerName);
        war.play();

        System.out.println("Thanks for playing!");
    }

} // end of App class
