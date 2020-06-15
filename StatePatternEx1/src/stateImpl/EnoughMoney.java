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
		System.out.println("음료수가 나왔습니다.");
		machine.setRetainedMoney(machine.getRetainedMoney()-machine.getDrink().getPrice());
		machine.getDrink().dispense(); // 음료수 재고 1 소진
		
		if(machine.getRetainedMoney() < machine.getDrink().getPrice()) {
			machine.setMachineState(NoEnoughMoney.getInstance());
		}
		
		if(machine.getDrink().getStock() < 1) {
			machine.setMachineState(NoEnoughDrink.getInstance());
		}
		
		System.out.println("현재 남은 금액 : " + machine.getRetainedMoney());
	}

}
