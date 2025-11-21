package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bera.dao.BJoinDao;
import com.bera.dto.BJoinDto;

public class BeraMypage implements BeraService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String email = (String)request.getSession().getAttribute("email");
		
		BJoinDao dao = new BJoinDao();

		request.setAttribute("dto",dao.mypage(email));

	}

}
