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
		
		if(machine.getRetainedMoney() >= machine.getDrink().getPrice()) { // 머신안에 돈이 충분해진 경우
			machine.setMachineState(EnoughMoney.getInstance());
		}
		
		if(machine.getDrink().getStock() == 0) { // 재고가 없는 경우
			machine.setMachineState(NoEnoughDrink.getInstance());
		}
		
		System.out.println("총 금액 : " + machine.getRetainedMoney() + "원");
	}

	@Override
	public void returnMoney(VendingMachine machine) {
		System.out.println("ERROR : 금액이 충분하지 않습니다.");
	}

	@Override
	public void pushedButton(VendingMachine machine) {
		System.out.println("ERROR : 금액이 없습니다.");
	}

}
