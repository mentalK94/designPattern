package ex2;

public class Client {

	public static void main(String[] args) {
		
		Battery battery = new Battery();
		
		BatteryLevelDisplay batteryLevelDisplay = new BatteryLevelDisplay(battery);
		LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);
		
		battery.attach(batteryLevelDisplay);
		battery.attach(lowBatteryWarning);
		battery.detach(lowBatteryWarning);
		
		
		battery.consume(20);
		battery.consume(20);
		battery.consume(30);
		battery.consume(5);
	}

}
