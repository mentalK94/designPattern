package ex1;

public class TwoButtonController {
	
	private Command command1;
	private Command command2;
	
	public TwoButtonController() {}
	
	public void setCommand(Command command1, Command command2) {
		this.command1 = command1;
		this.command2 = command2;
	}
	
	public void btn1Pressed() {
		command1.execute();
	}
	
	public void btn2Pressed() {
		command2.execute();
	}

}
