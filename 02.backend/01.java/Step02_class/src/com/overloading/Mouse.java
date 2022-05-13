package com.overloading;

public class Mouse {
	private int age;
	private String name;
	
	// 메서드 이름은 같지만 매개변수의 갯수는 물론 타입도 다른 메서드가 여러개 선언되는 것.
	public Mouse() {
	}
	
	
	public Mouse(String name) {
		super();
		this.name = name;
	}
	
	public Mouse(int age) {
		super();
		this.age = age;
	}
	
	public Mouse(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	

}
