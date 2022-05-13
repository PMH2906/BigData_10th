package com.todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class App {
	// final : 상수, 값 변경 불가능, 할당은 한번만
	private static final String RESOURCES = "src/main/resources/";
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static void main(String[] args) throws Exception{
		// App.java에서 todo-data-simple.txt 파일을 읽기 위해서는
		// 해당 파일이 위치한 경로를 알아야함
		
		// package import 단축키 : ctrl+shift+o
		final Path filePath = Paths.get(RESOURCES+"todo-data-simple.txt");
		System.out.println(filePath);
		
		Long numberOfLines = Files.lines(filePath).count();
		System.out.println(numberOfLines);
		
		// Long 타입을 int 타입으로 변환
		int rows = numberOfLines.intValue();
		
		// 할 일 번호들을 저장할 long 타입의 배열, todoNumbers
		Long[] todoNumbers = new Long[rows];
		
		// 할 일 제목들을 저장할 string 타입의 뱅ㄹ, todoTitles
		String[] todoTitles = new String[rows];
		
		String[] todoDescriptions = new String[rows];
		
		LocalDate[] todoDueDate = new LocalDate[rows];
		
		// 파일 읽기
		List<String> lines = Files.readAllLines(filePath);
//		System.out.println(lines);
//		System.out.println(lines.size()); // 3출력
		
		int index = 0;
		for (String  line : lines) {
			// "\t" : tap 의미
			// tap기준으로 문자열 split
			final String[] colums = line.split("\t");
//			System.out.println(colums[0]+" "+colums[1]);
			
			
			// 위에서 생성한 배열에 각각 읽어들인 데이터들을 저장
			
			//할 이 번호를 저장한 변수 id
			final Long id = Long.parseLong(colums[0]);
			todoNumbers[index] = id;
			
			final String title = colums[1];
			todoTitles[index] = title;
			
			final String description = colums[2];
			todoDescriptions[index] = description;
			
			final LocalDate dueDate = LocalDate.parse(colums[3],DATE_PATTERN);
			todoDueDate[index] = dueDate;
			
			index++;		
		}
		for (int i = 0; i < todoNumbers.length; i++) {
			System.out.print(todoNumbers[i] + " 번째로 해야할 일은 : ");
			System.out.print(todoTitles[i] + "이고, 할 일 내용은 ");
			System.out.print(todoDescriptions[i] + " 입니다. 기한은 ");
			System.out.print(todoDueDate[i] + " 까지 입니다.\n");
		}
	}
}
