package com.todo.service;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

import com.todo.data.TodoTSVWriter;
import com.todo.model.Todo;

public class TodoService {
	// 비지니스 로직을 처리하는 역할
	// 비지니스 로직 : 해당 애플리케이션에서 중요한 로직을 처리하는 부분
	
	// findById : id 값에 의해서 일치하는 데이터를 찾는 로직
	
	// 2. 조회기능2, 할 일 순서 번호로 하나의 Todo조회 메서드
	public Todo findById(List<Todo> todos, Long id) {
		
		for (Todo todo : todos) {
			if(todo.getTodoNumbers() == id) {
				return new Todo(todo.getTodoNumbers(),todo.getTodoTitles(),todo.getTodoDescriptions(),todo.getTodoDueDate());
			}
		}
		return null;
	}

	public boolean save(String RESOURCES, Path filePath, Todo newTodo) {
		// 하나의 Todo 등록
		// TodoTSVWriter 인스턴스 생성
		TodoTSVWriter todoTSVWriter = new TodoTSVWriter();
		
		// 새롭게 등록될 Todo 일정 생성
		boolean result =  todoTSVWriter.save(RESOURCES,filePath, newTodo);
		return result;
	}

}
