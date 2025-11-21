package com.company.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.M21DAO;
import com.company.dto.M21DTO;

public class BListAction implements BAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		M21DAO dao = new M21DAO();
		request.setAttribute("list", dao.listAll());   
		request.setAttribute("total", dao.listTotal());
		//////////////////// BListAction
		//			1.  dao 부르기
		//			2-1. [DAO이용해서]  전체리스트출력해서 ArrayList로 리턴 
		//			2-2. [DAO이용해서]  전체갯수 출력 리턴 		 
	}
}
