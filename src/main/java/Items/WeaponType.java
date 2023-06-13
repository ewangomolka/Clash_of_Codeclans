package Items;

public enum WeaponType {

    SWORD(10),
    CLUB(5),
    AXE(20),

    DUAL_AXES(25);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
