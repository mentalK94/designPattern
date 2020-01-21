/*
 * name        : HyundaiMotor.java
 * description : Hyundai motor model
 * date        : 2019.11.07
 * writer      : hansol kim
 */

package model;

import enumeration.DoorStatus;
import enumeration.MotorStatus;

public class HyundaiMotor {

	private Door door;
	private MotorStatus motorStatus;
	
	public HyundaiMotor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}
	
	private void moveHyundaiMotor(Direction direction) {
		
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
