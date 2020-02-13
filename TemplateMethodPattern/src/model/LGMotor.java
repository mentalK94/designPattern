/*
 * name        : LGMotor.java
 * description : LGMotor motor model
 * date        : 2020.01.21.
 * writer      : hansol kim
 */

package model;

import enumeration.Direction;

public class LGMotor extends Motor {
	
	public LGMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor(Direction direction) {
		// TODO: LG Motor를 구동시킴
		System.out.println("LG Motor 구동");
	}
	
}
