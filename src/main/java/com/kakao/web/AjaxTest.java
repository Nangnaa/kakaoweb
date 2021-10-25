package com.kakao.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ajaxTest")
public class AjaxTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("user_name");
		String phone = request.getParameter("user_phone");
		System.out.println(name);
		System.out.println(phone);
//		data부분
		
		response.setContentType("text/html; charset=UTF-8");
//		response.getWriter().print(name + "," + phone);
		response.getWriter().print("{\"user_name2\" : \"준일\"}");
	}

}
