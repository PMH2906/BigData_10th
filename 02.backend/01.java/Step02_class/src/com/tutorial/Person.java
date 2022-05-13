package com.tutorial;

public class Person {
	//멤버변수
	String name;
	int age;
	
	// 기본 생성자
	// public Person() {}
	public Person() {
//		super();
	}
	// 생성자 함수
	public Person(String name, int age) {
		this.name = name;
		this.age=age;
	}
	// setter, getter
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	// 멤버 메서드
	
	public int getAge() {
		return age;
	}
	
	public String showPerson() {
//		System.out.println(name+" "+age);
		return name+" "+age; // 문자열과 숫자를 더해주면 = 문자열임
	}
	
}
