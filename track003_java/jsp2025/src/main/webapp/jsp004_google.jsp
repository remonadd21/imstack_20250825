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
		<h3 class="card-header">google</h3>
		<pre  class="alert alert-warning">
		       https://www.google.com/search?q=APPLE 
		       1.처리컨테이너 : https://www.google.com/search  
		       2.처리방식      : get  
		       3.보관용기      : q  
		</pre>
		<form action="https://www.google.com/search  " method="GET">
		  <div class="mb-3 mt-3">
		    <label for="search" class="form-label">뭐? 뭘 물어? </label>
		    <input type="search" class="form-control" id="search" placeholder="뭘 물어보려고? 뭐?" name="q">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>

<!-- 
	1. window-preferences
	2. 검색 : jsp
	3. templates - [new] - name 입력 / 매우중요) context에서 new jsp 선택하기
	4. 아래 큰 빈칸에 html 문법 붙여넣고, apply 적용후 완료하기

 -->