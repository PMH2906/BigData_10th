package com.interfaces.advanced;

public class Audio {
	
	void musicPlay(Playable lp) {
		//매개변수에서의 다형성 + 인터페이스(Playable)와 다형성
		//Playable lp = new Park;
		//(사위 타입)       (하위타입)
		lp.play();
	}
	
}
