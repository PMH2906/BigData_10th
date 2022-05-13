package com.extend;

public class Animal {
	private int age;
	private String color;
	
	public Animal() {
		super();
	}
	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
		System.out.println("Animal(age, color) 호출");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// void sing
	public void sing() {
		System.out.println("동물은 어떻게 울지");
	}
}
