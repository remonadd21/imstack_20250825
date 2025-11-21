
<%@page import="com.company.dao.M21DAO"%>
<%@page import="com.company.dto.M21DTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container  panel  panel-info">
		<h3 class="panel-heading">3) write</h3>
<%-- 		<%
		M21DAO dao = new M21DAO();
		M21DTO dto  = new M21DTO();
		dto.setBname("second");  dto.setBpass("2222"); dto.setBtitle("두번째 글쓰기");  dto.setBcontent("두번째 글쓰기");
		dto.setBcategory("m21");
		dao.write(dto); 
		%>  --%>
		
		<h3 class="panel-heading">1)  listAll()</h3>
<%-- 		<%
		M21DAO dao = new M21DAO();
		ArrayList<M21DTO> list = dao.listAll();
		out.println(list); 
		out.println(list.get(0)); 
		%>  --%>
		<h3 class="panel-heading">2)  listTotal()</h3>
<%-- 		<%
		M21DAO dao = new M21DAO(); 
		out.println(dao.listTotal()); 
		%>  --%>
		<h3 class="panel-heading">4)  detail</h3>
<%-- 		<%
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO();
		dto.setBno(2);
		out.println(dao.detail(dto)); 
		%>   --%>
		
		<h3 class="panel-heading">5)   addHit(M21DTO dto)</h3>
    	<%


    					/* M21DAO dao = new M21DAO(); 
    	    			M21DTO dto  = new M21DTO();
    	    			dto.setBno(25);
    	    			out.println(dao.addHit(dto)); */
    	%>     
		
		<h3 class="panel-heading">6)   checkPass(M21DTO dto)</h3>
<%--     	<%
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO();
		dto.setBno(2);
		dto.setBpass("1234");  // 본인꺼 있는거 확인해주세요
		out.println(dao.checkPass(dto)); 
		%>   
		 --%>
		
		<h3 class="panel-heading">7)   edit(M21DTO dto) </h3>
<%--  		<%
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO();
		dto.setBtitle("new");  		dto.setBcontent("new");   dto.setBno(2); 
		out.println(dao.edit(dto)); 
		 
		%> --%>
<%-- 		<%
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO();
		dto.setBno(2);
		out.println(dao.detail(dto)); 
		%>  --%>
 <h3 class="panel-heading">8)   delete(M21DTO dto) </h3>
<%-- 		<%
			M21DAO dao = new M21DAO(); 
			M21DTO dto  = new M21DTO();  dto.setBno(2); 
			out.println(dao.delete(dto)); 
				 
		%> 	 --%>
	</div>	

</body>
</html>
 





