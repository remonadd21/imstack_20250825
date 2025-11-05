<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5">
		<h3 class="card-header">MY PAGE</h3>
		<%
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			String driver   = "oracle.jdbc.driver.OracleDriver";
			String url      = "jdbc:oracle:thin:@localhost:1521:xe";
			String user     = "scott"; 
			String pass     = "tiger";
			
			
			String username="";
			String birth="";
			// header.jsp에 있음
			email="";
			String chk="";
			
			// 0. 데이터 넘겨 받기 - APP_USER_ID (request.getParameter)
			idNum = Integer.parseInt(request.getParameter("idNum"));
			
			
		try{
			// 1. 드라이버 연동
			Class.forName(driver);
			
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			
			// 3. PreparedStatement 
			// "select * from appuser where APP_USER_ID=?";
			String sql = "select * from bruser where idNum=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,idNum);
			
			// 4. ResultSet = 표 줄칸
			// (executeQuery : select / executeUpdate. insert, update, delete)

			rset = pstmt.executeQuery(); // 표
			
			while(rset.next()){ // 줄
				username = rset.getString("username");			//칸
				birth = rset.getString("birth"); //칸
				email = rset.getString("email");	// 칸
				chk = rset.getString("chk");
			}
			
			
		}catch(Exception e){ e.printStackTrace();
		}finally{
			if(rset != null) rset.close();
			if(pstmt != null) pstmt.close();
			if(conn !=null) conn.close();
		}
		%>
		<table class="table table-striped">
			<tbody>
				<tr>
					<th scope="row">이메일</th><td><%=username%></td>
				</tr>
				<tr>
					<th scope="row">생일</th>	<td><%=birth%></td>
				</tr>
				<tr>
					<th scope="row">가입날짜</th><td><%=email%></td>
				</tr>
				<tr>
					<th scope="row">마케팅 수신</th><td><%=chk%></td>
				</tr>
			</tbody>
		</table>
	</div>
<%@ include file="../inc/footer.jsp" %>