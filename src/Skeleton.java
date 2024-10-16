public class Skeleton extends Boss {
    private int arrowsCount;

    public Skeleton(int health, int damage, String weaponName, WeaponType weaponType, int arrowsCount){
        super(health, damage, weaponName, weaponType);
        this.arrowsCount = arrowsCount;
    }
    public String info(){
        return super.info() + "  Arrows Count:" + this.arrowsCount;

    }
}
