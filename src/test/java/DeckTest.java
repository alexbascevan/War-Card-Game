

import com.mycompany.app.Card;
import com.mycompany.app.Deck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class DeckTest {
    @Test
    public void testInitializeDeck() {
        Deck deck = new Deck();
        ArrayList<Card> cards = deck.getDeck();

        // Test that the deck contains the expected number of cards
        assertEquals(52, cards.size());
        
        Map<String, Long> countsBySuit = cards.stream()
                .collect(Collectors.groupingBy(Card::getSuit, Collectors.counting()));

        // Test that there are 13 cards of each suit
        long heartsCount = cards.stream().filter(card -> card.getSuit().equals("Hearts")).count();
        long diamondsCount = cards.stream().filter(card -> card.getSuit().equals("Diamonds")).count();
        long clubsCount = cards.stream().filter(card -> card.getSuit().equals("Clubs")).count();
        long spadesCount = cards.stream().filter(card -> card.getSuit().equals("Spades")).count();

        assertEquals(13, heartsCount);
        assertEquals(13, diamondsCount);
        assertEquals(13, clubsCount);
        assertEquals(13, spadesCount);
    }

   
}

