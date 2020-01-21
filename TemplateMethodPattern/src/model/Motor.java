package model;

import enumeration.Direction;
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
	
	// move메서드
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING)
			return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED)
			door.close();
		
		// motor와 door체크 후 이상 없으면 작업수행
		// 작업 : moveMotor메서드 수행 및 motorStatus에 status기록
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}

	protected void moveMotor(Direction direction) {
		
	}
}
