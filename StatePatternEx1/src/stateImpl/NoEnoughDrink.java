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
		System.out.println("총 금액 : " + machine.getRetainedMoney() + "원");
	}

	@Override
	public void returnMoney(VendingMachine machine) {
		System.out.println(machine.getRetainedMoney()+"원이 반환되었습니다.");
		machine.setRetainedMoney(0); // 0원으로 초기화
		machine.setMachineState(NoEnoughMoney.getInstance());
	}

	@Override
	public void pushedButton(VendingMachine machine) {
		System.out.println("품절입니다.");		
	}

}
