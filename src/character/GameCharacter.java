package character;

import weapon.Weapon;

public class GameCharacter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public void attach() {
        if(weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
