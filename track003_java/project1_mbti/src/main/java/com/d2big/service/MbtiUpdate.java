package com.d2big.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.d2big.dao.PostDao;
import com.d2big.dto.PostDto;

public class MbtiUpdate implements MbtiService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 데이터 넘겨받기
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String pass = request.getParameter("pass");
		int id = Integer.parseInt(request.getParameter("id"));

		
		//2. 드커프리
		PostDao dao = new PostDao();
		PostDto dto = new PostDto();
		
		dto.setTitle(title);
		dto.setContent(content);
		dto.setPass(pass);
		dto.setId(id);
		
		// 3. 데이터 넘기기
		//request.setAttribute("id", id);
		request.setAttribute("result",  String.valueOf( dao.update(dto)));  
		// 문자열처리~!
		

	}

}
