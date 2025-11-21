package com.company.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.M21DAO;
import com.company.dto.M21DTO;

public class BUpdateAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//////////////////// BUpdateAction
		//0. 해당번호 , 데이터 가져오기
		//1. dao부르기
		//2. [dao이용해서 ] 비밀번호를 확인한후 비밀번호가 맞다면 데이터 업데이트  ★ 성공/실패시알림창
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");  
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO(); 
		dto.setBno(Integer.parseInt(request.getParameter("bno")));
		dto.setBpass(request.getParameter("bpass"));
		if(dao.checkPass(dto) == 1) { // 비밀번호성공
			dto.setBtitle(request.getParameter("btitle"));  		
			dto.setBcontent(request.getParameter("bcontent"));    
			request.setAttribute("result" , dao.edit(dto));  // 1
			request.setAttribute("result_content" , "수정에 성공했습니다.");
		}else {// 비밀번호확인
			request.setAttribute("result", 0 );
		}
	}

}
