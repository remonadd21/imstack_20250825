<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.d2big.dto.PostDto"%>
<%@page import="com.d2big.dao.PostDao"%>
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
		<h3 class="card-header">1.insert</h3>
		<pre>
			1. insert
		</pre>
		<%-- <% 
 			PostDao dao = new PostDao();
			PostDto dto = new PostDto();
			dto.setAppUserId(1);
			dto.setTitle("첫번째 글쓰기 입니다.");
			dto.setContent("내용");
			dto.setPass("1111");
			out.println(dao.insert(dto)); 
			
		%> --%>
		<pre>
			2. select all
		</pre>

<%--  		<%
			PostDao dao = new PostDao();
			out.println(dao.selectAll()); 
		%> --%>
		
		<pre>
			3. select id
		</pre>
		
<%-- <%--   		<% 
			PostDao dao = new PostDao();
  			PostDto dto = new PostDto();
			out.println(dao.update_hit(2));
			out.println(dao.select(dto.getId(2));
		%> 
		 
		<pre>
			3. update
		</pre>
  		<%
			PostDao dao = new PostDao();
			PostDto dto = new PostDto();
			dto.setTitle("처음으로 쓰는 new 글-1");
			dto.setContent("내용 new용-1");
			dto.setPass("1111");
			dto.setId(7);
			out.println(dao.update(dto));		
		%>   
		 
		
		<pre>
			4. delete
		</pre>
<%-- 		
 		<% 
			PostDao dao = new PostDao();
			PostDto dto = new PostDto();
			dto.setPass("1111");
			dto.setId(2);
			out.println(dao.delete(dto));
		%>  
		 --%>
		
		 

</body>
</html>