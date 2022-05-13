package com.reference;

public class App {

	public static void main(String[] args) {
		Student student1 = new Student("박서준",20);
		Student student2 = new Student("한소희",20);
		
		System.out.println(student1.getName());
//		Student Class 필드 변수에 private 써주면 직접 접근 불가능
//		System.out.println(student1.name, student1.age);
		
		System.out.println(student1);
		System.out.println(student2);
		
		student1= student2; // student2의 인스턴스가 위치하는 heap공간은 garbage collector가 없애줌 
		System.out.println(student1.getName()); // 한소희 나옴
	}

}
