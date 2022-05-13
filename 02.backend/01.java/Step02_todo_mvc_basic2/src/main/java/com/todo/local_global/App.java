package com.todo.local_global;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static 이 붙은 메서드 혹은 변수는 먼저 실행됨. 따라서 객체를 만들지 않아도 해당 객체의 static 메서드 or 변수에 접근 가능
		System.out.println(Mouse.countOfTail);
		
		Mouse jerry = new Mouse();
		System.out.println(jerry.countOfTail);
		// 참조변수 명보다는 클래스 명으로 사용하는 것을 권장. 즉 윗 부분으로 접근하는 것을 권함
		
		Mouse mickey = new Mouse();
		jerry.countOfTail = 2;
		System.out.println("미키의 꼬리" + mickey.countOfTail);
	}
	
//	public void how() {
//		System.out.println(Mouse.countOfTail); // 사용 가능. static변수 혹은 메서드는 어디서든 호출 가능
//	}
}
