package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String yearstr = req.getParameter("year");
		String gender = req.getParameter("gender");
		String alpaRegex = "[a-zA-Z]+";
		int year;
		int CurrentYear;
		int MinYear = 1996;
		String error = "";
		Boolean isError = false;
		
		if(name == null || name.isBlank()) {
			error = "Please Enter Your name<br>";
			isError = true;
		}else if(name.matches(alpaRegex)==false) {
			error = "Please Enter Valid  name<br>";
			isError = true;
		}
		 if(yearstr == null || yearstr.isBlank()) {
			error += "Please Enter Your BirthYear<br>";
			isError = true;
		}else {
			year = Integer.parseInt(yearstr);
			Calendar c =  Calendar.getInstance();
			CurrentYear = c.get(Calendar.YEAR);
				if(year > CurrentYear || year < MinYear) {
					error += "Please Enter Valid  BirthYear<br>";
					System.out.print(CurrentYear);
					
					isError = true;
				}
			
		}
		 if(gender == null || gender.isBlank()) {
			error += "Please Enter Your Gender<br>";
			isError = true;
		}
		
		

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(isError) {
			out.print("<font color : red Error>"+error);
		}else {
			Date d = new Date();
			Calendar c =  Calendar.getInstance();
			CurrentYear = c.get(Calendar.YEAR);
			year = Integer.parseInt(yearstr);
			int ans = CurrentYear - year;
		
		if(ans > 21 && gender.equals("male") ) {
			out.print("Candidate name:=>"+name); out.print("<br></br>");
			out.print("Candidate age:=>"+ans);out.print("<br></br>");
			out.print("Candidate BirthYear:=>"+year);out.print("<br></br>");
			
			out.print("You are eligible for voing");out.print("<br></br>");
		}else if(ans > 23 && gender.equals("female")) {
			out.print("Candidate name:=>"+name);out.print("<br></br>");
			out.print("Candidate age:=>"+ans);out.print("<br></br>");
			out.print("Candidate BirthYear:=>"+year);out.print("<br></br>");
			out.print("You are eligible for voing");out.print("<br></br>");
		}else {
			out.print("Candidate name:=>"+name);out.print("<br></br>");
			out.print("Candidate age:=>"+ans);out.print("<br></br>");
			out.print("Candidate BirthYear:=>"+year);out.print("<br></br>");
			out.print("Mat kar lala Mat kar!!!");out.print("<br></br>");
		}
		
		
	}
}
}
