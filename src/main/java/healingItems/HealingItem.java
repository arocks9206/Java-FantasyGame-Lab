package healingItems;

import characters.behaviours.IHeal;

public abstract class HealingItem implements IHeal {

    private int healAmount;

    public HealingItem() {
       this.healAmount = 0;
    }

}
