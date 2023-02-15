package com.madhu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control in servet 1");
		PrintWriter writer = response.getWriter();
		writer.println("<h1> control in servlet1</h1>");
		RequestDispatcher requestDisp = request.getRequestDispatcher("/second");
		//requestDisp.forward(request, response);
		requestDisp.include(request, response);

	}

}
