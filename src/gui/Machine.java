package gui;

import java.util.ArrayList;

public class Machine {
	private String name;
	private int quantity;
	private float price;

	Machine() {
		name = "";
		price = 0;
		quantity = 0;
	}

	Machine(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int n) {
		quantity += n;
	}

	public float getPrice() {
		return price;
	}

	public float getTotalPriceAmount() {
		return (price * quantity);
	}

	public String toString() {
		return name + " " + quantity + " " + price;
	}

}