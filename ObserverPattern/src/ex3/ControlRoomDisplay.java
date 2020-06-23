package ex3;

public class ControlRoomDisplay implements Observer {
	
	private ElevatorController elevatorController;

	public ControlRoomDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	@Override
	public void update() {
		// �߾������ǿ��� ������������ ��ġ�� ����Ѵ�.
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Control Room : " + curFloor);
	}
}
