package ex3;

public class VoiceNotice implements Observer{
	
	private ElevatorController elevatorController;

	public VoiceNotice(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	@Override
	public void update() {
		// 엘리베이터의 위치를 엘리베이터 내부에서 음성으로 안내
		int curFloor = elevatorController.getCurFloor();
		System.out.println("Voice Notice : " + curFloor);
	}
}
