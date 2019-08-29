package character;

import weapon.Weapon;

public class Character {
	
	Weapon weapon; // 사용 통로
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	// delegate(위임)
	public void attack() {
		weapon.attack(); // 해당 무기의 attack()호출
	}
}
