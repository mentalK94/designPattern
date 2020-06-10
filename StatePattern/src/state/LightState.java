package state;

import model.Light;

public interface LightState {
	public void onBtnPushed(Light light);
	public void offBtnPushed(Light light);
}
