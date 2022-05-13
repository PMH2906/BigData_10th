package com.todo.mvc;

public class Book {
	// Book ��ü�� bookName�� author��� �ʵ�(field) or property�� ���� �� ����
	private String bookName;
	private String author;
	
	// source -> Generate Constructor(������ �Լ�) using ..
	// Book ������ ������ �����ִ� �Լ�
	// new Ű��带 ����Ͽ� ȣ��
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
