package framework;

import concrete.ElevatorManager;
import enumeration.Direction;

public interface ElevatorScheduler {

	public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);

}
