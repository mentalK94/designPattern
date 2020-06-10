package model;

import state.LightState;
import stateImpl.OffState;

public class Light {
	private LightState lightState; // ON, OFF
	
	public Light() {
		lightState = new OffState(); // √ ±‚ OFF
	}
	
	public void onBtnPushed() {
		lightState.onBtnPushed(this);
	}
	
	public void offBtnPushed() {
		lightState.offBtnPushed(this);
	}

	public void setState(LightState lightState) {
		this.lightState = lightState;
	}
}
