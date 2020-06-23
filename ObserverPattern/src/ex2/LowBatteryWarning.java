package ex2;

public class LowBatteryWarning implements Observer {

	private Battery battery;
	private static final int LOW_BATTERY = 30; // low battery ±‚¡ÿ
	
	public LowBatteryWarning(Battery battery) {
		this.battery = battery;
	}
	
	@Override
	public void update() {
		int level = battery.getLevel();
		if(level <= LOW_BATTERY) {
			System.out.println("<WARNING> Low Battery : " + level);
		}
	}

}
