import characters.enemyTypes.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    
    Troll troll;

    @Before
    public void before(){
        troll = new Troll(10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        troll.takesDamage(3);
        assertEquals(7, troll.getHealthPoints());
    }
}
