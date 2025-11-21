package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bera.dao.BJoinDao;
import com.bera.dto.BJoinDto;

public class BeraJoin implements BeraService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String passw = request.getParameter("passw");
		String gender = request.getParameter("gender");
		String chk = request.getParameter("chk");
		
		BJoinDao dao = new BJoinDao();
		BJoinDto dto = new BJoinDto();
		
		dto.setUserId(userId);
		dto.setUserName(userName);
		dto.setEmail(email);
		dto.setPassw(passw);
		dto.setGender(gender);
		dto.setChk(chk);
		
		String result = String.valueOf(dao.join(dto));
		// 데이터 넘겨주기
		request.setAttribute("result", result);
		
		
	}

}
