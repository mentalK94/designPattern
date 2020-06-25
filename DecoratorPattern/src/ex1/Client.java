package ex1;

public class Client {

	public static void main(String[] args) {
		
		// �⺻ ����
		Display roadDisplay = new RoadDisplay();
		//roadDisplay.draw();
		
		// �⺻ ���� + ���� ǥ��
		Display roadWithLane = new LaneDecorator(roadDisplay);
		//roadWithLane.draw();
		
		// �⺻ ���� + ���뷮 ǥ��
		Display roadWithTraffic = new TrafficDecorator(roadDisplay);
		//roadWithTraffic.draw();
		
		// �⺻ ���� + ���� ǥ�� + ������ ǥ��
		Display roadWithLaneAndCrossing = new CrossingDecorator(new LaneDecorator(roadDisplay));
		roadWithLaneAndCrossing.draw();
		
		
		
	}

}
