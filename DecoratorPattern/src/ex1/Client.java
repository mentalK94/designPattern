package ex1;

public class Client {

	public static void main(String[] args) {
		
		// 기본 도로
		Display roadDisplay = new RoadDisplay();
		//roadDisplay.draw();
		
		// 기본 도로 + 차선 표시
		Display roadWithLane = new LaneDecorator(roadDisplay);
		//roadWithLane.draw();
		
		// 기본 도로 + 교통량 표시
		Display roadWithTraffic = new TrafficDecorator(roadDisplay);
		//roadWithTraffic.draw();
		
		// 기본 도로 + 차선 표시 + 교차로 표시
		Display roadWithLaneAndCrossing = new CrossingDecorator(new LaneDecorator(roadDisplay));
		roadWithLaneAndCrossing.draw();
		
		
		
	}

}
