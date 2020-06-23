package ex3;

public class ControlRoomDisplay implements Observer {
	
	private ElevatorController elevatorController;

	public ControlRoomDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	@Override
	public void update() {
		// 중앙통제실에서 엘리베이터의 위치를 출력한다.
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Control Room : " + curFloor);
	}
}
