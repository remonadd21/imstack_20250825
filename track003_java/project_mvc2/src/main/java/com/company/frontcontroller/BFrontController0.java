package com.company.frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BFrontController0
 */
@WebServlet("*.test")
public class BFrontController0 extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController0() { super(); }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionTest(request , response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionTest(request , response);
	}
	private void actionTest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 request.setCharacterEncoding("UTF-8");
		 response.setContentType("text/html; charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 //1.   /mvc2_1_front/a.test
		 //2.   /a.test
		 System.out.println( "URI : " 			   + request.getRequestURI()  +"<br/>"); 
		 System.out.println( "contextPath : " + request.getContextPath() +"<br/>"); 
		 System.out.println( "/path : " + request.getRequestURI().substring( request.getContextPath().length()) +"<br/>");
		 
		 String path = request.getRequestURI().substring( request.getContextPath().length()) ;
		 out.println(path);
		 if(path.equals("/write.test")) {
			 out.println("글쓰기 페이지로이동");
		 }else  if(path.equals("/list.test")) {
			 out.println("리스트 페이지로이동");
		 }
	}
}














