<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

Connection conn = null;  
PreparedStatement pstmt = null;   
ResultSet  rset = null;

String driver   = "oracle.jdbc.driver.OracleDriver";
String url      = "jdbc:oracle:thin:@localhost:1521:xe";
String user     = "scott"; 
String pass 	= "tiger";

// 0. 데이터 넘겨받기
String email = request.getParameter("email");
String passw = request.getParameter("passw");
String username="";

out.println(email+"/"+ passw +"/"); // 실행값 넘어 오는지 확인

try{
	// 드라이버 연동
	Class.forName(driver);
	// 커넥션
	conn = DriverManager.getConnection(url, user, pass); 

	
	// prepared ??여기는 select...... insert 는 삽입
	String sql = "select count(*) cnt, email , idNum from bruser where email=? and passw=? group by email , idNum";
	

	pstmt = conn.prepareStatement(sql); 
	pstmt.setString(1, email);
	pstmt.setString(2, passw);

	int idNum=-1;
	String result ="";
	rset = pstmt.executeQuery();
	int cnt=-1;
	while(rset.next()){
		cnt = rset.getInt("cnt");  //해당유저가 1명이면
		result = rset.getString("email");
		idNum = rset.getInt("idNum");
		
	}
	if(cnt ==1 ){
		// ## 브라우저에 - 서버에 정보 남기기 - session (사용할 수 있는 시간) / 브라우저 닫힐때 까지
		session.setAttribute("email", email);
		session.setAttribute("idNum",idNum);
	}
	
	if(cnt > 0){out.println("<script>alert('로그인 성공!'); location.href='mypage.jsp?idNum="+idNum+"';</script>");}
	else {out.println("<script>alert('정보를 확인해 주세요'); history.go(-1);</script>");}
}catch(Exception e){out.println("오류 : "+e.getMessage());
}finally{
	if(rset !=null) rset.close(); 
	if(pstmt !=null) pstmt.close(); 
	if(conn !=null) conn.close();
}


%>