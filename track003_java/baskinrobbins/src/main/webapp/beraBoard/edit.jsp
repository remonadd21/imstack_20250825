<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
	<div class="container card my-5 p-4">
		<h3 class="card-header">Baskin-Robbins 글수정</h3>
		<form action="<%=request.getContextPath()%>/edit.do?idNum=${dto.idNum}" method="post">
		  <div class="mb-3 mt-3">
		    <label for="userid" class="form-label">userid:</label>
		    <input type="text" class="form-control" id="userid" readonly placeholder="내용을 입력해 주세요." 
		    name="userId" value="${dto.userId}">
		  </div>
		  <div class="mb-3 mt-3">
		    <label for="username" class="form-label">username:</label>
		    <input type="text" class="form-control" id="username" readonly placeholder="내용을 입력해 주세요." 
		    name="userName" value="${dto.userName}">
		  </div>
		  <div class="mb-3 mt-3">
		    <label for="username" class="form-label">userPass:</label>
		    <input type="password" class="form-control" id="username" readonly placeholder="내용을 입력해 주세요." 
		    name="userPass" value="${dto.userPass}">
		  </div>
		  <div class="mb-3">
		    <label for="title" class="form-label">title:</label>
		    <input type="text" class="form-control" id="title" placeholder="Enter title"
		     name="title" value="${dto.title}">
		  </div>
	      <div class="mb-3">
		    <label for="content" class="form-label">content:</label>
		    <textarea class="form-control" id="content" 
		    	placeholder="내용을 입력해 주세요." name="content">${dto.content}</textarea>
	      </div>
	      <div class="mb-3">
		    <label for="usericename" class="form-label">메뉴 선택하기:</label>
		    <input type="text" class="form-control" id="usericename" placeholder="Enter usericename"
		     name="userIcename" value="${dto.userIcename}">
		  </div>
	      
	      
	      <div class="mb-3 text-end">
		  	<button type="submit" class="btn btn-primary">글 수정</button>
		  	<a href="javascript:history.go(-1);" class="btn btn-danger">BACK</a>
		  </div>
		</form>
	</div>
<%@include file="../inc/footer.jsp" %>