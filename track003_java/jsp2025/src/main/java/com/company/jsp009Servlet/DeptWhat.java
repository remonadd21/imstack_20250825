package com.company.jsp009Servlet;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptWhat
 */
@WebServlet("/DeptWhat")
public class DeptWhat extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeptWhat() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0. 문자열 깨지지 않도록 셋팅하기
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//1. 데이터 넘겨받기
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		
		//2. 드커프리
		Connection conn = null;  
		PreparedStatement pstmt = null;   
		ResultSet  rset = null;
		
		String driver   = "oracle.jdbc.driver.OracleDriver";
		String url      = "jdbc:oracle:thin:@localhost:1521:xe";
		String user     = "scott"; 
		String pass     = "tiger";
		String sql 		= "select * from dept where deptno=?";
		DeptDto result = null;
		
		
	try {
		//2-1. 드라이버로딩
		Class.forName(driver);
		
		//2-2. 커넥션
		conn = DriverManager.getConnection(url,user,pass);
		//2-3. PreparedStatements
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, deptno); // 1은 ?의 순서(첫번째 물음표 정의 하기)
		//2-4. ResultSet(결과) - select : executeQuery, 
		//         insert/update/delet : executeUpdate
		rset = pstmt.executeQuery(); // 표
		while(rset.next()) {
			result = new DeptDto(
					rset.getInt("deptno"),
					rset.getString("dname"),
					rset.getString("loc"));
		}
		System.out.println(",,,,,,,,,,,,"+result);
	}catch(Exception e) {e.printStackTrace();
	}finally {
		if(rset != null) {try{rset.close();}catch(SQLException e) {e.printStackTrace();}}
		if(pstmt != null) {try{pstmt.close();}catch(SQLException e) {e.printStackTrace();}}
		if(conn != null) {try{conn.close();}catch(SQLException e) {e.printStackTrace();}}
	}
	
	//3. 데이터 화면에 넘겨주기
	request.setAttribute("dto", result);
	
	// 주소표시 창 줄에 넘기기
	// 현재 페이지에서 이거 입니다! 하고 아무것도 넘기지 않고 끝남!
	// request가 유지 되지 않음.
	// response.sendRedirect("jsp010_result.jsp"); 
    request.setAttribute("dto", result);
    request.getRequestDispatcher("jsp010_result.jsp").forward(request, response);
	
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
