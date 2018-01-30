package CalculatorPkg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * Servlet implementation class AgeServlet
 */
@WebServlet("/AgeServlet")
public class AgeServlet extends HttpServlet {
	 
	   @Override
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
		   PrintWriter out = response.getWriter();
		   try{
			   
		   CustomerData customer=new CustomerData();
        customer.setDay(Integer.parseInt(request.getParameter("Day")));
        customer.setMonth(Integer.parseInt(request.getParameter("Month")));
        customer.setYear(Integer.parseInt(request.getParameter("Year")));
        customer.setbirthDay(Integer.parseInt(request.getParameter("birthDay")));
        customer.setbirthMonth(Integer.parseInt(request.getParameter("birthMonth")));
        customer.setbirthYear(Integer.parseInt(request.getParameter("birthYear")));
        customer.calculate();
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<title>AGE CALCULATOR</title></head>");
        out.println("<body bgcolor='grey'><br>");
        out.println("<center><h1><b> Day :</b>"+customer.getd()+"<br><b>Month :</b>"+customer.getm()+"<br><b>Year :</b>"+customer.gety());
        out.println("</h1><br><a href='index.html'>HOME</a></center></body></html>");
        
	      } finally {
	    out.close();
	      }
	   }
	 
   @Override
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
	      doGet(request, response);
	   }
	 
	}
