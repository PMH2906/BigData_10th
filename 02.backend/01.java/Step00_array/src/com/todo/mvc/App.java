package com.todo.mvc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentId1=1;
		int studentId2=2;
//		int [] studentIDs = new int[3]; // ���̰� 3�� ������ �迭 ����� �ʱ�ȭ

//		length�� �ϳ��� property�� ���� ��
//		System.out.println(studentIDs.length);
		
		int[] studentIDs = new int[] {studentId1, studentId2};
		String[] studentNames = new String[3];
//		�迭 ��� �߰�
		studentNames[0] = "A";
		studentNames[1] = "A";
		studentNames[2] = "A";
				
				
//		�迭 ���� Ȯ��
		System.out.println(studentIDs.length);
//		studentIDs ��ü �ٷ�
		System.out.println(studentIDs); // ����Ÿ���� �ּ� ���� ������ ����

//		toString() �̶�� �޼��� ȣ��
		System.out.println(studentIDs.toString());
		
		System.out.println(studentIDs[0]);
		System.out.println(studentIDs[1]);
		
		for (String studentName : studentNames) {
			System.out.println(studentName);
		}
		
	}

}
