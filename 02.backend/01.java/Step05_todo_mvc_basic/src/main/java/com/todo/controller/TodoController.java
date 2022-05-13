package com.todo.controller;

import java.nio.file.Path;
import java.util.List;

import com.todo.model.Todo;
import com.todo.service.TodoService;
import com.todo.view.TodoView;

public class TodoController {
	private List<Todo> todos;
	private final TodoView todoView;
	private final TodoService todoService;
	
	public TodoController(List<Todo> todos) {
		this.todos = todos;
		this.todoView = new TodoView();
		this.todoService = new TodoService();
	}
	//전체 데이터 조회 처리를 위한 분기
	public void findAll() {
//		System.out.println(todos);
		todoView.findAll(todos);
	}
	//하나의 데이터 조회 처리를 위한 분기
	public void findById(Long id) {
		Todo todo = todoService.findById(todos, id);
		todoView.findById(todo);
	}
	public void save(String RESOURCES, Path filePath, Todo newTodo) {
		
		// 실제 데이터 저장에 대한 처리는 service 클래스가 한다
		boolean result = todoService.save(RESOURCES,filePath,newTodo);
//		System.out.println(result);
		// 데이터 저장 성공 여부는 todoView 가 출력한다
		
		if(result) {
			todoView.successPage();
		}else {
			todoView.errorPage();
		}
	}
}
