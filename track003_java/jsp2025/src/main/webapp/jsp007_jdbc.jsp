<%@page import="java.sql.*"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header"></h3>
		<pre class="alert alert-primary">
		
			[jdbc란?]
			1. jdbc (java Database Connectivity):
			자바에서 데이터베이스와 연결해 SQL을 실행하고 결과를 처리할 수 있도록 해주는 표준  API	
			
			2. java와 db 사이의 다리역할
			
			[2.셋팅]
			1. C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
			2. [webapp]-[web-inf]-[lib]-ojdbc6.jar
			
			[3. jdbc 주요 구성요소]
			1. DriverManager = db연결 생성
			2. Connection = db연결을 나타내는 객체
			3. PreparedStatement = 동적 sql 실행
			4. ResultSet = sql실행 결과
		</pre>
		<%
			//1. 드라이버 연결
			// 회사명. 프로젝트. 클래스명	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//				com.mysql.cj.jdbc.Driver			- mysql
			//2. db연결
			// mysql ver  = jdbc:mysql://localhost:3306/mydb
	        String url     ="jdbc:oracle:thin:@localhost:1521:xe";
       		String user    ="scott";
       		String password="tiger";
			Connection conn = DriverManager.getConnection(url,user,password);
			
			if(conn !=null){out.println("db연동성공!"); conn.close();}
			
		%>
	</div>
</body>
</html>