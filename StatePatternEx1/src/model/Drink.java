package model;

public abstract class Drink {
	private String name;
	private int price;
	private int stock;

	public Drink(String name, int stock, int price) {
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void dispense() {
		stock--;
	}

}
