package framework;

import java.util.Calendar;

import concrete.ResponseTimeScheduler;
import concrete.ThroughputScheduler;
import enumeration.SchedulingStrategyID;

public class SchedulerFactory {

	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
		
		ElevatorScheduler scheduler = null;
		switch (strategyID) {
		case RESPONSE_TIME:
			scheduler = new ResponseTimeScheduler();
			break;
		case THROUGHPUT:
			scheduler = new ThroughputScheduler();
			break;
		case DYNAMIC:
			int hour = Calendar.getInstance().get(Calendar.HOUR);
			if (hour < 12) { // ¿ÀÀü			
				scheduler = new ResponseTimeScheduler();
			}
			else {
				scheduler = new ThroughputScheduler();
			}
			break;
		}
		return scheduler;
	}
}
