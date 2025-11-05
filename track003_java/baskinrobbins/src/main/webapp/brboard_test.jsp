<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.bera.dto.BeraDto"%>
<%@page import="com.bera.dao.BeraDao"%>

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
		<h3 class="card-header">insert</h3>
		<pre>
			INSERT	
		</pre>
<%-- 		<% 
			BeraDao dao = new BeraDao();
			BeraDto dto = new BeraDto();
			
			dto.setUserId("아이언맨");
			dto.setUserName("밥");
			dto.setUserPass("1234");
			dto.setTitle("아이언맨도 아이스크림 먹는다.");
			dto.setContent("맛있게 먹는다.");
			dto.setUserIcename("엄마는 이계인");
			out.println(dao.insert(dto)); 
		%> --%>
		<!--  -->
		<!--  -->
		<h3 class="card-header">selectAll</h3>
		<pre>
			selectAll	
		</pre>
<%-- 		<% 
			BeraDao dao = new BeraDao();
			out.println(dao.selectAll());
		%>    --%>
		
		

 		<h3 class="card-header">selectID</h3>
		<pre>
			selectID
		</pre>
<%-- 		<%
			BeraDao dao = new BeraDao();
			BeraDto dto = new BeraDto();
			out.println(dao.update_hit(1));
			out.println(dao.select(dto.getIdNum(1)));
		%> --%>  

		 
		 
		 		 
		<pre>
			4. update
		</pre>
<%--  		<%
		//String sql = " update brboard set userId=?, userName=?, title=?, content=?, userIcename=?"
		//		+ " where idNum=?";
		BeraDao dao = new BeraDao();
		BeraDto dto = new BeraDto();
		dto.setUserId("구구절절");
		dto.setUserName("토란이");
		dto.setTitle("아이스크림 토란맛이 나왔나?");
		dto.setContent("스무디하고 막 그런 맛");
		dto.setUserIcename("토란토란");
		dto.setIdNum(2);
		out.println(dao.update(dto));		
		%>    --%>  
		
				<pre>
			4. delete
		</pre>
			
  		<% 
			BeraDao dao = new BeraDao();
			BeraDto dto = new BeraDto();
			dto.setUserPass("userPass");
			dto.setIdNum(1);
			out.println(dao.delete(dto));
		%>   
		
	</div>
</body>
</html>