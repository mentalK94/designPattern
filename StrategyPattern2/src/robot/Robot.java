package robot;

import behavior.AttackStrategy;
import behavior.MoveStrategy;

public abstract class Robot {
	
	private String name; // 로봇 이름
	private MoveStrategy moveStrategy; // 이동전략
	private AttackStrategy attackStrategy; // 공격전략	
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void attack() {
		attackStrategy.attack();
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy; 
	}
	
	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
}
