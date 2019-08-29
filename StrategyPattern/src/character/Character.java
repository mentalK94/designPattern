package character;

import weapon.Weapon;

public class Character {
	
	Weapon weapon; // ��� ���
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	// delegate(����)
	public void attack() {
		weapon.attack(); // �ش� ������ attack()ȣ��
	}
}
