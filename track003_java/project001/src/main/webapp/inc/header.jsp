<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap 5 Website Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <style>
  .fakeimg {
    height: 200px;
    background: #aaa;
  }
  </style>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
    
      <!-- 로그인을 한 경우 -->
     <% String email = (String)session.getAttribute("email"); // session은 서버에 저장, 브라우저 닫힐때 까지 사용가능  request 1번만 사용
     	Integer APP_USER_ID = (Integer)session.getAttribute("APP_USER_ID");
     	if(email != null){ %>
	      <li class="nav-item">
	        <a class="nav-link active" 
	        href="<%=request.getContextPath()%>/member/mypage.jsp?APP_USER_ID<%=APP_USER_ID%>"><%=email%></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="<%=request.getContextPath()%>/list.do">MbtiBoard</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="<%=request.getContextPath()%>/member/logout.jsp">LogOut</a>
	      </li>
     <%  }else{ %>
	  <!-- 로그인을 (안) 한 경우 -->
	      <li class="nav-item">
	        <a class="nav-link" href="<%=request.getContextPath()%>/member/login.jsp">Login</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="<%=request.getContextPath()%>/member/join.jsp">join</a>
	      </li>
     <%  } %>
    </ul>
  </div>
</nav>
<!-- header -->
<!-- header -->
<!-- header -->