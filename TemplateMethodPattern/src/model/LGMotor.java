/*
 * name        : LGMotor.java
 * description : LGMotor motor model
 * date        : 2020.01.21.
 * writer      : hansol kim
 */

package model;

import enumeration.Direction;
import enumeration.DoorStatus;
import enumeration.MotorStatus;

public class LGMotor extends Motor {
	
	public LGMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor(Direction direction) {
		// TODO: LG Motor를 구동시킴
	}
	
}
