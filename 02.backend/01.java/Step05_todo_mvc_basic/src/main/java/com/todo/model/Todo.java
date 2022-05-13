package com.todo.model;

import java.time.LocalDate;

public class Todo {
	
	// 멤버  : 해당 클래스가 가지고 있는 구성원(속성, 메서드)
	// 멤버 필드(멤버 변수)
	private Boolean isCompleted; // 기본값은 False임
	private Long todoNumbers;
	private String todoTitles;
	private String todoDescriptions;
	private LocalDate todoDueDate; //참조타입
	
	// 생성자 오버로딩
	public Todo(String todoTitles, String todoDescriptions, LocalDate todoDueDate) {
		super();
		this.todoTitles = todoTitles;
		this.todoDescriptions = todoDescriptions;
		this.todoDueDate = todoDueDate;
	}
	public Todo() {
		super();
	}
	// 셍성자 
	public Todo(Long todoNumbers, String todoTitles, String todoDescriptions,
			LocalDate todoDueDate) {
		super();

		this.todoNumbers = todoNumbers;
		this.todoTitles = todoTitles;
		this.todoDescriptions = todoDescriptions;
		this.todoDueDate = todoDueDate;
		this.isCompleted =false;
	}

	//	public String showTodo() {
//		return todoNumbers + " 번째로 해야할 일은 : " + todoTitles+"이고, 할 일 내용은 "+todoDescriptions+"입니다. 기한은 "+todoDueDate+"까지 입니다";
//	}
	
	@Override
	public String toString() {
		return "Todo [isCompleted=" + isCompleted + ", [todoNumbers=" + todoNumbers + ", todoTitles=" + todoTitles
				+ ", todoDescriptions=" + todoDescriptions + ", todoDueDate=" + todoDueDate + "]";
	}
	//getter, setter 메서드
	public Long getTodoNumbers() {
		return todoNumbers;
	}

	public void setTodoNumbers(Long todoNumbers) {
		this.todoNumbers = todoNumbers;
	}

	public String getTodoTitles() {
		return todoTitles;
	}

	public void setTodoTitles(String todoTitles) {
		this.todoTitles = todoTitles;
	}

	public String getTodoDescriptions() {
		return todoDescriptions;
	}

	public void setTodoDescriptions(String todoDescriptions) {
		this.todoDescriptions = todoDescriptions;
	}

	public LocalDate getTodoDueDate() {
		return todoDueDate;
	}

	public void setTodoDueDate(LocalDate todoDueDate) {
		this.todoDueDate = todoDueDate;
	}
	
	
}
