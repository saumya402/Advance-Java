package com.controller;
import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet called()");
		String first = req.getParameter("Firstname");
		String last = req.getParameter("Lastname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println(first);
		System.out.println(last);
		System.out.println(email);
		System.out.println(password);
	}
	
}
