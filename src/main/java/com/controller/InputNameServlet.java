package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/InputNameServlet")
public class InputNameServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		Boolean isErr = false;
		String error = "";
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(name==null || name.isBlank()) {
			
			isErr = true;
			
			error = "Please Enter the name";
			
		}else {
			req.setAttribute("NameValue", name);
		}
		if(email == null || email.isBlank()) {
			isErr = true;
			req.setAttribute("EmailErr", "Please Enter Email");
		}
		else {
			req.setAttribute("EmailValue", email);
		}
		if(password == null || password.isBlank()) {
			isErr = true;			
			req.setAttribute("PassErr", "Please Enter Password");
		}else {
			req.setAttribute("PasswordValue", password);
		}
		if(isErr) {
			
			
			
			RequestDispatcher rd = req.getRequestDispatcher("InputName.jsp");
			req.setAttribute("error", error);
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("OutputName.jsp");
			rd.forward(req, resp);
		}
	}
}
