/*
 * name        : HyundaiMotor.java
 * description : Hyundai motor model
 * date        : 2019.11.07
 * writer      : hansol kim
 */

package model;

import enumeration.Direction;
import enumeration.DoorStatus;
import enumeration.MotorStatus;

public class HyundaiMotor extends Motor{

	public HyundaiMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor(Direction direction) {
		// TODO: Hyundai Motor를 구동시킴
	}
}
