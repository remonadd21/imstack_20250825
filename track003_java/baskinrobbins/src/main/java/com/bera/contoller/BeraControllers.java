package com.bera.contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bera.service.BeraDelete;
import com.bera.service.BeraDetail;
import com.bera.service.BeraInsert;
import com.bera.service.BeraJoin;
import com.bera.service.BeraList;
import com.bera.service.BeraLogin;
import com.bera.service.BeraMypage;
import com.bera.service.BeraService;
import com.bera.service.BeraUpdate;
import com.bera.service.BeraUpdateView;

/**
 * Servlet implementation class BeraControllers
 */
//WebServlet("/BeraControllers")
public class BeraControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BeraControllers() {}

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
		
		BeraService service = null;
		
		if(path.equals("/joinView.do")) {
			request.getRequestDispatcher("member/join.jsp").forward(request, response);
		}
		else if(path.equals("/join.do")) {
			service = new BeraJoin();
			service.exec(request, response);
			
			String result = (String) request.getAttribute("result");
			if(result.equals("1")) {
				out.println("<script>alert('회원가입에 성공했습니다.'); location.href='loginView.do';</script>");
			}else {
				out.println("<script>alert('관리자에게 문의 주세요.'); history.go(-1);</script>");
			}
		}
		else if(path.equals("/loginView.do")) {
			request.getRequestDispatcher("member/login.jsp").forward(request, response);
		}
		else if(path.equals("/login.do")) {
			service = new BeraLogin();
			service.exec(request, response);
		
			String result = (String) request.getAttribute("result");
			
			if(result.equals("1")) {
				out.println("<script>alert('로그인에 성공했습니다.'); location.href='mypage.do'; </script>");
			}else {
				out.println("<script>alert('관리자에게 연락주세요.'); history.go(-1);</script>");
			} 
		}
		else if(path.equals("/mypage.do")) {
			service = new BeraMypage();
			service.exec(request, response);
			request.getRequestDispatcher("member/mypage.jsp").forward(request, response);
		
		}else if(path.equals("/logout.do")) {
			HttpSession session=  request.getSession();
			session.invalidate(); // 서버에 저장되어 있는 기록 싹다 지우세요
			out.println("<script>alert('로그아웃! 다음에 다시 만나요!'); location.href='list.do'</script>");
			
		}
		else if(path.equals("/list.do")) {
			service = new BeraList();
			service.exec(request, response);
			request.getRequestDispatcher("beraBoard/list.jsp").forward(request, response);
			
		}else if(path.equals("/writeView.do")) {
			request.getRequestDispatcher("beraBoard/write.jsp").forward(request, response);
		}else if(path.equals("/write.do")) {
			service = new BeraInsert();
			service.exec(request, response);
			
			String result = (String) request.getAttribute("result");
			if(result.equals("1")) {
				out.println("<script>alert('고객님의 글이 작성되었습니다.'); location.href='list.do'</script>");
			}else {
				out.println("<script>alert('관리자에게 문의 주세요.'); location.href='write.do'</script>");
			}
		}else if(path.equals("/detail.do")) {
			service = new BeraDetail();
			service.exec(request, response);
			request.getRequestDispatcher("beraBoard/detail.jsp").forward(request, response);
			
		}else if(path.equals("/editView.do")) {
			service = new BeraUpdateView();
			service.exec(request, response);
			request.getRequestDispatcher("beraBoard/edit.jsp").forward(request, response);
			
		}else if(path.equals("/edit.do")) {
			service = new BeraUpdate();
			service.exec(request, response);
			int idNum = Integer.parseInt(request.getParameter("idNum")); 
			String result = (String) request.getAttribute("result");
			
			if(result.equals("1")) {
				out.println("<script>alert('글이 수정되었습니다.'); "
						+ "location.href='detail.do?idNum="+request.getParameter("idNum")+"';</script>");
			}else {
				out.println("<script>alert('관리자에게 연락주세요.'); history.go(-1);</script>");
			}
			
		}else if(path.equals("/deleteView.do")) {
			request.getRequestDispatcher("beraBoard/delete.jsp").forward(request, response);
		}else if(path.equals("/delete.do")) {
			service = new BeraDelete();
			service.exec(request, response);
			
			String result = (String) request.getAttribute("result");
			if(result.equals("1")) {
				out.println("<script>alert('글이 삭제되었습니다.'); location.href='list.do';</script>");
			}else {
				out.println("<script>alert('비밀번호를 확인해주세요.'); history.go(-1);</script>");
			}
			
		}
		
	}

}
