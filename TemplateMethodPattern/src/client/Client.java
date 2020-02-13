package client;

import enumeration.Direction;
import model.Door;
import model.HyundaiMotor;
import model.Motor;
import model.SamsungMotor;

public class Client {

	public static void main(String[] args) {
		Door door = new Door();
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
		hyundaiMotor.move(Direction.UP);
		
		SamsungMotor samsungMotor = new SamsungMotor(door);
		samsungMotor.move(Direction.DOWN);
	}

}
