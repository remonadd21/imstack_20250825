package com.d2big.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.d2big.dao.PostDao;
import com.d2big.dto.PostDto;

public class MbtiDetail implements MbtiService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 데이터 넘겨받기
		int id = Integer.parseInt(request.getParameter("id"));
		// 2. Dao
		PostDao dao = new PostDao();
		dao.update_hit(id);
		PostDto result = dao.select(id);
		
		// 3. 데이터 넘겨주기
		request.setAttribute("dto", result);
	}

}
