package weapon.impl;

import weapon.Weapon;

public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("칼 공격");
    }

}
