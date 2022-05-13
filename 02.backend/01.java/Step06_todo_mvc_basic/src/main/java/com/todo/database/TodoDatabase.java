package com.todo.database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.todo.model.Todo;

// 가상의 database 중간
public class TodoDatabase {
	// 멤버 필드
	// Todo 데이터를 보관할 컬렉션 변수
	private static List<Todo> todoDatabase = new ArrayList<>();
	
	// static block : {}, 프로그램이 실행될 때 한 번만 수행됨.
	{
		todoDatabase.add(new Todo(1L, "숙제하기", LocalDate.of(2022, 4, 5), "수학, 영어 숙제"));
		todoDatabase.add(new Todo(2L, "조깅하기", LocalDate.of(2022, 5, 7), "공원에서 1시간 동안 조깅을 한다."));
		todoDatabase.add(new Todo(3L, "빨래하기", LocalDate.of(2022, 4, 4), "빨래를 모아서 세탁기를 돌린다."));
		todoDatabase.add(new Todo(4L, "피아노", LocalDate.of(2022, 4, 7), "학원에서 피아노를 연습한다"));
		todoDatabase.add(new Todo(5L, "강아지 밥주기", LocalDate.of(2022, 4, 7), "강아지에게 사료를 준다."));
	}
	
	public static List<Todo> getTodos(){
		
		return todoDatabase;
	}

	public Todo findById(Long id) {
		for (Todo todo : todoDatabase) {
			if(todo.getTodoNumbers() == id) {
				return new Todo(todo.getTodoNumbers(),todo.getTodoTitles(),todo.getTodoDueDate(),todo.getTodoDescriptions());
			}
		}
		return null;
	}

	// Isert Todo Data
	public boolean save(Todo newTodo) {
		// 다음 번호값 : 요소의 길이 파악 + 1L
		Long nextIndex  = todoDatabase.size()+1L;
		
		// newTodo의 id 필드에 다음 번호값 세팅
		newTodo.setTodoNumbers(nextIndex);
		
		// todoDatabase list에 newTodo추가 
		return todoDatabase.add(newTodo);
		
	}
	
}
