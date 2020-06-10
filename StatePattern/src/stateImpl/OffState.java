package stateImpl;

import model.Light;
import state.LightState;

public class OffState implements LightState{

	private static OffState offState = new OffState();
	private OffState() {}
	
	public static OffState getInstance() {
		return offState;
	}
	
	@Override
	public void onBtnPushed(Light light) {
		light.setState(OnState.getInstance());
		System.out.println("LightON!");
	}

	@Override
	public void offBtnPushed(Light light) {
		System.out.println("반응 없음");
	}

}
