package com.todo;

import java.time.LocalDate;

import com.todo.controller.TodoController;
import com.todo.model.Todo;

public class App {
	
	public static void main(String args[]) {
		
		
		TodoController todoController = new TodoController();
		
		//전체 Todo 조회
		todoController.findAll();
		
		// 하나의 Todo 결과 조회
		Long todoNumber = 6L;
		todoController.findById(todoNumber);
		
//		// 새롭게 등록될 Todo 일정 생성
//		// Todo 데이터 쓰기(저장), 데이터 등록
		Todo newTodo = new Todo("산책하기","강아지와 산책한다",LocalDate.of(2022,04,05));
		todoController.save(newTodo);
		
		//전체 Todo 조회
		todoController.findAll();	
		
		//
	}
}
