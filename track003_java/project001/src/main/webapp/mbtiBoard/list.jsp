<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
	
	<div class="container card my-5 p-4">
		<h3 class="card-header">mbti board</h3>
<!-- 	향상된 for 게시판 리스트
		<c:forEach var="변수명" items="서버에서 넘겨받은 값" varStatus="status">
		</c:forEach> -->
		
		<table class="table table-striped table-bordered table-hover">
			<caption>mbti</caption>
			<thead>
				<tr>
					<th scope="col">NO</th>
					<th scope="col">TITLE</th>
					<th scope="col">EMAIL</th>
					<th scope="col">DATE</th>
					<th scope="col">HIT</th>
				</tr>	
			</thead>
			<tbody>
				<c:forEach var="dto" items="${list}" varStatus="status">
					<tr>
						<td>${list.size() - status.index}</td>
						<td><a href="<%=request.getContextPath()%>/detail.do?id=${dto.id}">
							${dto.title}</a>
						</td>
						<td>${dto.content}</td>
						<td>${dto.createdAt}</td>
						<td>${dto.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<% if(email !=null ){%>
			<p class="text-center">
				<a href="${pageContext.request.contextPath}/writeView.do" class="btn btn-primary">글쓰기</a>
			</p>
		<%}else{%>
			<p class="text-center alert alert-primary">로그인시 글쓰기 가능!</p>
		<%}%>
	</div>
<%@include file="../inc/footer.jsp" %>