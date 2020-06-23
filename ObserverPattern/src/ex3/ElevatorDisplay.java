package ex3;

public class ElevatorDisplay implements Observer {

	private ElevatorController elevatorController;
	
	public ElevatorDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}
	
	@Override
	public void update() {
		// ���������� ���ο� ������������ ��ġ�� ǥ����
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Elevator Display : " + curFloor);
	}

}
