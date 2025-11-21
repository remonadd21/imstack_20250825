package com.d2big.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.d2big.dao.PostDao;
import com.d2big.dto.PostDto;

public class MbtiDelete implements MbtiService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 데이터 넘겨받기
		request.setCharacterEncoding("UTF-8");
		String pass = request.getParameter("pass");
		int id = Integer.parseInt(request.getParameter("id"));

		//2. 드커프리
		PostDao dao = new PostDao();
		PostDto dto = new PostDto();
		
		// 3. 데이터 넘기기
		dto.setId(id);
		dto.setPass(pass);
		
		//request.setAttribute("id", id);
		request.setAttribute("result",  String.valueOf( dao.delete(dto)));  
		// 문자열처리~!

	}

}
