package com.overriding;

public class Mouse extends Animal{
	public String address;
	
	public void showAddr() {
		System.out.printf("%s는 %s에 살아",name,address);
	}
	
	public void showName() {
		System.out.println("내 이름은 비밀인데?");
	}
	public void showName(String yourName) {
		// 여기 name은 상위 클래스 Animal의 name을 상속받음
		System.out.printf("%s 안녕, 나는 %s야\n",yourName,name);
	}
}
