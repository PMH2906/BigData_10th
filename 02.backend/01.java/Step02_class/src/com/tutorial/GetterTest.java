package com.tutorial;

public class GetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// person 인스턴스의 필드값 조회
		Person joo = new Person();
		joo.setName("주현영");
		System.out.println(joo.getName());
		System.out.println(joo.getAge());
		
		// 생성자 함수 제외하고,
		// setter()를 호출하지 않아도, 필드값 설정할 수 있음
		// getter()를 호출하지 않아도, 필드값 접근 가능
		
	}

}
