package model;

import command.Command;

public class Button {
	private Command command;
	
	public Button() {}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressed() {
		command.execute();
	}
}