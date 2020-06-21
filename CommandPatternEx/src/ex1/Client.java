package ex1;

public class Client {
	
	public static void main(String[] args) {
		Battery battery = new Battery();
		BatteryLevelDisplay batteryLevelDisplay = new BatteryLevelDisplay(battery);
		LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);
		
		battery.addObserver(batteryLevelDisplay);
		battery.addObserver(lowBatteryWarning);
		
		battery.consume(10);
		battery.consume(30);
		battery.consume(10);
		battery.consume(20);
		battery.consume(15);
	}
}
