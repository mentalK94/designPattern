package ex1;

public class Client {

	public static void main(String[] args) {
		RoadDisplay roadDisplay = new RoadDisplay();
		roadDisplay.draw();
		
		RoadDisplay roadDisplay2 = new RoadDisplayWithLane();
		roadDisplay2.draw();
	}

}
