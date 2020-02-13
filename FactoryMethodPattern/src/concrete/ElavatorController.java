/*
 * name        : ElavatorController.java
 * date        : 2020.02.13
 * writer      : hansol kim
 */

package concrete;

public class ElavatorController {

	private int id; // elevator id
	private int currentFloor; // 현재 층
	
	public ElavatorController(int id) {
		this.id = id;
		this.currentFloor = 1;
	}

	public void gotoFloor(int destination) {		
		System.out.println("["+ id + "]번째 엘리베이터가 현재 " + currentFloor + "층에 있습니다.");
		
		currentFloor = destination;
		System.out.println(id + "번째 엘리베이터가 현재 " + currentFloor + "층에 도착했습니다.");
	}

}
