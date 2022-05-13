package com.todo.mvc;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 길이가 3인 정수형 배열
		int[] numbers = new int[3];
		//길이가 3 인 문자열 배열
		String[] names =new String[3];
		
		// 길이가 3인 Book 타입의 객체 배열
		Book[] books = new Book[3];
		Book book1 = new Book("노인과 바다", "허밍웨이");
		System.out.println(book1); //주소값 출력
		
		System.out.println(book1.getBookName());
		System.out.println(book1.getAuthor());
		
		books[0]=book1;
		books[1]= new Book("자바의 정성","남궁성");
		books[2] = new Book("다 큰 왕자","생택쥐페리");
		
		// 반복문으로 도서명과 저자명 출력
		for ( Book book: books) {
			System.out.println(book.getBookName());	
			System.out.println(book.getAuthor());
		}
			
	}

}
