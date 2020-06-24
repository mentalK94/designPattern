package ex1;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		
		Command muteCommand = new MuteCommand(tv);
		Command powerCommand = new PowerCommand(tv);
		
		TwoButtonController buttonController = new TwoButtonController();
		buttonController.setCommand(powerCommand, muteCommand);
		
		buttonController.btn1Pressed();
		buttonController.btn2Pressed();
		buttonController.btn1Pressed();
		buttonController.btn2Pressed();
		
		
	}

}
