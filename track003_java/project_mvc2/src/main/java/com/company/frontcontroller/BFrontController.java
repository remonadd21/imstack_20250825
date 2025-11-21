package com.company.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.controller.BAction;
import com.company.controller.BDeleteAction;
import com.company.controller.BDetailAction;
import com.company.controller.BListAction;
import com.company.controller.BUpdateAction;
import com.company.controller.BUpdateViewAction;
import com.company.controller.BWriteAction;
 

/**
 * Servlet implementation class BoardFrontController
 */
@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
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
		BAction  command = null;
		String uri = request.getRequestURI().substring(  request.getContextPath().length()  );
		
		if(uri.equals("/write_view.do")) { 
			viewPage = "/board/write.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);	
			
		} else if(uri.equals("/write.do")) {  
			command = new BWriteAction();
			command.execute(request, response);
			viewPage = "/list.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response); 
			
		} else if(uri.equals("/list.do")) { 
			command = new BListAction();
			command.execute(request, response);	   
			viewPage = "/board/list.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/detail.do")){
			command = new BDetailAction();
			command.execute(request, response);			
			viewPage = "/board/detail.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/edit_view.do")){
			command = new BUpdateViewAction();
			command.execute(request, response);			
			viewPage = "/board/edit.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/edit.do")) {  
			command = new BUpdateAction();
			command.execute(request, response);			
			viewPage = "/detail.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);	
			
		}else 	if(uri.equals("/delete_view.do")) {
			viewPage = "/board/delete.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);	
			
		} else if(uri.equals("/delete.do")) { 
			command = new BDeleteAction();
			command.execute(request, response);						
			viewPage = "/list.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);			

		} 
	}

}
