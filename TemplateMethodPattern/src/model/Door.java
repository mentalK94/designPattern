/*
 * name        : Door.java
 * description : Door 모델
 * date        : 2019.11.07
 * writer      : hansol kim
 */

package model;

import enumeration.DoorStatus;

public class Door {
	
	private DoorStatus doorStatus;
	
	public Door() {
		doorStatus = DoorStatus.CLOSED;
	}
	
	// DoorStatus 상태반환
	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	// close 메서드
	public void close() {
		doorStatus = DoorStatus.CLOSED;
	}
	
	// open 메서드
	public void open() {
		doorStatus = DoorStatus.OPENED;
	}	
}
