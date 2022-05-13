package com.tutorial;

public class SetterTest {
	public static void main(String[] args) {
		// 학생 인스턴스에 속성(필드)를 설정하는 방법
		// 2. setter()를 통한 필드값 설정, setting을 해주는 사람 (er) => setter

		// 디폴트 생성자로 person 인스턴스 1개 생성
		Person park = new Person();
		park.setName("nana");

		park.setAge(20);

		System.out.println(park.showPerson());

	}

}
