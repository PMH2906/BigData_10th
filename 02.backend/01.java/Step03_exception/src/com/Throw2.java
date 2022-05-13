package com;

public class Throw2 {
	public static void main(String[] args) throws Exception{
		throw new Exception("이러면 어떡하지?"); // 컴파일도 안된다. 컴파일 오류
		
//		throw new RuntimeException("이건 왜 컴파일 되지?"); // UncheckedException
//	System.out.println("프로그램 종료");	
	}
}
