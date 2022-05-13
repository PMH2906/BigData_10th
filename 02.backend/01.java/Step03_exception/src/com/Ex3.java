package com;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(2.5);
			System.out.println(3/0); //예외가 발생해서, 예외 인스턴스(new ArithmeticException())가 생성되는 부분
			System.out.println(3); // line 9에서 예외처리가 되어 catch문으로 바로 들어가서 이 line은 실행 안 됨
		} catch (Exception e) {
			//코드 자유롭게 작성 가능
			// e의 인스턴스 자료형이 ArithmeticException이라면 true
			
			if (e instanceof ArithmeticException) {
				System.out.println(e instanceof ArithmeticException);//true
				// 참조변수 exception 내부에 들어있는 실제 인스턴스가 ArithmeticException클래스의 인스턴스인지 확인하는 연산자
				// 실제 인스턴스가 ArithmeticException이면 해당 조건식의 결과값은 true, 아니면 false
				
				System.out.println(e instanceof NullPointerException);//false
			}
		System.out.println(4);
		}
		System.out.println(5);
	}
}
