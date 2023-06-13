package Players.Fighters;

import Enemies.Enemy;
import Items.Weapon;

public class Paladin extends Fighter{

    private Weapon weapons;

    public Paladin(int hp, String name, Weapon weapons) {
        super(hp, name, weapons);
    }


    @Override
    public void attack(Enemy enemy, Weapon weapons) {
        enemy.takeDamage(weapons);
    }
}
