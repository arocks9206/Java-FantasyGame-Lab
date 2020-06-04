import characters.playerTypes.clericTypes.Cleric;
import healingItems.Herbs;
import healingItems.Potions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Cleric cleric2;
    Herbs herbs;
    Potions potions;

    @Before
    public void before(){
        herbs = new Herbs();
        potions = new Potions();
        cleric = new Cleric("Percy", 25, herbs);
        cleric2 = new Cleric("Mary", 25, potions);
    }

    @Test
    public void hasName(){
        assertEquals("Percy", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(25, cleric.getHealthPoints());
    }

    @Test
    public void canHealWithHerbs(){
        cleric.heal(cleric);
        assertEquals(30, cleric.getHealthPoints());
    }

    @Test
    public void canHealWithPotions(){
        cleric2.heal(cleric);
        assertEquals(35, cleric.getHealthPoints());
    }


}
