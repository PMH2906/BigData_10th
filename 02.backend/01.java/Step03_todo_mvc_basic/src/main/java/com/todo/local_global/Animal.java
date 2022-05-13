package com.todo.local_global;

public class Animal { // 최상위 클래스인 object를 상속받음
	int age; // 인스턴스 변수 -> 객체를 생성해야만 사용가능한 변수
	static String kind; // static(class)변수
	
	void instangeMethod() {//인스턴스 메서드 
		System.out.println(age); // age 인스턴스 변수기 때문에 접근 가능
		// 인스턴스메서드를 호줄한다는 것은 객체가 이미 생성되었다는 것이기 때문에 
		
	}
	static void staticMethod() {
//		System.out.println(age); // 에러. static staticMethod()가 올라갈 시점에 인스턴스가 생성되지 않았을 수 있기때문에 접근 불가능
		
		System.out.println(kind); // 둘다 static 키워드가 있기 때문에 가능.
		
	}
}
