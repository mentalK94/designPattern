package client;

import model.VendingMachine;

public class Client {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		
		vendingMachine.insertMoney(1000);
		vendingMachine.insertMoney(500);
		vendingMachine.pushedButton();
		vendingMachine.pushedButton();
	}

}
