package bloodbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchservlet
 */
@WebServlet("/searchservlet")
public class searchservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String bgname1 = request.getParameter("bganame");
			if(bgname1.equals("A+") || bgname1.equals("a+"))
			{
				response.sendRedirect("A+.jsp");
			}
			else if(bgname1.equals("A-") || bgname1.equals("a-"))
			{
				response.sendRedirect("A-.jsp");
			}
			else if(bgname1.equals("B+") || bgname1.equals("b+"))
			{
				response.sendRedirect("B+.jsp");
			}
			else if(bgname1.equals("B-") || bgname1.equals("b-"))
			{
				response.sendRedirect("B-.jsp");
			}
			else if(bgname1.equals("O-") || bgname1.equals("o-"))
			{
				response.sendRedirect("O-.jsp");
			}
			else if(bgname1.equals("O+") || bgname1.equals("o+"))
			{
				response.sendRedirect("O+.jsp");
			}
			else if(bgname1.equals("AB-") || bgname1.equals("ab-"))
			{
				response.sendRedirect("AB-.jsp");
			}
			else if(bgname1.equals("AB+") || bgname1.equals("ab+"))
			{
				response.sendRedirect("AB+.jsp");
			}
			else
			{
				PrintWriter ss = response.getWriter();
				ss.println("Enter the correct blood group");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
