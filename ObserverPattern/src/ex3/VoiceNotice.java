package ex3;

public class VoiceNotice implements Observer{
	
	private ElevatorController elevatorController;

	public VoiceNotice(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	@Override
	public void update() {
		// ������������ ��ġ�� ���������� ���ο��� �������� �ȳ�
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Voice Notice : " + curFloor);
	}
}
