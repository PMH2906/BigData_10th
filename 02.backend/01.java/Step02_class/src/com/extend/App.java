package com.extend;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal anAnimal = new Animal();
		anAnimal.sing();
		
//		Mouse m= new Mouse(15, "제리", "서울");
//		m.setAge(10);
//		m.setColor("검색");
		
//		m.getAddress();
		
		Mouse jerry = new Mouse(15,"제리","뉴욕");
		jerry.sing(); //jerry야 물어봐
		System.out.println(jerry.toString());
	}

}
