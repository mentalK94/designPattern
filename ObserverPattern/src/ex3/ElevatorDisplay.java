package ex3;

public class ElevatorDisplay implements Observer {

	private ElevatorController elevatorController;
	
	public ElevatorDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}
	
	@Override
	public void update() {
		// 엘리베이터 내부에 엘리베이터의 위치를 표시함
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Elevator Display : " + curFloor);
	}

}
