package characters.playerTypes.clericTypes;

import characters.Player;
import characters.behaviours.IHeal;

public class Cleric extends Player implements IHeal {

    private IHeal healingItem;

    public Cleric(String name, int healthPoints, IHeal healingItem) {
        super(name, healthPoints);
        this.healingItem = healingItem;
    }

    public void heal(Player player) {
        this.healingItem.heal(player);
    }




}
