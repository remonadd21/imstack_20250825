package com.company.jsp009Servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServlectBasic003_lifecycle
 */
@WebServlet("/ServlectBasic003_lifecycle")
public class ServletBasic03_lifecycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
      int initCnt = 1; // init 맨 처음 한번만
      int doGetCnt =1; // thread-get/post
      int destroyCnt=1; // destroy 맨마지막 한번만
    public ServletBasic03_lifecycle() { super(); }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("#1. init() 첫 요청에만 호출 > " + initCnt++);
	}
	public void destroy() {
		System.out.println("#3. init() 첫 요청에만 호출 > " + destroyCnt++);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("GooD :D AY").append(request.getContextPath());

		System.out.println("#2.                 호출 될 때 마다 재 사용 > " + doGetCnt++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
