package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bera.dao.BeraDao;
import com.bera.dto.BeraDto;

public class BeraUpdate implements BeraService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId		= request.getParameter("userId");
		String userName		= request.getParameter("userName");
		String userPass		= request.getParameter("userPass");
		String title		= request.getParameter("title");
		String content		= request.getParameter("content");
		String userIcename	= request.getParameter("userIcename");
		
		int idNum= Integer.parseInt(request.getParameter("idNum"));
		
		System.out.println("1");
		
		// 드커프리 
		BeraDao dao = new BeraDao();
		BeraDto dto = new BeraDto();
		dto.setUserId(userId);
		dto.setUserName(userName);
		dto.setUserPass(userPass);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setUserIcename(userIcename);
		dto.setIdNum(idNum);

		
		System.out.println("2: " + dto );
		String result = String.valueOf(dao.update(dto));
		System.out.println("3 : " + result);
		
		// 데이터 텀기기
		request.setAttribute("result", result);
		
		
	}

}
