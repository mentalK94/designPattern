/*
 * name        : ElevatorManager.java
 * description : Elevator Manager
 * date        : 2020.02.13
 * writer      : hansol kim
 */

package concrete;

import java.util.ArrayList;
import java.util.List;

import enumeration.Direction;
import enumeration.SchedulingStrategyID;
import framework.ElevatorScheduler;
import framework.SchedulerFactory;

public class ElevatorManager {
	
	private List<ElavatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
		controllers = new ArrayList<ElavatorController>(controllerCount);
		
		for(int i=0; i<controllerCount; i++) {
			ElavatorController elavatorController = new ElavatorController(i);
			controllers.add(elavatorController);
		}
		
		this.strategyID = strategyID;		
	}
	
	public void setStrategyID(SchedulingStrategyID strategyID) {
		this.strategyID = strategyID;
	}
	
	public void requestElevator(int destination, Direction direction) {
		
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
		
	}
}
