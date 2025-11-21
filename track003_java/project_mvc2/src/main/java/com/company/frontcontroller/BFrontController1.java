package com.company.frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

/**
 * Servlet implementation class BoardFrontController
 */
@WebServlet("*.do1")
public class BFrontController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			actionDo(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 
		String viewPage = "";
		String uri = request.getRequestURI().substring(  request.getContextPath().length()  );
		
		if(uri.equals("/write_view.do")) {// 글입력폼
			viewPage = "/board/write.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);		
		} else if(uri.equals("/write.do")) { // 글입력기능 ACTION
			viewPage = "/list.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response); 
		} else if(uri.equals("/list.do")) { // 글항목보기 - 리스트 ACTION
			viewPage = "/board/list.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		} else if(uri.equals("/detail.do")){ // 글상세보기 ACTION
			viewPage = "/board/detail.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/edit_view.do")){ // 글수정하기 보기폼 ACTION
			viewPage = "/board/edit.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/edit.do")) {  // 글수정하기 ACTION
			viewPage = "/list.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);	

		}else 	if(uri.equals("/delete_view.do")) {// 삭제폼
			viewPage = "/board/delete.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);		
		} else if(uri.equals("/delete.do")) { // 글삭제하기 ACTION
			viewPage = "/list.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);			

		} 
	}

}
