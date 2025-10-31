<%@page import="com.company.jsp009Servlet.JavaBasic"%>
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
		<h3 class="card-header">001. java</h3>
		<pre class="alert alert-success">
			1. java파일
			2. 사용
			예) Dto(전달), Dao(db연결-sql), DBManager, 필요한 api
		</pre>
		<% JavaBasic jb = new JavaBasic(10,3); %>
		<%=jb.add()%>
		<h3 class="card-header">002. servlet</h3>
		<pre class="alert alert-success">
			1. java 파일 -  HttpServlet 상속: doGet, doPost(controller)
			2. servlet 라이프사이클
		</pre>
		<p><a href="<%=request.getContextPath()%>/hello1" class="btn btn-danger">servlect001</a></p>
		<!-- post -->
		<form action="<%=request.getContextPath()%>/hello1" method="POST">
			<input type="submit" value="POST" class="btn btn-danger"/>
		</form>
		<!-- lifecycle -->
		<p>
			<a href="<%=request.getContextPath()%>/ServlectBasic003_lifecycle" 
			class="btn btn-danger">lifecycle</a>
		</p>
		
		
		<!-- frontController -->
		<p>
			<a href="<%=request.getContextPath()%>/a.do" class="btn btn-danger">a.do</a>
		</p>
		<p>
			<a href="<%=request.getContextPath()%>/b.do" class="btn btn-danger">b.do</a>
		</p>
	</div>
</body>
</html>