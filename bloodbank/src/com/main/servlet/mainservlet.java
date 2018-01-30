package com.main.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bloodbank.setandget;

/**
 * Servlet implementation class mainservlet
 */
@WebServlet("/mainservlet")
public class mainservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
		setandget ss = new setandget();
		ss.setName(request.getParameter("name"));
		ss.setLname(request.getParameter("lname"));
		ss.setMname(request.getParameter("mname"));
		ss.setGname(request.getParameter("gname"));
		ss.setEname(request.getParameter("ename"));
		ss.setAname(request.getParameter("aname"));
		ss.setAdname(request.getParameter("adname"));
		ss.setBgname(request.getParameter("bgname"));
		ss.setLoginname(request.getParameter("loginname"));
		ss.setLoginpname(request.getParameter("loginpname"));
		 RequestDispatcher dispatcher=request.getRequestDispatcher("answer.jsp");
         //Set the customer instance into request.Then only the customer object 
         //will be available in the Welcome.jsp page
         request.setAttribute("ssinfo",ss);
         dispatcher.forward(request, response);
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
			e.printStackTrace();
		}
	}

}
