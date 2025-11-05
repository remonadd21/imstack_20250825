package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bera.dao.BeraDao;
import com.bera.dto.BeraDto;

public class BeraDetail implements BeraService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idNum = Integer.parseInt(request.getParameter("idNum"));
		BeraDao dao = new BeraDao();
		dao.update_hit(idNum);
		BeraDto result = dao.select(idNum);
		
		request.setAttribute("dto",result);
	}

}
