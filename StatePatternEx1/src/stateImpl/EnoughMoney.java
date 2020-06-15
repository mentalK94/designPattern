package stateImpl;

import model.VendingMachine;
import state.VendingMachineState;

public class EnoughMoney implements VendingMachineState{
	
	private static EnoughMoney enoughMoney = new EnoughMoney();
	private EnoughMoney() {}

	public static EnoughMoney getInstance() {
		return enoughMoney;
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
		System.out.println("������� ���Խ��ϴ�.");
		machine.setRetainedMoney(machine.getRetainedMoney()-machine.getDrink().getPrice());
		machine.getDrink().dispense(); // ����� ��� 1 ����
		
		if(machine.getRetainedMoney() < machine.getDrink().getPrice()) {
			machine.setMachineState(NoEnoughMoney.getInstance());
		}
		
		if(machine.getDrink().getStock() < 1) {
			machine.setMachineState(NoEnoughDrink.getInstance());
		}
		
		System.out.println("���� ���� �ݾ� : " + machine.getRetainedMoney());
	}

}
