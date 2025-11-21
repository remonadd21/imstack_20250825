<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%


// 0. 데이터 넘겨받기
String email = request.getParameter("email");
String passw = request.getParameter("passw");
int idNum = Integer.parseInt(request.getParameter("idNum"));




	session.setAttribute("email",email);
	session.setAttribute("passw",passw);

	
	if(email !=null && passw !=null){out.println("<script>alert('로그인 성공!'); location.href='mypage.jsp?email="+email+"';</script>");}
	else {out.println("<script>alert('정보를 확인해 주세요'); history.go(-1);</script>");}

%> 