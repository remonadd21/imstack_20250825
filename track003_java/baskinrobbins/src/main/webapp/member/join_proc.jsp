<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;  PreparedStatement pstmt = null;   ResultSet  rset = null;
	String driver   = "oracle.jdbc.driver.OracleDriver";
	String url      = "jdbc:oracle:thin:@localhost:1521:xe";
	String user     = "scott"; 
	String pass     = "tiger";
	
	String username = request.getParameter("username");
	String email = request.getParameter("email");
	String passw = request.getParameter("passw");
	String birth = request.getParameter("birth");
	String gender = request.getParameter("gender");
	String joindate = request.getParameter("joindate");
	String chk = request.getParameter("chk");
	
	//out.print(email+"/"+passw+"/"+birth+"/"+gender+"/"+join_date+"/"+chk);
	try{
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pass);
		String sql =
		" insert into bruser (idNum, username, email, passw, birth, gender,joindate, chk) values (idNum_seq2.nextval, ?,?,?,?,?,?,?)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, email);
		pstmt.setString(3, passw);
		pstmt.setString(4, birth);
		pstmt.setString(5, gender);
		pstmt.setString(6, joindate);
		pstmt.setString(7, chk);
		
		int result = pstmt.executeUpdate();
		if(result>0){out.print("<script>alert('회원 가입에 성공!'); location.href='login.jsp';</script>");}
		else{out.print("<script>alert('관리자에게 문의 바람!'); history.go(-1);</script>");}

		
	}catch(Exception e){e.printStackTrace();
	}finally{
		if(rset !=null){rset.close();}
		if(pstmt !=null){pstmt.close();}
		if(conn !=null){conn.close();}
	}
%>

<!-- 
USER_ID         NOT NULL VARCHAR2(20)  
USER_NAME       NOT NULL VARCHAR2(50)  
PHONE_NUMBER             VARCHAR2(15)  
EMAIL                    VARCHAR2(100) 
BIRTH_DATE               DATE          
GENDER                   CHAR(1)       
JOIN_DATE                DATE          
MARKETING_AGREE          CHAR(1)       
PASS            NOT NULL VARCHAR2(50)  

 -->