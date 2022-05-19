package com.mouse.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mouse.dao.MouseDAO;
import com.mouse.model.Mouse;

public class MouseService {
	
	// singleton 패턴, 해당 프로그램에서 인스턴스(객체)가 하나만 생성됨을 보장
	
	// <singleton패턴>필드 생성
	private static MouseService service = new MouseService();
	// 필드 생성
	private MouseDAO dao = MouseDAO.getInstance();
			
	// <singleton패턴>
	//기본생성자
	private MouseService() {}
	
	// 별도의 메서드를 통해서 이미 생성된 인스턴스를 반환
	// 이 함수로만 이 클래스에 접근할 수 있음.
	public static MouseService getInstance() {
		return service;
	}
	// <singleton패턴> 끝
	
	public ArrayList<Mouse> mouseList() throws SQLException {
		ArrayList<Mouse> mouseList = dao.mouseList();
		return mouseList;
	}
}
