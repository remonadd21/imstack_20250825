<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5">
		<h3 class="card-header">MY PAGE</h3>
		
		<table class="table table-striped">
			<tbody>
				<tr>
					<th scope="row">이메일</th><td>${dto.email}</td>
				</tr>
				<tr>
					<th scope="row">생일</th>	<td>${dto.birth}</td>
				</tr>
				<tr>
					<th scope="row">가입날짜</th><td>${dto.email}</td>
				</tr>
				<tr>
					<th scope="row">마케팅 수신</th><td>${dto.chk}</td>
				</tr>
			</tbody>
		</table>
	</div>
<%@ include file="../inc/footer.jsp" %>