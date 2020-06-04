package behaviorImpl;

import behavior.MoveStrategy;

public class WalkingStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("Walking");

	}

}
