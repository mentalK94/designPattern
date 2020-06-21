package client;

import command.Command;
import commandImpl.AlarmStartCommand;
import commandImpl.LampOnCommand;
import model.Alarm;
import model.Button;
import model.Lamp;

public class Client {

	public static void main(String[] args) {
		Button button = new Button();
		Command alarmStartCommand = new AlarmStartCommand(new Alarm());
		Command lampOnCommand = new LampOnCommand(new Lamp());
		

		button.setCommand(alarmStartCommand);
		button.pressed();
		button.setCommand(lampOnCommand);
		button.pressed();
		
	}

}
