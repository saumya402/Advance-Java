package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n1Str = req.getParameter("no1");
		int n1 = Integer.parseInt(n1Str);
		String n2Str = req.getParameter("no2");
		int n2 = Integer.parseInt(n2Str);
		String opr = req.getParameter("opr");
		
		PrintWriter out = resp.getWriter();
		if(opr.equals("add")) {
			out.print(n1+n2);
		}else if(opr.equals("sub")) {
			out.print(n1 - n2);
		}
		else if(opr.equals("mul")) {
			out.print(n1 * n2);
		}
		else{
			out.print(n1 / n2);
		}
	}
}
