package com.interfaces.polymorp;

public class TeethShop {
	public static Bitable getTeeth(String food) {
		if (food.equals("육식")) return new BluntTeeth();
		else return new SharpTeeth();

	}
}
