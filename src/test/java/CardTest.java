
import com.mycompany.app.Card;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;

public class CardTest {

    @Test
    public void testGetSuit() {  //this checks this method that it returns the right suit for a card
        Card card = new Card("Hearts", "Ace");              
        assertEquals("Hearts", card.getSuit());
    }

    @Test
    public void testGetRank() {     //  verifies that the correct rank of cards is returned
        Card card = new Card("Diamonds", "King");
        assertEquals("King", card.getRank());
    }
    
    @Test
    public void testToString() {
        Card card = new Card("Clubs", "7");         //checks the string representation of the caaard
        assertEquals("7 of Clubs", card.toString());
    }
    
    

}

