/*
 * name        : HyundaiMotor.java
 * description : Hyundai motor model
 * date        : 2019.11.07
 * writer      : hansol kim
 */

package model;

import enumeration.Direction;

public class HyundaiMotor extends Motor{

	public HyundaiMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor(Direction direction) {
		// TODO: Hyundai Motor를 구동시킴
		System.out.println("Hyundai Motor 구동");
	}
}
