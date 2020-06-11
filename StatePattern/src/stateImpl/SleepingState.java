package stateImpl;

import model.Light;
import state.LightState;

public class SleepingState implements LightState{
	
	private static SleepingState sleepingState = new SleepingState();
	private SleepingState() {}
	
	public static SleepingState getInstance() {
		return sleepingState;
	}
	@Override
	public void onBtnPushed(Light light) {
		light.setState(OnState.getInstance());
		System.out.println("Light On Back!");		
	}

	@Override
	public void offBtnPushed(Light light) {
		light.setState(OffState.getInstance());
		System.out.println("Light Off Back!");		
	}

}
