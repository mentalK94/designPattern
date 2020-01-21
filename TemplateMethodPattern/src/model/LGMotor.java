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

public class LGMotor {
	
	private Door door;
	private MotorStatus motorStatus;
	
	public LGMotor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}
	
	private void moveLGMotor(Direction direction) {
		// TODO: LG Motor를 구동시킴
	}
	
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
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
