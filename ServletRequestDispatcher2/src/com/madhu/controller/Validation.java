package com.madhu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/valid")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("control in servlet1");
	String userName = request.getParameter("userName");
	String userPssword = request.getParameter("userPassword");
	System.out.println(userName+" "+userPssword);
	if(userName.equals("madhu")&& userPssword.equals("madhu")) {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
		requestDispatcher.forward(request, response);
	}else {
		ServletContext servletContext = request.getServletContext();
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/error.jsp");
	requestDispatcher.forward(request, response);
	}
	
	}

}
