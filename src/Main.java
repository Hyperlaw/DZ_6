public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500, 70, "Katana", WeaponType.SWORD);
        System.out.println(boss.info());

        Skeleton skeleton1 = new Skeleton(600, 60, "Long Bow", WeaponType.BOW, 30);
        Skeleton skeleton2 = new Skeleton(750, 40, "Short Bow", WeaponType.BOW, 50);

        System.out.println(skeleton1.info());
        System.out.println(skeleton2.info());
    }
}
