package com.company.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.M21DAO;
import com.company.dto.M21DTO;

public class BDeleteAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//////////////////// BDeleteAction
		//0. 해당번호 , 데이터 가져오기
		//1. dao부르기
		//2. [dao이용해서 ] 비밀번호를 확인한후 비밀번호가 맞다면 데이터 삭제   ★ 성공/실패시알림창
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");  
		M21DAO dao = new M21DAO(); 
		M21DTO dto  = new M21DTO(); 
		dto.setBno(Integer.parseInt(request.getParameter("bno")));
		dto.setBpass(request.getParameter("bpass"));
		if(dao.checkPass(dto) == 1) { // 비밀번호성공
			request.setAttribute("result" , dao.delete(dto));  // 1
			request.setAttribute("result_content" , "삭제에 성공했습니다.");
		}else {// 비밀번호확인
			request.setAttribute("result", 0 );
		}
	}

}
