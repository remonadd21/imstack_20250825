package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.M21DAO;
import com.company.dto.M21DTO;

public class BDetailAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//////////////////// BDetailAction
		//     0. 해당번호 넘겨받기
		//	   1.  dao 부르기
		//     2. [DAO이용해서]  db에서 해당데이터가져오기 / [DAO이용해서]  번호업데이트
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");  
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO(); 
		dto.setBno(Integer.parseInt( request.getParameter("bno"))); 
		if(dao.addHit(dto) >0) {request.setAttribute("dto", dao.detail(dto));  }
	}
}

