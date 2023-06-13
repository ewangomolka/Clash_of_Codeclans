package Players.Fighters;

import Behaviours.IWeapon;
import Items.Weapon;
import Players.Players;

public abstract class Fighter extends Players implements IWeapon {

    private Weapon weapons;

    public Fighter(int hp, String name, Weapon weapons) {
        super(hp, name);
        this.weapons = weapons;
    }

}
