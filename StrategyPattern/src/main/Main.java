package main;

import character.Character;
import weaponImp.Ax;
import weaponImp.Gun;

public class Main {

	public static void main(String[] args) {
		Character character = new Character();
		
		character.setWeapon(new Ax()); // µµ³¢ »ç¿ë		
		character.attack();
		
		character.setWeapon(new Gun());
		character.attack();
	}

}
