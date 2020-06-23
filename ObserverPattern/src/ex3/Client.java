package ex3;

public class Client {

	public static void main(String[] args) {
		ElevatorController elevatorController = new ElevatorController();
		
		Observer elevatorDisplay = new ElevatorDisplay(elevatorController);
		Observer floorDisplay = new FloorDisplay(elevatorController);
		Observer voiceNotice = new VoiceNotice(elevatorController);
		Observer controlRoomDisplay = new ControlRoomDisplay(elevatorController);
		
		elevatorController.attach(elevatorDisplay);
		elevatorController.attach(voiceNotice);
		elevatorController.attach(floorDisplay);
		elevatorController.attach(controlRoomDisplay);
		
		elevatorController.gotoFloor(5);
		elevatorController.gotoFloor(10);
		
	}

}
