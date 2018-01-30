package atm;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class withdraw extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
   
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	        out.println("<title>Action Servlet</title>"
	        		+ "<style>"
	        		+ ".curr { background-color:lightgrey;border: 10px solid #009699; padding: 25px; border-radius: 25px; margin: 25px;width: 300px;}" 
	        		+ ".info {text-shadow: 4px 3px 0px #fff, 9px 8px 0px rgba(0,0,0,0.15);font-size: 250%; font-weight: bold;}"
	        		+ "</style></head><body style = 'background-color: #e7f5fe;'>");
	        	
	      
	        double withdraw_amt = Double.parseDouble(request.getParameter("withdraw"));
	        double currentBal = Double.parseDouble(request.getParameter("currentBal"));
	        double newBalance = Double.parseDouble(request.getParameter("newBalance"));
	        
            newBalance = currentBal - withdraw_amt;
            currentBal = newBalance;
            out.println("<center><h2 class = 'curr' style = 'margin-top:200px;'>Your New Balance is <br/>Rs." + currentBal + "<h2><br/><br/><p class = 'info'>Thank You For Using My ATM!!!</p></center>");   
            out.println("</body></html");
        
		}finally{
			out.close();
		}
	}
	}