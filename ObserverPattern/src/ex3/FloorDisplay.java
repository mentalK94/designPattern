package ex3;

public class FloorDisplay implements Observer{
	private ElevatorController elevatorController;
	
	public FloorDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	@Override
	public void update() {
		// 엘리베이터의 위치를 건물 내부의 엘리베이터 층 표시 장치에 출력한다.
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Floor Display : " + curFloor);
	}
	
	
}
