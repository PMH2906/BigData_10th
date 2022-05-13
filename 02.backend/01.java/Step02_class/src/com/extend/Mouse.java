package com.extend;

// 클래스1 extends 클래스명2 : 클래스1은 클래스2를 확장한 클래스이다.
// 즉, Mouse는 Animal을 확장한 클래스이다
public class Mouse extends Animal{
	// Mouse is an Animal 성립
	// Mouse 는 Animal 이다.
	// Animal 클래스가 가진 특성을 물려받을 수 있다. + 자신만의 특성을 확장할 수도 있다.
	// 특성 : 필드와 메서드
	
	private String address;
	
	public Mouse(int age, String color, String address) {
		// age, color 필드는 상위 클래스인 Animal이 가지고 있기 때문애
		// 해당 필드의 초기화는 해당 클래스에게 맡김
		super(age, color); // 상위 클래스의 생성자 호출
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
//	public String getAddr() {
//		return address;
//	}
	
	// 상위 클래스 Animal의 sing() 메서드를 재정의(override)
//	public void sing() {
//		System.out.println("찍찍");
//	}
	
	// 상속 
	@Override // 해당 메서드가 overriding 되었다는 것을 의미하는 표기법
	public void sing() {
		// TODO Auto-generated method stub
		super.sing();
		System.out.println("찍찍");
	}
	
	@Override //// 상위클래스로 올라가서 toString() 메서드 재정의
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString(); 
		return super.getColor() +" "+super.getAge()+" "+address;
	}
	
	
}
