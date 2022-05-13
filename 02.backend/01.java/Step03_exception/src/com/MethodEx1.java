package com;

public class MethodEx1 {
	// MethodEx1 의 클래스 멤버 메서드
	// throws Exception : method1()의 예외 처리를 미루는 것
	//main에서 미루면 결국 예외처리는 아무도 안 해줌
	public static void main(String[] args) throws Exception {
		method1();
	}
	// MethodEx1 멤버 메서드
	// throws Exception : method2()의 예외 처리를 미루는 것
	static void method1() throws Exception{
		method2();
		System.out.println("method1 호출");
	}
	//MethodEx1 멤버 메서드 3
	// throws Exception : 예외 처리를 미루는 것
	static void method2() throws Exception {// method2()내부에서 예외가 발생하면,
		// 해당 예외에 대한 예외 처리를 method2()를 호출부에서 처리하도록 책임을 떠넘김.
		throw new Exception("예외를 고의로 발생시킴");
	}

}
