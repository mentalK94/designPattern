package ex2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject { // ���������� ���� �� �뺸����
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update();
		}
	}

}
