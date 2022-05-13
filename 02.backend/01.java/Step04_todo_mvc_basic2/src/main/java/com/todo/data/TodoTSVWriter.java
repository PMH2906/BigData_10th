package com.todo.data;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import com.todo.model.Todo;

public class TodoTSVWriter {
	FileOutputStream fileOutputStream;
	OutputStreamWriter outputStreamWriter;
	BufferedWriter bufferedWriter;

	public boolean save(String RESOURCES, Path filePath, Todo newTodo) {
		boolean result = false;
		try {
			// 데이터를 파일에 쓰기 위한 준비
			fileOutputStream = new FileOutputStream(RESOURCES + "todo-data-simple.txt", true);
			outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
			bufferedWriter = new BufferedWriter(outputStreamWriter);			
			
			Long numberOfRows = Files.lines(filePath).count(); //현재 데이터의 행수
			int numberOfTodos = numberOfRows.intValue();
			
			numberOfRows++;
			bufferedWriter.write(numberOfTodos+"\t");
			bufferedWriter.write("밥먹기"+"\t");
			bufferedWriter.write("2022-03-08"+"\t");
			bufferedWriter.write("친구와 밥먹기"+"\t");
			
			if(numberOfRows< Files.lines(filePath).count()) {
				return true;
			}else return false;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 자원해제
				bufferedWriter.close();
				outputStreamWriter.close();
				fileOutputStream.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result ;
		
	}
	
}
