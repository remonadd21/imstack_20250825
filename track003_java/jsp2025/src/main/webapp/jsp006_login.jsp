<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
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
		<h3 class="card-header">login</h3>
		<form action="jsp006_result.jsp" method="post">
		  <div class="mb-3 mt-3">
		    <label for="email" class="form-label">Email:</label>
		    <input type="email" class="form-control" id="email" required placeholder="Enter email" name="email">
		  </div>
		  <div class="mb-3">
		    <label for="password" class="form-label">Password:</label>
		    <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>		
	</div>
</body>
</html>