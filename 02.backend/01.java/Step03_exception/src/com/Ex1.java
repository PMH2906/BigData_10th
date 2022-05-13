package com;

public class Ex1 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		for(int i=0;i<10;i++) {
			// 비트가 큰 float 에서 비트가 작은 int로 형변환 할 거니까 나머지 비트 버려도 된다는 의미로 (int) 적어줌
			result = number/(int)(Math.random()*10);
			System.out.println(result); // 0으로 나눌때 예외 처리 출력됨
		}
		

	}

}
