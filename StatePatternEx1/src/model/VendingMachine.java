package model;

import state.VendingMachineState;
import stateImpl.NoEnoughMoney;

public class VendingMachine {
	private Drink drink; // ����ӽ��� ������ ����
	private int retainedMoney; // ���� �ݾ�
	private VendingMachineState machineState; // ����ӽ� ����
	
	public VendingMachine() {
		this.drink = new Coke("coke", 3, 1200);
		retainedMoney = 0;
		machineState = NoEnoughMoney.getInstance();
	}
	
	// ���� �ִ� ����
	public void insertMoney(int money) {
		machineState.insertMoney(this, money);
	}
	
	// ���� ��ȯ�ϴ� ����
	public void returnMoney() {
		machineState.returnMoney(this);
	}
	
	// ������� �̴� ����
	public void pushedButton() {
		machineState.pushedButton(this);
	}
	
	// ����ӽ��� ������ �ִ� �ݾ�
	public int getRetainedMoney() {
		return retainedMoney;
	}
	
	// ����ӽ��� ������ �ִ� �ݾ� ����
	public void setRetainedMoney(int money) {
		this.retainedMoney = money;
	}
	
	// ����ӽſ� �ݾ��� �߰��Ǵ� ���
	public void addRetainedMoney(int money) {
		retainedMoney += money;
	}
	
	// ����ӽ� ���º���
	public void setMachineState(VendingMachineState state) {
		this.machineState = state;
	}
	
	public Drink getDrink() {
		return drink;
	}
}
