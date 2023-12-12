package com.mycompany.app;

/**
 * Authors:
 * Student: Alexander Bascevan ID:991566471
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The War class represents the main game logic for the War card game.
 * It includes methods for initializing decks, playing rounds, and handling war scenarios.
 */
public class War {

    private Player player;// User input Player
    private Player computer;// Computer player
    private ArrayList<Card> playerDeck;// Users deck
    private ArrayList<Card> computerDeck;// Computers deck
    private int roundCounter;// Round

    /**
     * Constructs a new War game with the specified player name.
     *
     * @param playerName The name of the human player.
     */
    public War(String playerName) {
        this.player = new Player(playerName);
        this.computer = new Player("Computer");
        this.roundCounter = 0;
        initializeDecks();
    }

    /**
     * Initializes the decks for the player and computer.
     */
    private void initializeDecks() {
        Deck deck = new Deck();
        ArrayList<Card> fullDeck = deck.getDeck();
        playerDeck = new ArrayList<>(fullDeck.subList(0, fullDeck.size() / 2));
        computerDeck = new ArrayList<>(fullDeck.subList(fullDeck.size() / 2, fullDeck.size()));
    }

    /**
     * Plays the War game until one of the players runs out of cards.
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!playerDeck.isEmpty() && !computerDeck.isEmpty()) {
            roundCounter++;
            System.out.println("\n------------- Round " + roundCounter + " -------------");
            System.out.println("Scores - Computer: " + computer.getPlayerWins() + "  " + player.getPlayerName() + ": " + player.getPlayerWins());

            System.out.println("\n" + player.getPlayerName() + ", press Enter to play a card.");
            scanner.nextLine();

            Card playerCard = playerDeck.remove(0);
            Card computerCard = computerDeck.remove(0);

            System.out.println(player.getPlayerName() + " plays: " + playerCard);
            System.out.println("Computer plays: " + computerCard);

            int result = compareCards(playerCard, computerCard);

            if (result > 0) {
                player.incrementPlayerWins();
                System.out.println(player.getPlayerName() + " wins the round!\n");
            } else if (result < 0) {
                computer.incrementPlayerWins();
                System.out.println("Computer wins the round!\n");
            } else {
                System.out.println("It's a war!");
                handleWar();
            }
        }

        // Determine the winner
        if (playerDeck.isEmpty()) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println(player.getPlayerName() + " wins the game!");
        }
    }

    /**
     * Compares two cards and determines the winner based on their ranks.
     *
     * @param card1 The card played by the player.
     * @param card2 The card played by the computer.
     * @return A positive value if the player wins, a negative value if the computer wins, and 0 for a tie.
     */
    private int compareCards(Card card1, Card card2) {
        // Extract the ranks of the cards and compare them
        int rank1 = getRank(card1);
        int rank2 = getRank(card2);

        return Integer.compare(rank1, rank2);
    }

    /**
     * Gets the numeric rank of a card for comparison purposes.
     *
     * @param card The card for which to determine the rank.
     * @return The numeric rank of the card.
     */
    private int getRank(Card card) {
        String rank = card.getRank();

        switch (rank) {
            case "Ace":
                return 14;
            case "King":
                return 13;
            case "Queen":
                return 12;
            case "Jack":
                return 11;
            default:
                return Integer.parseInt(rank);
        }
    }

    /**
     * Handles the scenario when there is a war (tie) between the player and the computer.
     * Additional cards are drawn, and the winner of the war is determined.
     */
    private void handleWar() {
        // War scenario - draw three cards from each player
        ArrayList<Card> warCardsPlayer = new ArrayList<>(playerDeck.subList(0, Math.min(3, playerDeck.size())));
        ArrayList<Card> warCardsComputer = new ArrayList<>(computerDeck.subList(0, Math.min(3, computerDeck.size())));

        // Remove the drawn cards from the players' decks
        playerDeck.removeAll(warCardsPlayer);
        computerDeck.removeAll(warCardsComputer);

        System.out.println(player.getPlayerName() + "'s war cards: " + warCardsPlayer);
        System.out.println("Computer's war cards: " + warCardsComputer);

        // Compare the fourth card (the actual war card) of each player
        Card warCardPlayer = warCardsPlayer.get(warCardsPlayer.size() - 1);
        Card warCardComputer = warCardsComputer.get(warCardsComputer.size() - 1);

        System.out.println(player.getPlayerName() + "'s war card: " + warCardPlayer);
        System.out.println("Computer's war card: " + warCardComputer);

        int result = compareCards(warCardPlayer, warCardComputer);

        if (result > 0) {
            player.incrementPlayerWins();
            System.out.println(player.getPlayerName() + " wins the war!\n");
        } else if (result < 0) {
            computer.incrementPlayerWins();
            System.out.println("Computer wins the war!\n");
        } else {
            System.out.println("Another war!");
            handleWar();
        }
    }

} // end of War class
