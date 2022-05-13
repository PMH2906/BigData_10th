package com.basic;

import java.util.ArrayList;

public class ArrayListTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Mouse mini = new Mouse(10, "미니", "하와이", "구직중");
		Mouse mickey = new Mouse(25, "미키", "런던", "맨체스터 유나이티드");
		Mouse jay = new Mouse(15, "제이", "상하이", "텐센트");
		Mouse jerry = new Mouse(20, "제리", "도쿄", "라인");
		Mouse jamie = new Mouse(40, "제이미", "대한민국", "삼성");

		// 중복이 허용, 순서가 있음, 서로 다른 타입 관리 가능(하지만 추천되지 않음)
		// ArrayList 객체 생성
		// Generic
		ArrayList<Mouse> list = new ArrayList<>(); //ctrl + shift + o
		list.add(mini);
		list.add(mickey);
		list.add(jay);
		list.add(jerry);
		list.add(jamie);
	
		System.out.println(list.size());
		
		// 1 번째 인덱스 조회
		System.out.println(list.get(0));
		
		// 3 번째 요소 삭제
		System.out.println(list.remove(2)+"요소삭제");
		
		//전체 요소 조회
		System.out.println("전체 요소 조회");
		// Mouse로 형변환(object가 더 큰 비트 차지)
		for (Object object : list) {
			System.out.println((Mouse)object);
		}
	}

}
