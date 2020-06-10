package stateImpl;

import model.Light;
import state.LightState;

public class OnState implements LightState{
	
	private static OnState onState = new OnState();
	private OnState() {}
	
	public static OnState getInstance() {
		return onState;
	}

	@Override
	public void onBtnPushed(Light light) {
		System.out.println("반응 없음");
	}

	@Override
	public void offBtnPushed(Light light) {
		light.setState(OffState.getInstance());
		System.out.println("LightOFF");
	}

}
