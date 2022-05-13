package com.overloading;

public class App {
	public static void main(String[] args) {
		Mouse jerry = new Mouse();
//		System.out.println(jerry.age); //age private 로 직접접근 불가능
		
		Mouse jay = new Mouse(15);
		
		Mouse jamie = new Mouse("제이미"); 
		
		Mouse joo = new Mouse(5,"주");
		
	}
}
