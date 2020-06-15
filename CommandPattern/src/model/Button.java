package model;

public class Button {
	private Lamp lamp;
	
	public Button(Lamp lamp) {
		this.lamp = lamp;
	}
	
	public void pressed() {
		lamp.turnOn();
	}
}
