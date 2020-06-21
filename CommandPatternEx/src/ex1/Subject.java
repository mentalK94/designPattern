package ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
}
