package state;

import model.VendingMachine;

public interface VendingMachineState {
	
	// 돈을 넣는 행위
	public void insertMoney(VendingMachine machine, int money);
	
	// 돈을 반환하는 행위
	public void returnMoney(VendingMachine machine);
	
	// 음료 버튼을 누르는 행위
	public void pushedButton(VendingMachine machine);
}
