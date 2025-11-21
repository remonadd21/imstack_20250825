package com.company.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.M21DAO;
import com.company.dto.M21DTO;

public class BUpdateViewAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//////////////////// BUpdateViewAction
		//0.  해당번호 받아오기
		//1.  dao부르기
		//2.  [DAO이용해서]  해당번호 데이터 가져오기
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");  
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO(); 
		dto.setBno(Integer.parseInt( request.getParameter("bno"))); 
		if(dao.addHit(dto) >0) {request.setAttribute("dto", dao.detail(dto));  }
	}
}

