package com;

public class Ex2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		for(int i=0;i<10;i++) {
			try {
				// 비트가 큰 float 에서 비트가 작은 int로 형변환 할 거니까 나머지 비트 버려도 된다는 의미로 (int) 적어줌
				result = number/(int)(Math.random()*10);
				System.out.println(result); // 0으로 나눌때 예외 처리 출력됨
			}catch(ArithmeticException exception){
				//exception이라는 인스턴스는 코드의 실행 과정에서 0으로 나누는 예외가 발생하면 그때
				//new ArithmeticException(); 인스턴스 생성하고, exception 변수에 초기화.
				//exception=new ArithmeticException();이 이루어짐.
				
				//즉 0으로 나누는 예외가 발생하기 전까지는 exception 변수는 선언만 되어있는 상태인데,
				//0으로 나누는 예외가 발생하면 그때 인스턴스가 생성되어 exception 변수가 초기화됨.
				System.out.println("손님, 0으로 나누시면 안됩니다.");
				exception.printStackTrace(); 
				//=> stack에 쌓인 에러 구문을 출력해주는것
				//java.lang.ArithmeticException: / by zero
				//        at com.Ex2.main(Ex2.java:10)
				System.out.println(exception.getMessage());
				// => / by zero
			}
		}
	}
}
