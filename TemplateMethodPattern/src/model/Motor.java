package model;

import enumeration.DoorStatus;
import enumeration.MotorStatus;

public abstract class Motor {

	private MotorStatus motorStatus;
	protected Door door;
	
	public Motor(Door door) {
		this.door = door;
		this.motorStatus = MotorStatus.STOPPED;
	}
	
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}
	
	protected void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
}
