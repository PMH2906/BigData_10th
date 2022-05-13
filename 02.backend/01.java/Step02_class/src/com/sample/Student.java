package com.sample;

// Student Class 선언
public class Student {
	// 멤버 변수(멤버 필드) : 학생이 가진 속성들 정의 혹은 선언
	int studentID; // 학번. int형은 선언하고 할당안하면 0이 들어감
	String studentName; // 학생이름
	int grade; // 학년
	String address; // 주소, 사는 곳

	// 기본 생성자(함수). default constructor. => 여기서는 Student()
	// 기본 생성자는 별도로 작성하지 않아도 생성됨.
	// 하지만 기본 생성자와 동일한 생성자를 만들면 기본 생성자는 사라짐. => 여기서는 line18에 생성
	// 따라서 기본 생성자를 명시
	public Student() {}
	
	// 학생 이름과 학년을 매개변수로 받는 생성자 작성
	public Student(int studentID,String studentName,int grade,String address) {
		// 갈색 변수 : 지역변수
		// 파랑색 변수 : member변수
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade =grade;
		this.address = address;			
	}
	
	
	
	// 멤버 메서드 : 학생이 할 수 있는 기능, 행위

	// 1. 학생의 이름과 주소만 출력하는 메서드
	// prototype : (접근제어자) 반환타입 메서드명 () {}
	// void : 반환 타입에 따로 없을 때 사용하는 키워드.
	// 현재 showStudent() 학생의 이름과 주소만 출력하고, 별도의 반환 타입이 없음 => void
	public void showsStudent() {
		System.out.println(studentName + ", " + address);
	}
	// ctrl + shift + f : 코드 정렬
	
	

}
