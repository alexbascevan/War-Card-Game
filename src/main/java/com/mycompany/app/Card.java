package com.mycompany.app;

/**
 * Authors:
 * Student: Alexander Bascevan ID:991566471
 */

/**
 * The Card class represents a playing card with a suit and rank.
 * Each card has a suit (Hearts, Diamonds, Clubs, Spades) and a rank (2, 3, 4, ..., 10, Jack, Queen, King, Ace).
 */
public class Card {

    private String suit;// The suit of the Card
    private String rank;// The rank of the card (2,3,4....)

     /**
     * Constructs a new card with the specified suit and rank.
     *
     * @param suit The suit of the card (Hearts, Diamonds, Clubs, Spades).
     * @param rank The rank of the card (2, 3, 4, ..., 10, Jack, Queen, King, Ace).
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card.
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return The rank of the card.
     */
    public String getRank() {
        return rank;
    }

    /**
     * Returns a string representation of the card.
     *
     * @return A string in the format "rank of suit".
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card otherCard = (Card) obj;
        return this.suit.equals(otherCard.suit) && this.rank.equals(otherCard.rank);
    }
    
    @Override
    public int hashCode() {
        int result = suit != null ? suit.hashCode() : 0;
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        return result;
    }
} 