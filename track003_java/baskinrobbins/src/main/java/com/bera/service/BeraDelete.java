package com.bera.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bera.dao.BeraDao;
import com.bera.dto.BeraDto;

public class BeraDelete implements BeraService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String userPass = request.getParameter("userPass");
		int idNum = Integer.parseInt(request.getParameter("idNum"));
		
		BeraDto dto = new BeraDto();
		BeraDao dao = new BeraDao();
		
		dto.setIdNum(idNum);
		dto.setUserPass(userPass);
		
		request.setAttribute("result",String.valueOf(dao.delete(dto)));
	}

}
