package stateImpl;

import model.VendingMachine;
import state.VendingMachineState;

public class NoEnoughDrink implements VendingMachineState{
	
	private static NoEnoughDrink noEnoughDrink = new NoEnoughDrink();
	private NoEnoughDrink() {}

	public static NoEnoughDrink getInstance() {
		return noEnoughDrink;
	}

	@Override
	public void insertMoney(VendingMachine machine, int money) {
		machine.addRetainedMoney(money);
		System.out.println("�� �ݾ� : " + machine.getRetainedMoney() + "��");
	}

	@Override
	public void returnMoney(VendingMachine machine) {
		System.out.println(machine.getRetainedMoney()+"���� ��ȯ�Ǿ����ϴ�.");
		machine.setRetainedMoney(0); // 0������ �ʱ�ȭ
		machine.setMachineState(NoEnoughMoney.getInstance());
	}

	@Override
	public void pushedButton(VendingMachine machine) {
		System.out.println("ǰ���Դϴ�.");		
	}

}
