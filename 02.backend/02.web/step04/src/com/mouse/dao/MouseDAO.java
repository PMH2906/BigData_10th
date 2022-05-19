package com.mouse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mouse.model.Mouse;
import com.mouse.util.DBUtils;

public class MouseDAO {
	
	// singleton
	// 인스턴스 직접 선언, 초기화
	private static MouseDAO dao = new MouseDAO();

	// 기본 생성자에 대한 접근 제한, private이면 클래스 내부에서만 접근 가능
	private MouseDAO() {}
	
	public static MouseDAO getInstance() {
		return dao;
	}
	public ArrayList<Mouse> mouseList() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Mouse mouse = null;
		ArrayList<Mouse> mouseList = null;
		String sql = "SELECT * FROM mouse";
		
		try {
			con = DBUtils.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			mouseList = new ArrayList<Mouse>();
			
			while(rs.next()) {
				mouse = new Mouse();
				mouse.setId(rs.getInt(1));
				mouse.setName(rs.getString(2));
				mouse.setCountry(rs.getString(3));
				mouse.setAddress(rs.getString(4));
				
				mouseList.add(mouse);
			}
		}finally {
			// 자원 해제
			rs.close();
			pstmt.close();
			con.close();
		}
		
		return mouseList;
	}


}
