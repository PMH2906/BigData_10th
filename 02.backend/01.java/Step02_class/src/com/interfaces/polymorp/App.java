package com.interfaces.polymorp;

public class App {

	public static void main(String[] args) {
		Bitable shark = TeethShop.getTeeth("채식");
		shark.bite("토마토");
		
		shark = TeethShop.getTeeth("육식");
		shark.bite("안심스테이크");
	}

}
