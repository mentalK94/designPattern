/*
 * name        : ThroughputScheduler.java
 * description : Throughput Scheduler
 * date        : 2020.02.13
 * writer      : hansol kim
 */

package concrete;

import enumeration.Direction;
import framework.ElevatorScheduler;

public class ThroughputScheduler implements ElevatorScheduler {

	private static ThroughputScheduler throughputScheduler;
	
	public static ThroughputScheduler getInstance() {
		if(throughputScheduler == null) {
			throughputScheduler = new ThroughputScheduler();
		}
		
		return throughputScheduler;
	}
	
	public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
		// TODO Auto-generated method stub
		return 0;
	}

}
