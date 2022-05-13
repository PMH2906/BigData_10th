package com.todo.service;

import java.nio.file.Path;
import java.util.List;

import com.todo.dao.TodoDAO;
import com.todo.model.Todo;

public class TodoService {
	// 비지니스 로직을 처리하는 역할
	// 비지니스 로직 : 해당 애플리케이션에서 중요한 로직을 처리하는 부분
	
	//실제 데이터베이스에 접근하는 역할을 하는 별도의 패키지 dao(data access object, 데이터 접근 객체 혹은 클래스)
	private final TodoDAO todoDAO; 
	
	public TodoService() {
		todoDAO = new TodoDAO();
	}
	
	// 1. 전체 조회 기능 findAll()
	public List<Todo> findAll() {
		// 전체 조회기능을 별도의 비지니스 로직은 열고, Database에 전체 데이터만 가져올 수 있도록 DAO 클래스한테 위임
		// 결과적으로 findAll()은 DB에서 받은 전체 데이터만 반환해주고 있음.
		List<Todo> todos = todoDAO.findAll();
		return todos;
	}
	
	// findById : id 값에 의해서 일치하는 데이터를 찾는 로직
	// 2. 조회기능2, 할 일 순서 번호로 하나의 Todo조회 메서드
	public Todo findById(Long id) {
		return todoDAO.findById(id);

	}

	public boolean save(Todo newTodo) {
		Boolean result = todoDAO.save(newTodo);
		return false;
	}

	public Todo updateById(Long todoNumber, Todo todo) {
		// TODO Auto-generated method stub
		return null;
	}

}
