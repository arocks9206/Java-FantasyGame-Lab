package healingItems;

import characters.Player;

public class Potions extends HealingItem {

    private final int healAmount;

    public Potions() {
        this.healAmount = 10;
    }

    public void heal(Player player) {
        player.addHealthPoints(healAmount);
    }
    
}
