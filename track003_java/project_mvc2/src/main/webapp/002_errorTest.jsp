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
	<div class="container  panel  panel-warning">
		<h3 class="panel-heading">404</h3>
		<p><a href="nopageerror.jsp">NO PAGE</a></p>
	</div>
	
	<div class="container  panel  panel-warning">
		<h3 class="panel-heading">500</h3>
		<% int i=40/0; %>
	</div>
</body>
</html>