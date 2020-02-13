/*
 * name        : ElavatorController.java
 * date        : 2020.02.13
 * writer      : hansol kim
 */

package concrete;

public class ElavatorController {

	private int id; // elevator id
	private int currentFloor; // ���� ��
	
	public ElavatorController(int id) {
		this.id = id;
		this.currentFloor = 1;
	}

	public void gotoFloor(int destination) {		
		System.out.println("["+ id + "]��° ���������Ͱ� ���� " + currentFloor + "���� �ֽ��ϴ�.");
		
		currentFloor = destination;
		System.out.println(id + "��° ���������Ͱ� ���� " + currentFloor + "���� �����߽��ϴ�.");
	}

}
