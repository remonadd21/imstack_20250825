package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bera.dao.BeraDao;

public class BeraList implements BeraService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//1. 데이터 넘겨받기 x
		//2. 드커프리 (PostDao)
		BeraDao dao = new BeraDao(); 
		//3. 데이터 넘겨주기
		request.setAttribute("list", dao.selectAll());
	}

}
