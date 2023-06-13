import Enemies.Enemy;
import Enemies.Troll;
import Items.Weapon;
import Items.WeaponType;
import Players.Fighters.Paladin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Enemy troll;
    Paladin paladin;
    Weapon weapon;

    @Before
    public void before(){
        this.weapon = new Weapon(WeaponType.SWORD);
        this.paladin = new Paladin(100, "Jamie the Brave", weapon);
        this.troll = new Troll(100);
    }

    @Test
    public void enemyCanTakeDamage(){
        paladin.attack(troll);
        assertEquals(90, troll.getHp());
    }


}
