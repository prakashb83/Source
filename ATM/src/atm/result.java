package atm;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class result extends HttpServlet{
	
	@Override
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
	        		+ ".button{ background-color: #009699;border: none;color: white; padding: 10px 20px;text-align: center;text-decoration: none;"
                    + "display: inline-block; font-size: 16px;margin: 4px 2px;cursor: pointer;}"
	        		+ "</style></head><body style = 'background-color: #e7f5fe;'>");
	        	
	        	
	        int menuChoice = Integer.parseInt(request.getParameter("menuChoice"));  
	        
	       double newBalance = Double.parseDouble(request.getParameter("NewBalance"));
	       double currentBal = Double.parseDouble(request.getParameter("CurrentBalance"));
	        
	      
	        if(menuChoice == 1){ 
	        
	         out.println("<center><h2 class = 'curr' style = 'margin-top:200px;'>Your Current Balance is <br/>Rs. "+ currentBal + "</h2></center>");
	        }   
	        else if(menuChoice == 2){
                out.println("<center><p class = 'info'>Enter Deposit Amount </p></center>");
                out.println("<center><form method = 'get' action = 'deposit'><input type = 'text' name = 'deposit' style = 'padding:20px;'/>"  
		        		+ "<input type = 'hidden' name = 'currentBal' value = " + currentBal + ">" 
		        		+ "<input type = 'hidden' name = 'newBalance' value = " + newBalance + ">" 
                		+ "<br/><br/><button name = 'submit' class = 'button'>Submit</button></form></center>");      
	        } 
	      
	        else if(menuChoice == 3){
                out.println("<center><p class = 'info'>Enter Withdrawl Amount  </p></center>");
                
                out.println("<center><form method = 'get' action = 'withdraw'><input type = 'text' name = 'withdraw' style = 'padding:20px;'/>" + 
		        		"<input type = 'hidden' name = 'currentBal' value = " + currentBal + ">" +
		        		"<input type = 'hidden' name = 'newBalance' value = " + newBalance + ">" +
                		"<br/><br/><button name = 'submit' class = 'button'>Submit</button></form></center>");
	        }
                
	        else if(menuChoice == 4){
                out.println("<center><p class = 'info'  style = 'margin-top:150px;'>Thank You For Using My ATM.<br/>Have a Nice Day.<br/> Good-Bye!</p></center>");
	        }
	        else{
	        	out.println("<p>error</p>");
	        } 
	        out.println("</body></html>");
	        }finally{
			out.close();
		}
	}
}
