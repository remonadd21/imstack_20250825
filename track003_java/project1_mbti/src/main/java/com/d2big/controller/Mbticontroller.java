package com.d2big.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.d2big.service.MbtiDelete;
import com.d2big.service.MbtiDetail;
import com.d2big.service.MbtiInsert;
import com.d2big.service.MbtiList;
import com.d2big.service.MbtiService;
import com.d2big.service.MbtiUpdate;
import com.d2big.service.MbtiUpdateView;

/**
 * Servlet implementation class Mbticontroller
 */
//@WebServlet("*.do")
public class Mbticontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Mbticontroller() { }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String path = request.getServletPath();
		
		MbtiService service = null;
		
		if(path.equals("/list.do")) {
			// ■  MbtiList			/ 			list.jsp
			service = new MbtiList();
			service.exec(request, response);
			request.getRequestDispatcher("mbtiBoard/list.jsp").forward(request, response);
			
			
		}else if(path.equals("/writeView.do")) {
			// □                    /         mbtiBoard/write.jsp
			request.getRequestDispatcher("mbtiBoard/write.jsp").forward(request, response);
		}else if(path.equals("/write.do")) {
			//  ■  MbtiInsert        / 알림창 +  list.do	
			service = new MbtiInsert();
			service.exec(request, response);
			
			String result = (String) request.getAttribute("result");
			if(result.equals("1")) {
				out.println("<script>alert('글이 작성되었습니다.'); location.href='list.do';</script>"); 
			}else {
				out.println("<script>alert('오잉? 관리자에게 문의해용!'); location.href='write.do';</script>"); 
			}
		}else if(path.equals("/detail.do")) {
			//  ■  MbtiDetail       /          mbtiBoard/detail.jsp
			service = new MbtiDetail();
			service.exec(request, response);
			request.getRequestDispatcher("mbtiBoard/detail.jsp").forward(request, response);
			
		}else if(path.equals("/editView.do")) {
			// ■  MbtiUpdateView   /          mbtiBoard/edit.jsp
			service = new MbtiUpdateView();
			service.exec(request, response);
			request.getRequestDispatcher("mbtiBoard/edit.jsp").forward(request, response);
		}else if(path.equals("/edit.do")) {
			// ■  MbtiUpdate      /  알림창 +  mbtiBoard/detail.jsp 
			service = new MbtiUpdate();
			service.exec(request, response);
			
			int id = Integer.parseInt(request.getParameter("id"));
			String result = (String) request.getAttribute("result");
			
			if(result.equals("1")) {
			out.println("<script>alert('글이 수정되었습니다.'); location.href='detail.do?id="+request.getParameter("id")+"';</script>"); 
			}else {
			out.println("<script>alert('비밀번호를 확인해 주세요.'); history.go(-1);</script>"); 
			}
		
		}else if(path.equals("/deleteView.do")) {
			// □                    /         mbtiBoard/delete.jsp 
			request.getRequestDispatcher("mbtiBoard/delete.jsp").forward(request, response);
			//request.getRequestDispatcher("delete.jsp ");
		}else if(path.equals("/delete.do")) {
			//  ■  MbtiDelete      /  알림창 +  list.do
			service = new MbtiDelete();
			service.exec(request, response);
			
			String result = (String) request.getAttribute("result");
			if(result.equals("1")) {
				out.println("<script>alert('글이 삭제되었습니다.'); location.href='list.do';</script>");

			}
			else {
				out.println("<script>alert('비밀번호를 확인해주세요'); history.go(-1);</script>");
			}
			
		}
		 
	}

}

//ㄴ index.jsp
//ㄴ [전체글보기] /list.do        ■  MbtiList          /          mbtiBoard/list.jsp
//ㄴ [글쓰기폼  ] /writeView.do   □                    /         mbtiBoard/write.jsp
//ㄴ [글쓰기기능]  /write.do      ■  MbtiInsert        / 알림창 +  list.do
//ㄴ [상세보기 ]   /detail.do     ■  MbtiDetail       /          mbtiBoard/detail.jsp 
//ㄴ [글수정폼  ]  /editView.do   ■  MbtiUpdateView   /          mbtiBoard/edit.jsp  
//ㄴ [글수정기능]   /edit.do        ■  MbtiUpdate      /  알림창 +  mbtiBoard/detail.jsp 
//ㄴ [글삭제폼  ]  /deleteView.do □                    /         mbtiBoard/delete.jsp   
//ㄴ [글삭제기능]   /delete.do      ■  MbtiDelete      /  알림창 +  list.do