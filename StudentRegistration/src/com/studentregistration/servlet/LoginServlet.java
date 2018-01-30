package com.studentregistration.servlet;

import java.io.IOException;  
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String login(String uname, String pass) {
		String result="";
		if(uname.equals("admin") && pass.equals("admin@123")) {
			result="success";
		}
		return result;  
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session=request.getSession();
		String page=(String) session.getAttribute("operation");
		if(page.equals("login"))
		{
			String uname=request.getParameter("uname");
			String pass=request.getParameter("pass");
			String des=login(uname,pass);
			if(des.equals("success"))
			{
				try 
				{
					session.setAttribute("uname",uname);
					response.sendRedirect("Administrator.jsp");
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				PrintWriter out = response.getWriter();
				session.setAttribute("invalidoperation","invalid");
				       out.println("<script type=\"text/javascript\">");
				       out.println("alert('Username or password incorrect');");
				       out.println("location='login.jsp';");
				       out.println("</script>");
			}
			
		}
		
		if(page.equals("admin"))
		{
			String firstname=request.getParameter("firstname");
			String lastname=request.getParameter("lastname");
			String degree=request.getParameter("degree");
			String branch=request.getParameter("branch");
			String college=request.getParameter("college");
			
			String details="";
			details+=firstname;
			details+=" ";
			details+=lastname;
			details+=" ";
			details+=degree;
			details+=" ";
			details+=branch;
			details+=" ";
			details+=college;	
			
			try 
			{
				session.setAttribute("details",details);
				response.sendRedirect("VerifyDetails.jsp");
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
			
		
	}
}


