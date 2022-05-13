package com.sample;

// App 이라는 클래스 정의
// 자바는 모든 것이 함수가 아니라 메서드 why? 어떤 클래스 안에 선언되어서. 어떤 객체가 선언되고 메서드를 사용함
// ex) App이라는 클래스 안에 main메서드가 선언됨
public class App {
	// App 클래스가 가진 멤버 메서드 main()
	// 코드가 실헹되면 eclips가 내부적으로 main()을 호출함.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(1,"홈",1,"서울"); // 인스턴스.
		
		s.showsStudent();
		
		// 학생 인스턴스에 속성(필드)을 설정하는 방법
		// 1. 생성자 함수(constructor)를 통한 설정

	}

}
