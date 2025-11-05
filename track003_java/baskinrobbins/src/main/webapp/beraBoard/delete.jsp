<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
	<div class="container card my-5 p-4">
		<h3 class="card-header">Baskin-Robbins 삭제</h3>
		<form action="${pageContext.request.contextPath}/delete.do?idNum=${param.idNum}" method="post">
		  <input type="hidden" name="idNum" value="">
		   <div class="my-3">
		    <label for="userPass" class="form-label">userPass:</label>
		    <input type="password" class="form-control" id="userPass" placeholder="Enter password" name="userPass">
		  </div>
		  <div class="my-3 text-end">
		  	<button type="submit" class="btn btn-primary">글 삭제</button>
		  	<a href="javascript:history.go(-1);" class="btn btn-danger">BACK</a>
		  </div>
		</form>
	</div>
<%@include file="../inc/footer.jsp" %>