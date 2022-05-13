package com.todo.mvc;

public class Book {
	// Book 객체는 bookName과 author라는 필드(field) or property를 가질 수 있음
	private String bookName;
	private String author;
	
	// source -> Generate Constructor(생성자 함수) using ..
	// Book 객테의 생성을 도와주는 함수
	// new 키우드를 사용하여 호출
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
