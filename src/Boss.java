public class Boss extends GameEntity{
    private Weapon weapon;


    public Boss(int health, int damage, String weaponName, WeaponType weaponType) {
        super();
        setHealth(health);
        setDamage(damage);
        this.weapon = new Weapon(weaponType, weaponName);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return "Health:" + getHealth() + " Damage:" + getDamage() +
                " Weapon:" + weapon.getWeaponName() + " Type:" + weapon.getWeaponType();
    }
}
