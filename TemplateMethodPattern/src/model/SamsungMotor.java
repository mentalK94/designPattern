/*
 * name        : SamsungMotor.java
 * description : Samsung motor model
 * date        : 2020.01.21
 * writer      : hansol kim
 */

package model;

import enumeration.Direction;

public class SamsungMotor extends Motor{

	public SamsungMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor(Direction direction) {
		// TODO: Samsung Motor를 구동시킴
		System.out.println("Samsung Motor 구동");
	}
}
