package state;

import model.VendingMachine;

public interface VendingMachineState {
	
	// ���� �ִ� ����
	public void insertMoney(VendingMachine machine, int money);
	
	// ���� ��ȯ�ϴ� ����
	public void returnMoney(VendingMachine machine);
	
	// ���� ��ư�� ������ ����
	public void pushedButton(VendingMachine machine);
}
