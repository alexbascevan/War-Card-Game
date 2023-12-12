
import com.mycompany.app.Card;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardInvalidTest {
    
    //this is for the invalid testtt

    @Test
    public void testGetSuit() {
        // Test getting the suit of the card
        Card card = new Card("Hearts", "Ace");
        assertEquals("Hearts", card.getSuit());
    }

    @Test
    public void testGetRank() {
        
        // Testt getting the rank of the card
        Card card = new Card("Diamonds", "King");
        assertEquals("King", card.getRank());
    }
    
    @Test
    public void testToString() {
         // Test converting card to string representation
        Card card = new Card("Clubs", "7");
        assertEquals("7 of Clubs", card.toString());
    }
    
    @Test
    public void testCreateCardWithInvalidParameters() {
        // Test creating a card with invalid parameters
       // In this case,, passing null values for teh suit and the rank
        Card card = new Card(null, null);
        assertEquals(null, card.getSuit());
        assertEquals(null, card.getRank());
    }
    
    @Test
    public void testEqualsMethod() {
        // Test equality of two cards
        Card card1 = new Card("Spades", "Jack");
        Card card2 = new Card("Spades", "Jack");
        Card card3 = new Card("Hearts", "Jack");

           assertEquals(card1, card2);
        assertEquals(card2, card1); 
        
        assertEquals(card1.hashCode(), card2.hashCode()); 
        assertEquals(false, card1.equals(card3)); 
    }
}
