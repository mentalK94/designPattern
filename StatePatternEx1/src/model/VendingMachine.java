package model;

import state.VendingMachineState;
import stateImpl.NoEnoughMoney;

public class VendingMachine {
	private Drink drink; // 밴딩머신이 보유한 음료
	private int retainedMoney; // 보유 금액
	private VendingMachineState machineState; // 밴딩머신 상태
	
	public VendingMachine() {
		this.drink = new Coke("coke", 3, 1200);
		retainedMoney = 0;
		machineState = NoEnoughMoney.getInstance();
	}
	
	// 돈을 넣는 행위
	public void insertMoney(int money) {
		machineState.insertMoney(this, money);
	}
	
	// 돈을 반환하는 행위
	public void returnMoney() {
		machineState.returnMoney(this);
	}
	
	// 음료수를 뽑는 행위
	public void pushedButton() {
		machineState.pushedButton(this);
	}
	
	// 밴딩머신이 가지고 있는 금액
	public int getRetainedMoney() {
		return retainedMoney;
	}
	
	// 밴딩머신이 가지고 있는 금액 셋팅
	public void setRetainedMoney(int money) {
		this.retainedMoney = money;
	}
	
	// 밴딩머신에 금액이 추가되는 경우
	public void addRetainedMoney(int money) {
		retainedMoney += money;
	}
	
	// 밴딩머신 상태변경
	public void setMachineState(VendingMachineState state) {
		this.machineState = state;
	}
	
	public Drink getDrink() {
		return drink;
	}
}
