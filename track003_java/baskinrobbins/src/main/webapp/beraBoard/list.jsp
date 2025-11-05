<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
	
	<div class="container card my-5 p-4">
		<h3 class="card-header">Baskin-Robbins BOARD</h3>
<!-- 	향상된 for 게시판 리스트
		<c:forEach var="변수명" items="서버에서 넘겨받은 값" varStatus="status">
		</c:forEach> -->
		
		<table class="table table-striped table-bordered table-hover">
			<caption>Baskin-Robbins</caption>
			<thead>
				<tr>
					<th scope="col">NO</th>
					<th scope="col">TITLE</th>
					<th scope="col">NAME</th>
					<th scope="col">DATE</th>
					<th scope="col">HIT</th>
				</tr>	
			</thead>
			<tbody>
				<c:forEach var="dto" items="${list}" varStatus="status">
					<tr>
						<td>${list.size() - status.index}</td>
						<td><a href="<%=request.getContextPath()%>/detail.do?idNum=${dto.idNum}">
							${dto.title}</a>
						</td>
						<td>${dto.userName}</td>
						<td>${dto.writeDate}</td>
						<td>${dto.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<c:if test="${not empty email}">
			<p class="text-center">
				<a href="${pageContext.request.contextPath}/writeView.do" class="btn btn-primary">글쓰기</a>
			</p>
			<p class="loginMemo"><span>로그인시 글쓰기 가능!</span></p>
		</c:if>
	</div>
<%@include file="../inc/footer.jsp" %>