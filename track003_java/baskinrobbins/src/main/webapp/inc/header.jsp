<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>  

<!-- header -->
<!-- header -->

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap 5 Website Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
	  $(document).ready(function() {
	    $("form").mouseover(function() {
	      $(this).css({"width":"440px","borderRadius":"50px 10px 10px 10px","boxShadow":"0 0 10px rgba(0,0,0,0.2)" });
	      $("#spoon").css({"left":"390px","top":"135px","transform":"rotate(-150deg)"});
	    });
	  });

  
  </script>
  
  <style>
  .fakeimg {
    height: 200px;
    background: #aaa;
  }
  .container h3{text-align:center; perspective:600px;}
  	.navbar{height:80px; background:url("../inc/h_logo_white.png")no-repeat 10px;
		padding:20px; background-color:#F986BD; 
		box-shadow:0 0 10px rgba(0,0,0,0.5); position:relative; }
	.navbar-expand-sm .navbar-nav{right:20px; position:absolute;}
	.navbar-nav .nav-link.active, .navbar-nav .nav-link.show{color:#fff;}
	
	#spoon{width:200px; position:absolute; left:270px; top:80px; transform:rotate(-140deg);
	z-index:-1; transition:all 2s ease;}
	#spoon img{width:100%;}
	
	form{width:400px; margin:20px auto 0; 
	border:1px solid #F986BD; padding:30px; transition:all 1s ease 0.8s;}
	
	#usericename{width:90%; line-height:40px; height:40px; border:1px solid #F986BD;}
	
	
	.btn{background-color:#F986BD; box-shadow:0 0 10px rgba(0,0,0,0.2); color:#fff;}
	.loginMemo{width:90%; border-radius:4px; margin:0 auto; background-color:#fff; 
	height:50px; line-height:50px; border-bottom:2px solid #F986BD; position:relative;}
	
	.loginMemo span{display:inline-block; width:210px;  color:#F986BD;
	background:url("inc/spoon.gif")no-repeat top left; text-align:right;
	animation:moves 25s infinite alternate; position:absolute; }
	@keyframes moves{
		0%{left:0;}
		40%{left:40%}
		100%{left:80%;}
	}
	
	#footer{background-color:#F986BD;}
  </style>
</head>
<body>
<nav class="navbar navbar-expand-sm">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <!-- 로그인을 한 경우 -->
      <% 
      String email = (String)session.getAttribute("email"); 
      if(email !=null){%>
      
      <li class="nav-item">
        <a class="nav-link active" 
        href="<%=request.getContextPath()%>/mypage.do"><%=email%></a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="<%=request.getContextPath()%>/list.do">BeraBoard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="<%=request.getContextPath()%>/logout.do">LogOut</a>
      </li>
     <% }else{ %>
     <!-- 로그인 안한 경우 -->
      <li class="nav-item">
        <a class="nav-link active" href="<%=request.getContextPath()%>/loginView.do">LOGIN</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="<%=request.getContextPath()%>/joinView.do">JOIN</a>
      </li>
     <% } %>
    </ul>
  </div>
</nav>
<!-- header -->
<!-- header -->
<!-- header -->