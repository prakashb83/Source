package com.librarymanagement.servlet;

import java.io.IOException; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.librarymanagement.admin.Administrator;
import com.librarymanagement.bean.LibraryBean;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		LibraryBean libraryBean=new LibraryBean();
		HttpSession session=request.getSession();
		String page=(String) session.getAttribute("operation");
		RequestDispatcher rd;
		if(page.equals("search"))
		{
			Administrator admin=new Administrator();
			String tname=request.getParameter("tname");
			libraryBean=admin.search_book(tname);
			try {
		            RequestDispatcher dispatcher=request.getRequestDispatcher("/result.jsp");
		            request.setAttribute("libraryBean",libraryBean);
		            dispatcher.forward(request, response);
		           
		        } catch (Exception e) {
		            e.printStackTrace();
		        } 
	}
}
}
