package ex3;

public class FloorDisplay implements Observer{
	private ElevatorController elevatorController;
	
	public FloorDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	@Override
	public void update() {
		// ������������ ��ġ�� �ǹ� ������ ���������� �� ǥ�� ��ġ�� ����Ѵ�.
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Floor Display : " + curFloor);
	}
	
	
}
