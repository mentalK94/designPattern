package robot;

public abstract class Robot {
	
	private String name; // 로봇 이름
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void attack(); // attack 추상메소드
	public abstract void move(); // move 추상메소드
}
