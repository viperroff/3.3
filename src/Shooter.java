public class Shooter implements WeaponChangeable, Shootable {
    private String name;
    private Weapon weapon;

    public Shooter(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void shoot() {
        if (weapon != null) {
            weapon.shoot();
        }else {
            System.out.println("Не могу участвовать в перестрелке!");
        }
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
