import org.junit.jupiter.api.Test;
import semestralka.semestralka.model.Player;

import static org.junit.jupiter.api.Assertions.*;

public class TestPlayer {
    Player player = new Player("First", 0,false);
    @Test
    public void TestConstructor()
    {
        assertEquals("First", player.name);
        assertEquals(0,player.number);
        assertFalse(player.isBot);
    }
    @Test
    public void TestAddMoney()
    {
        player.AddMoneyToPlayer(100);
        assertEquals(1600,player.getMoney());
    }
    @Test
    public void TestTakeMoney()
    {
        player.TakeMoneyFromPlayer(200);
        assertEquals(1300,player.getMoney());
    }
    @Test
    public void TestPlayerHasEnoughMoney()
    {
        assertTrue(player.PlayerHasEnoughMoney(1500));
        assertFalse(player.PlayerHasEnoughMoney(1501));
    }
    @Test
    public void TestComparePlayersPossessions()
    {
        assertTrue(player.ComparePlayersPossessions(1500));
        assertFalse(player.ComparePlayersPossessions(1501));
    }
}
