package healingItems;

import characters.Player;

public class Herbs extends HealingItem {

    private final int healAmount;

    public Herbs() {
       this.healAmount = 5;
    }

    public void heal(Player player) {
        player.addHealthPoints(healAmount);
    }
}
