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
@WebServlet("*.do2")
public class BFrontController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController2() {
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
		
		if(uri.equals("/write_view.do")) {// 글입력폼
			viewPage = "/board/write.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);		
		} else if(uri.equals("/write.do")) { // 글입력기능 ACTION
			command = new BWriteAction();
			command.execute(request, response);
			//////////////////// BWriteAction
			//        0. 데이터 받아오기
			//        1. dao부르기 - db : insert  ★ 알림창
			viewPage = "/list.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response); 
		} else if(uri.equals("/list.do")) { // 글항목보기 - 리스트 ACTION
			command = new BListAction();
			command.execute(request, response);
			//////////////////// BListAction
			//			1.  dao 부르기
			//			2-1. [DAO이용해서]  전체리스트출력해서 ArrayList로 리턴 
			//			2-2. [DAO이용해서]  전체갯수 출력 리턴 		   
			viewPage = "/board/list.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/detail.do")){ // 글상세보기 ACTION
			command = new BDetailAction();
			command.execute(request, response);			
			//////////////////// BDetailAction
			//     0. 해당번호 넘겨받기
			//	   1.  dao 부르기
			//     2. [DAO이용해서]  db에서 해당데이터가져오기 / [DAO이용해서]  번호업데이트
			viewPage = "/board/detail.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/edit_view.do")){ // 글수정하기 보기폼 ACTION
			command = new BUpdateViewAction();
			command.execute(request, response);			
			//////////////////// BUpdateViewAction
			//0.  해당번호 받아오기
			//1.  dao부르기
			//2.  [DAO이용해서]  해당번호 데이터 가져오기
			viewPage = "/board/edit.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} else if(uri.equals("/edit.do")) {  // 글수정하기 ACTION
			command = new BUpdateAction();
			command.execute(request, response);			
			//////////////////// BUpdateAction
			//0. 해당번호 , 데이터 가져오기
			//1. dao부르기
			//2. [dao이용해서 ] 비밀번호를 확인한후 비밀번호가 맞다면 데이터 업데이트  ★ 성공/실패시알림창
			viewPage = "/detail.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);	
		}else 	if(uri.equals("/delete_view.do")) {// 삭제폼
			viewPage = "/board/delete.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);		
		} else if(uri.equals("/delete.do")) { // 글삭제하기 ACTION
			command = new BDeleteAction();
			command.execute(request, response);						
			//////////////////// BDeleteAction
			//0. 해당번호 , 데이터 가져오기
			//1. dao부르기
			//2. [dao이용해서 ] 비밀번호를 확인한후 비밀번호가 맞다면 데이터 삭제   ★ 성공/실패시알림창
			viewPage = "/list.do";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);			

		} 
	}

}
