<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%
	Connection conn = null;  PreparedStatement pstmt = null;   ResultSet  rset = null;
	String driver   = "oracle.jdbc.driver.OracleDriver";
	String url      = "jdbc:oracle:thin:@localhost:1521:xe";
	String user     = "scott"; 
	String pass     = "tiger";
	
	String userId = request.getParameter("userId");
	String userName = request.getParameter("userName");
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
		" insert into bruser (idNum, userId, userName, email, passw, birth, gender,joindate, chk) values (idNum_seq2.nextval,?,?,?,?,?,?,?,?);";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, userName);
		pstmt.setString(3, email);
		pstmt.setString(4, passw);
		pstmt.setString(5, birth);
		pstmt.setString(6, gender);
		pstmt.setString(7, joindate);
		pstmt.setString(8, chk);
		
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

 --> --%>