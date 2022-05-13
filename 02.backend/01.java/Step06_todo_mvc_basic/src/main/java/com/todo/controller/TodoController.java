package com.todo.controller;

import java.nio.file.Path;
import java.util.List;

import com.todo.model.Todo;
import com.todo.service.TodoService;
import com.todo.view.TodoView;

public class TodoController {
	// 사용자의 요청에 따라 액션을 분기'만' 해주는 역할
	
		// todos 리스트를 필드로 선언
		private List<Todo> todos;
		private final TodoView todoView; // 구성관계(Composition)
		private final TodoService todoService;
		private Exception errorObject;
		
		// 기본 생성자
		public TodoController() {
			this.todoView = new TodoView();
			this.todoService = new TodoService();
		}
		
		// 전체 데이터 조회 처리를 위한 분기
		public void findAll() {
			// 현재 todos는 null
			// todos에 실제 데이터를 초기화 한 후에 todoView.findAll()을 호출해야 한다.
			todos = todoService.findAll();
			todoView.findAll(todos);
		}
		
		// 하나의 데이터 조회 처리를 위한 분기
		public void findById(Long id) {
			Todo todo = todoService.findById(id);
			
			if(todo != null) {
				todoView.findById(todo);
			} else {
				// 해당하는 Todo 데이터가 존재하지 않습니다., 예외 객체 생성
				errorObject = new Exception("해당하는 Todo 데이터가 존재하지 않습니다."); 
				todoView.errorPage(errorObject);
			}
		}
		
		public void save(Todo newTodo) {
			// 실제 데이터 저장에 대한 처리는 service 클래스가 한다.
			boolean result = todoService.save(newTodo);
			
			// 데이터의 저장 성공 여부는 todoView가 출력한다.
			if(result) {
				todoView.successPage();
			} else {
				todoView.errorPage();
			}
		}

		public void updateById(Long todoNumber, Todo todo) {
			Todo previousTodo = todoService.updateById(todoNumber, todo);
			
			if(previousTodo != null) {
				todoView.update(previousTodo);
			} else {
				errorObject = new Exception("수정 실패");
				todoView.errorPage(errorObject);
			}
		}
	}
