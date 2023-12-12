
import com.mycompany.app.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    
     @Test
    public void testPlayerName() {
        Player player = new Player("TestPlayer");
        assertEquals("TestPlayer", player.getPlayerName());
    }

    @Test
    public void testPlayerWins() {
        Player player = new Player("TestPlayer");

        // Test initial win count
        assertEquals(0, player.getPlayerWins());

        // Test incrementing win count
        player.incrementPlayerWins();
        assertEquals(1, player.getPlayerWins());

        // Test resetting win count
        player.resetPlayerWins();
        assertEquals(0, player.getPlayerWins());
    }
    
     @Test
    public void testPlayerScore() {
        Player player = new Player("TestPlayer");

        // Test incrementing win count multiple times
        player.incrementPlayerWins();
        player.incrementPlayerWins();
        player.incrementPlayerWins();

        assertEquals(3, player.getPlayerWins());

        // Test resetting win count
        player.resetPlayerWins();
        assertEquals(0, player.getPlayerWins());
    }

    
}
