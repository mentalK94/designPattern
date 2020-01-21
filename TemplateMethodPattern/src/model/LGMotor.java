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
	
	private void moveLGMotor(Direction direction) {
		// TODO: LG Motor를 구동시킴
	}
	
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING)
			return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED)
			door.close();
	}
}
