package com.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import com.todo.model.Todo;

public class App {
	// final : 상수, 값 변경 불가능, 할당은 한번만
	// 객체 멤버 변수 RESOURCES 초기화 : 경로 지정
	private static final String RESOURCES = "src/main/resources/";
	// 객체 멤버 변수 DATE_PATTERN 초기화
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public static void main(String args[]) throws IOException {
		
		//파일읽는부분시작
		// package import 단축키 : ctrl+shift+o
		final Path filePath = Paths.get(RESOURCES+"todo-data-simple.txt");

		// Long numberOfLines = Files.lines(filePath).count(); // 값이 더 큰 타입에서 작은 타입으로 변활할 때, 명시적으로 변환할 타입을 써줘야함
		// Long 타입을 int 타입으로 변환
		// int rows = numberOfLines.intValue();
		int rows = (int)Files.lines(filePath).count(); // 값이 더 큰 타입(long)에서 작은 타입(int)으로 변활할 때, 명시적으로 변환할 타입을 써줘야함
		
		List<String> lines = Files.readAllLines(filePath);
		//파일읽는부분종료
		
		Todo[] todos = new Todo[rows];
		
		int index = 0;
		for (String  line : lines) {
			// "\t" : tap 의미
			// tap기준으로 문자열 split
			final String[] colums = line.split("\t");
			
			todos[index] = new Todo( Long.parseLong(colums[0]), colums[1], colums[3],LocalDate.parse(colums[2],DATE_PATTERN));
			index++;
		}
		
		Arrays.toString(todos);
		
		for (int i = 0; i < rows; i++) {
			System.out.println(todos[i]); // 해당 객체(참조변수)만 써도 Todo.java의 toString 메서드로 인해 문자열 출력
		}
		//할 일 순서번호로 하나의 Todo조회
		Long number =2L;
		for (Todo todo : todos){
			if (todo.getTodoNumbers()==number) System.out.println(todo);
		}
		
	}
}
