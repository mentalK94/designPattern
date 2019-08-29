package robot;

public abstract class Robot {
	
	private String name; // �κ� �̸�
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void attack(); // attack �߻�޼ҵ�
	public abstract void move(); // move �߻�޼ҵ�
}
