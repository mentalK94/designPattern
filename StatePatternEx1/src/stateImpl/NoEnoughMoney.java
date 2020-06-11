package stateImpl;

import model.VendingMachine;
import state.VendingMachineState;

public class NoEnoughMoney implements VendingMachineState{
	
	private static NoEnoughMoney noEnoughMoney = new NoEnoughMoney();
	private NoEnoughMoney() {}

	public static NoEnoughMoney getInstance() {
		return noEnoughMoney;
	}

	@Override
	public void insertMoney(VendingMachine machine, int money) {
		machine.addRetainedMoney(money);
		
		if(machine.getRetainedMoney() >= machine.getDrink().getPrice()) { // �ӽžȿ� ���� ������� ���
			machine.setMachineState(EnoughMoney.getInstance());
		}
		
		if(machine.getDrink().getStock() == 0) { // ��� ���� ���
			machine.setMachineState(NoEnoughDrink.getInstance());
		}
		
		System.out.println("�� �ݾ� : " + machine.getRetainedMoney() + "��");
	}

	@Override
	public void returnMoney(VendingMachine machine) {
		System.out.println("ERROR : �ݾ��� ������� �ʽ��ϴ�.");
	}

	@Override
	public void pushedButton(VendingMachine machine) {
		System.out.println("ERROR : �ݾ��� �����ϴ�.");
	}

}
