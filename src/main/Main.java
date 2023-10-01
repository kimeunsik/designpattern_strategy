package main;

import character.GameCharacter;
import weapon.impl.Aix;
import weapon.impl.Knife;
import weapon.impl.Sword;

public class Main {

    public static void main(String[] args) {
        
        GameCharacter character = new GameCharacter();
        
        character.attach(); //맨손 공격
        
        character.setWeapon(new Sword());
        character.attach(); //검 공격
        
        character.setWeapon(new Knife());
        character.attach(); //칼 공격
        
        character.setWeapon(new Aix());
        character.attach(); //도끼 공격
    }
}
