package com.todo.mvc;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���̰� 3�� ������ �迭
		int[] numbers = new int[3];
		//���̰� 3 �� ���ڿ� �迭
		String[] names =new String[3];
		
		// ���̰� 3�� Book Ÿ���� ��ü �迭
		Book[] books = new Book[3];
		Book book1 = new Book("���ΰ� �ٴ�", "��ֿ���");
		System.out.println(book1); //�ּҰ� ���
		
		System.out.println(book1.getBookName());
		System.out.println(book1.getAuthor());
		
		books[0]=book1;
		books[1]= new Book("�ڹ��� ����","���ü�");
		books[2] = new Book("�� ū ����","�������丮");
		
		// �ݺ������� ������� ���ڸ� ���
		for ( Book book: books) {
			System.out.println(book.getBookName());	
			System.out.println(book.getAuthor());
		}
			
	}

}
