<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!--  detail.do?idNum=9 -->
<%@include file="../inc/header.jsp" %>
	<div class="container card my-5 p-4">
		<h3 class="card-header">Baskin-Robbins 상세보기</h3>
		<form action="<%=request.getContextPath()%>/detail.do" method="post">
		  <input type="hidden" name="idNum" value="">
		  <div class="mb-3 mt-3">
		    <label for="userId" class="form-label">userid:</label>
		    <input type="text" class="form-control" id="userId"  name=userId readonly  
		    	value="${dto.userId}">
		  </div>
		  <div class="mb-3 mt-3">
		    <label for="title" class="form-label">title:</label>
		    <input type="text" class="form-control" id="title" 
		    placeholder="내용을 입력해 주세요." name="title" readonly  value="${dto.title}">
		  </div>
	      <div class="mb-3">
		    <label for="content" class="form-label">content:</label>
		    <textarea class="form-control" id="content" 
		    placeholder="내용을 입력해 주세요." name="content" readonly>${dto.content}</textarea>
	      </div>
	      
	      <c:if test="${not empty email}">
		      <div class="mb-3">
		      	<a href="<%=request.getContextPath()%>/editView.do?idNum=${dto.idNum}" class="btn btn-info form-control">글수정</a>
			  </div>
			  <div class="mb-3">
			  	<a href="<%=request.getContextPath()%>/deleteView.do?idNum=${dto.idNum}" class="btn btn-info form-control">글삭제</a>
			  </div>
	      </c:if>
	      
	      <div class="mb-3">
		  	<a href="<%=request.getContextPath()%>/list.do" class="btn btn-info form-control">목록보기</a>
		  </div>
		</form>
	</div>
<%@include file="../inc/footer.jsp" %>