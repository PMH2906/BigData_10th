package com.todo.local_global;

public class Mouse {
	// Mouse라는 클래스의멤버(속성과 메서드)
	
	// static 키워드가 붙지 않은 속성 -> 인스턴스 변수, 객체(인스턴스)가 생성된 이후에만 접근 가능
	int age;
	String name;
	
	// static 키워드가 붙은 속성->static(정적)/ 클래스 변수, 객체가  생성되기 전에도 이용 가능
	static int countOfTail = 1;
	
	void sint() {
		System.out.println(name+"찍찍!");
	}
	void staticTest() { // 인스턴스 메서드를 호출한다는 것은 static 
		System.out.println(countOfTail); // static은 어디서나 접근이 가능
	}

}
