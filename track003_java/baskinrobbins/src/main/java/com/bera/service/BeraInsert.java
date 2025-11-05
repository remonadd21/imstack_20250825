package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bera.dao.BeraDao;
import com.bera.dto.BeraDto;

public class BeraInsert implements BeraService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userid	=	request.getParameter("userid");
		String username	=	request.getParameter("username");
		String userpass	= request.getParameter("userpass");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String usericename = request.getParameter("usericename");		
		
		
//		pstmt.setString(1,dto.getUserId());
//		pstmt.setString(2,dto.getUserName());  
		
		
		// 디커프리
		BeraDao dao = new BeraDao();
		BeraDto dto = new BeraDto();

		
		dto.setUserId(userid);
		dto.setUserName(username);
		dto.setUserPass(userpass);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setUserIcename(usericename);
		String result = String.valueOf(dao.insert(dto));
		
		// 데이터 넘겨주기
		request.setAttribute("result", result);
	}

}
