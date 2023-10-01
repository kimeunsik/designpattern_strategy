package weapon.impl;

import weapon.Weapon;

public class Aix implements Weapon {

    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }

}
