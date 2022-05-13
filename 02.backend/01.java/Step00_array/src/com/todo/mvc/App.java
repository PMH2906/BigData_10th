package com.todo.mvc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentId1=1;
		int studentId2=2;
//		int [] studentIDs = new int[3]; // 길이가 3인 정수형 배열 선언과 초기화

//		length를 하나의 property로 보면 됨
//		System.out.println(studentIDs.length);
		
		int[] studentIDs = new int[] {studentId1, studentId2};
		String[] studentNames = new String[3];
//		배열 요소 추가
		studentNames[0] = "A";
		studentNames[1] = "A";
		studentNames[2] = "A";
				
				
//		배열 길이 확인
		System.out.println(studentIDs.length);
//		studentIDs 자체 줄력
		System.out.println(studentIDs); // 참조타입은 주소 값을 가지고 있음

//		toString() 이라는 메서드 호출
		System.out.println(studentIDs.toString());
		
		System.out.println(studentIDs[0]);
		System.out.println(studentIDs[1]);
		
		for (String studentName : studentNames) {
			System.out.println(studentName);
		}
		
	}

}
