package ex3;

public class ElevatorController extends Subject {
	private int curFloor = 1;
	
	public void gotoFloor(int destination) {
		this.curFloor = destination;
		notifyObservers();
	}

	public int getCurFloor() {
		return this.curFloor;
	}
}
