package com.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import com.todo.controller.TodoController;
import com.todo.data.TodoTSVParser;
import com.todo.data.TodoTSVWriter;
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
		
		//List는 인터페이스(상위 타입)
		//ArrayList는 List인터페이스를 구현한 구현 클래스(하위 타입)
		List<Todo> todos = todoTSVParser.parseLinesFromTSV(lines, numberOfLines.intValue());
		
		TodoController todoController = new TodoController(todos);
		todoController.findAll();
		
		// 하나의 Todo 결과 조회
		Long todoNumber = 2L;
		todoController.findById(todoNumber);
		
//		// 하나의 Todo 등록
//		TodoTSVWriter todoTSVWriter = new TodoTSVWriter();
//		// TodoTSVWriter 인스턴스 생성
//		Todo newTodo = new Todo("산책하기","강아지와 산책한다",LocalDate.of(2022,04,05));
//		// 새롭게 등록될 Todo 일정 생성
//		
//		// Todo 데이터 쓰기(저장)
//		todoTSVWriter.save(RESOURCES,filePath, newTodo);
		Todo newTodo = new Todo("산책하기","강아지와 산책한다",LocalDate.of(2022,04,05));
		todoController.save(RESOURCES, filePath, newTodo);
		
	}
	


}
