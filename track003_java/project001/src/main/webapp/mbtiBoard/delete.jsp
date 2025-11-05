<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
	<div class="container card my-5 p-4">
		<h3 class="card-header">mbti 글 삭제</h3>
		<form action="${pageContext.request.contextPath}/delete.do?id=${param.id}" method="post">
		  <input type="hidden" name="app_user_id" value="">
		   <div class="my-3">
		    <label for="pass" class="form-label">pass:</label>
		    <input type="password" class="form-control" id="pass" placeholder="Enter password" name="pass">
		  </div>
		  <div class="my-3 text-end">
		  	<button type="submit" class="btn btn-primary">글 삭제</button>
		  	<a href="javascript:history.go(-1);" class="btn btn-danger">BACK</a>
		  </div>
		</form>
	</div>
<%@include file="../inc/footer.jsp" %>