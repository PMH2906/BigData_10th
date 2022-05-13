package com.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import com.todo.data.TodoTSVParser;
import com.todo.model.Todo;

public class App {
	// final : 상수, 값 변경 불가능, 할당은 한번만
	// 객체 멤버 변수 RESOURCES 초기화 : 경로 지정
	private static final String RESOURCES = "src/main/resources/";
	
	
	public static void main(String args[]) throws IOException {
		
		//파일읽는부분시작
		// package import 단축키 : ctrl+shift+o
		final Path filePath = Paths.get(RESOURCES+"todo-data-simple.txt");

		Long numberOfLines = Files.lines(filePath).count(); // 값이 더 큰 타입에서 작은 타입으로 변활할 때, 명시적으로 변환할 타입을 써줘야함
		// Long 타입을 int 타입으로 변환
		// int rows = numberOfLines.intValue();
//		int rows = (int)Files.lines(filePath).count(); // 값이 더 큰 타입(long)에서 작은 타입(int)으로 변활할 때, 명시적으로 변환할 타입을 써줘야함
		
		List<String> lines = Files.readAllLines(filePath);
		//파일읽는부분종료
		
		//데이터 파싱하는 부분을 별도의 클래스 TodoTSVParser.java로 분리
		TodoTSVParser todoTSVParser = new TodoTSVParser();
		Todo[] todos = todoTSVParser.parseLinesFromTSV(lines, numberOfLines.intValue());
		
		findAll(todos);
		Long todoNum = 2L;
		System.out.println(findById(todos, todoNum));
	}
	
	//전제 Todos 조회
	public static void findAll(Todo[] todos) { // static이 없으면 App클래스의 인스턴스 변수가 됨. 인스턴스 변수는 객체를 생성한 후에 접근이 가능하기 때문에 static 붙이기
		System.out.println(Arrays.toString(todos));
	}
	// 할 일 순서 번호로 하나의 Todo 조회
	public static Todo findById(Todo[] todos, Long todoNumber) {
		for (Todo todo : todos) {
			if (todo.getTodoNumbers() == todoNumber) {
				return new Todo(todo.getTodoNumbers(),todo.getTodoTitles(),todo.getTodoDescriptions(),todo.getTodoDueDate());
			}
		}
		return null;
				
//		Todo todo = todos[todoNumber];
//		return todo;
	}
}
