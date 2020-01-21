/*
 * name        : SamsungMotor.java
 * description : Samsung motor model
 * date        : 2020.01.21
 * writer      : hansol kim
 */

package model;

import enumeration.Direction;
import enumeration.DoorStatus;
import enumeration.MotorStatus;

public class SamsungMotor extends Motor{

	public SamsungMotor(Door door) {
		super(door);
	}
	
	private void moveSamsungMotor(Direction direction) {
		// TODO: Samsung Motor를 구동시킴
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING)
			return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED)
			door.close();
		
		// motor와 door체크 후 이상 없으면 작업수행
		// 작업 : moveSamsungMotor메서드 수행 및 motorStatus에 status기록
		moveSamsungMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
