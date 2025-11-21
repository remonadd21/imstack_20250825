package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bera.dao.BJoinDao;
import com.bera.dto.BJoinDto;

public class BeraLogin implements BeraService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String passw = request.getParameter("passw");
		String email = request.getParameter("email");
		
		BJoinDao dao = new BJoinDao();
		BJoinDto dto = new BJoinDto();
		
		dto.setPassw(passw);
		dto.setEmail(email);
		
		// 참, 거짓
		int logs = dao.login(dto);
		// 로그인에 성공했다면 session 설정 
		if(logs==1) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
		}
		
		request.setAttribute("result", logs>0?"1":"-1");

	}

}
