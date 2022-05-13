package com.polymorphism2;

public class App {
	public static void main(String[] args) {
		
		// 참조변수가 사용할 수 있는 멤버의 개수는 참조하고 있는 인스턴스 멤버의 갯수보다 같거나 작다.
		// Animal 타입의 참조변수 animal로 Whale타입의 인스턴스 생성
		Animal animal = new Whale();
		animal.name = "Animal 타입으로";
		
		Whale whale = new Whale();
		whale.name = "Whale 타입으로";
		whale.sing();
		whale.swim();
		
		animal.sing();
		
//		animal.swim(); // 상위 타입의 참조변수로는 하위타입의 멤버 
		
		// 반대도 가능할까?
//		Whale w = new Animal(); // 불가능!!!
	}
}
