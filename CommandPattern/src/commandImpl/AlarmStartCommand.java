package commandImpl;

import command.Command;
import model.Alarm;

public class AlarmStartCommand implements Command {

	private Alarm alarm;
	
	public AlarmStartCommand(Alarm alarm) {
		this.alarm = alarm;
	}
	
	@Override
	public void execute() {
		alarm.start();
	}

}
