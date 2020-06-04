import characters.enemyTypes.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        orc.takesDamage(3);
        assertEquals(7, orc.getHealthPoints());
    }


}
