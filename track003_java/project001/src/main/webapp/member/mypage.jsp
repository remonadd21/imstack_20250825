
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
			
			String EMAIL="";
			int MBTI_TYPE_ID=0;
			String CREATED_AT="";
			String mbti ="";
			
			
			// 0. 데이터 넘겨 받기 - APP_USER_ID (request.getParameter)
			APP_USER_ID = Integer.parseInt(request.getParameter("APP_USER_ID"));
			
			
		try{
			// 1. 드라이버 연동
			Class.forName(driver);
			
			// 2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			
			// 3. PreparedStatement 
			// "select * from appuser where APP_USER_ID=?";
			String sql = "select * from appuser where APP_USER_ID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, APP_USER_ID);
			
			// 4. ResultSet = 표 줄칸
			// (executeQuery : select / executeUpdate. insert, update, delete)

			rset = pstmt.executeQuery(); // 표
			
			while(rset.next()){ // 줄
				EMAIL = rset.getString("EMAIL");			//칸
				MBTI_TYPE_ID = rset.getInt("MBTI_TYPE_ID"); //칸
				mbti = ""+MBTI_TYPE_ID;
				CREATED_AT = rset.getString("CREATED_AT");	// 칸
			}
			// Q1. mbit가 숫자가 아닌 1이라면, 2라면, 3이라면 문자로 나오도록 만들기
			 switch(MBTI_TYPE_ID){
			    case 1: mbti = "ISTJ"; break;
			    case 2: mbti = "ISFJ"; break;
			    case 3: mbti = "INFJ"; break;
			    case 4: mbti = "INTJ"; break;
			    case 5: mbti = "ISTP"; break;
			    case 6: mbti = "ISFP"; break;
			    case 7: mbti = "INFP"; break;
			    case 8: mbti = "INTP"; break;
			    case 9: mbti = "ESTP"; break;
			    case 10: mbti = "ESFP"; break;
			    case 11: mbti = "ENFP"; break;
			    case 12: mbti = "ENTP"; break;
			    case 13: mbti = "ESTJ"; break;
			    case 14: mbti = "ESFJ"; break;
			    case 15: mbti = "ENFJ"; break;
			    case 16: mbti = "ENTJ"; break;
			    default: mbti = "Unknown";
			}
			out.println(mbti);
			
			
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
					<th scope="row">email</th>	<td><%=EMAIL%></td>
				</tr>
				<tr>
					<th scope="row">MBTI_TYPE</th>	<td><%=mbti%></td>
				</tr>
				<tr>
					<th scope="row">회원가입날짜</th>	<td><%=CREATED_AT%></td>
				</tr>
			</tbody>
		</table>

<%@ include file="../inc/footer.jsp" %>