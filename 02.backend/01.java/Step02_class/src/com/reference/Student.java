package com.reference;

public class Student {
	// name, age 필드
	private String name;
	private int age;

	// 기본 생성자, 두개의 필드 전부를 매개변수로 받는 생성자
	public Student(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
