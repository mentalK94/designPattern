package concrete;

import enumeration.Direction;
import framework.ElevatorScheduler;

public class ResponseTimeScheduler implements ElevatorScheduler {
	
	private static ResponseTimeScheduler responseTimeScheduler;
	
	public static ResponseTimeScheduler getInstance() {
		if(responseTimeScheduler == null) {
			responseTimeScheduler = new ResponseTimeScheduler();
		}
		
		return responseTimeScheduler;
	}

	@Override
	public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
		// TODO Auto-generated method stub
		return 0;
	}

}
