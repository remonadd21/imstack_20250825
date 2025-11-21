package com.company.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.M21DAO;
import com.company.dto.M21DTO;

public class BWriteAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//////////////////// BWriteAction
		//        0. 데이터 받아오기
		//        1. dao부르기 - db : insert  ★ 알림창
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		M21DAO dao = new M21DAO();
		M21DTO dto  = new M21DTO();
		dto.setBname(request.getParameter("bname"));  
		dto.setBpass(request.getParameter("bpass")); 
		dto.setBtitle(request.getParameter("btitle"));  
		dto.setBcontent(request.getParameter("bcontent"));
		dto.setBcategory("mvcboard2_1");
		request.setAttribute("result", dao.write(dto));
		request.setAttribute("result_content" , "글쓰기에 성공했습니다.");
	}

}
