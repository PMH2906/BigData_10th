package com.basic;

public class App {

	public static void main(String[] args) {
		Mouse mini = new Mouse(10, "미니", "하와이", "구직중");
		Mouse mickey = new Mouse(25, "미키", "런던", "맨체스터 유나이티드");
		Mouse jay = new Mouse(15, "제이", "상하이", "텐센트");
		Mouse jerry = new Mouse(20, "제리", "도쿄", "라인");
		Mouse jamie = new Mouse(40, "제이미", "대한민국", "삼성");
		
		//Mouse 배열 생성 후 추가
//		Mouse[] mice = new Mouse[5];
//		mice[0] = mini;
//		mice[1] = mickey;
//		mice[2] = jay;
//		mice[3] = jerry;
//		mice[4] = jamie;
		
		Mouse[] mice = {mini,mickey,jay, jerry, jamie};
		
		for (Mouse mouse : mice) {
			System.out.println(mouse);
		}
		System.out.println();
		
		// 쥐(jay)의 정보 수정,jay거주지를 프랑스, 회사를 루브르 박물관으로 변경 후 jay정보 확인
		System.out.println("쥐 정보 수정");
		jay.setAddress("프랑스");
		jay.setCompany("루브르 박물관");
		System.out.println(mice[2]);
		
		// jerry의 정보 조회,jerry가 다니는 회사 조회
		System.out.println("jerry의 회사:"+mice[3].getCompany());
		System.out.println();
		
		// 쥐의 정보 삭제, jay, jamie의 정보를 삭제
		mice[2] = null;
		System.out.println(mice[2]);
		
		// 전제 쥐 정보 조회
		for (Mouse mouse : mice) {
			System.out.println(mouse);
		}
		System.out.println(mice.length); // 정보를 삭제해도 길이는 그대로 유지되고, null의 데이터가 존재하는 상태가 됨
	}

}
