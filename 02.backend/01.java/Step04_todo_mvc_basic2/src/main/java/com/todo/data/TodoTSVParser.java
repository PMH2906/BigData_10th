package com.todo.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.todo.model.Todo;

public class TodoTSVParser {
	
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	// 별도의 메서드로 작성
	//하나의 Todo 데이터를 파싱하는 메서드, Todo 인스턴스
	private Todo parserFromTSV(String lines) {
		final String[] colums = lines.split("\t");
		
		final Long id = Long.parseLong(colums[0]);
		final String title = colums[1];
		final LocalDate dueDate = LocalDate.parse(colums[2],DATE_PATTERN);
		final String description = colums[3];
		
		Todo todo = new Todo(id, title,description,dueDate);
		return todo;
	}
	
	//한줄씩 파싱 후, 배열에 추가하는 메서드, 파싱이 완료된 todo 배열을 반환
	public List<Todo> parseLinesFromTSV(List<String> lines, int numberOfRows) {
		
		// 1. todos 리스트 선언 및 초기화
		List<Todo> todos = new ArrayList<>();

		for (String line : lines) {
			todos.add(parserFromTSV(line));
//			index++;
		}
		
		return todos;
	}
}
