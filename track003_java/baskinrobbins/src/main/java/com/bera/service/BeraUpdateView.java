package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bera.dao.BeraDao;

public class BeraUpdateView implements BeraService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		int idNum = Integer.parseInt(request.getParameter("idNum"));
		
		BeraDao dao = new BeraDao();
		request.setAttribute("dto", dao.select(idNum));
	}

}
