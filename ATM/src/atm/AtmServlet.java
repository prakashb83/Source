package atm;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
     
public class AtmServlet extends HttpServlet{
	
	String accNum, pass, origBal = "error", withdrawAmt, depositAmt;
    int count = 0, menuOption = 0;
    double deposit_amt = 0, newBalance = 0; 
    public double currentBal = 0;
    boolean  foundNonDigit;
    
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
	        		+ "#curr { background-color:lightgrey;border: 10px solid #009699; padding: 25px; border-radius: 25px; margin: 25px;width: 300px;}"  
	        		+ ".choice {text-shadow: 4px 3px 0px #fff, 9px 8px 0px rgba(0,0,0,0.15);    font-size: 250%; font-weight: bold;}"
	        		+ "#button{ background-color: #009699;border: none;color: white; padding: 10px 20px;text-align: center;text-decoration: none;"
                    + "display: inline-block; font-size: 16px;margin: 4px 2px;cursor: pointer;}"
	        		+ "</style></head><body style = 'background-color:#e7f5fe;'>");
	         
	        String acc_no = request.getParameter("acc_no");
	        String password = request.getParameter("password");
	      	       	        
	        origBal = checkID(acc_no, password);
	        if(origBal.equals("error"))
                out.println("<center><p class = 'choice' style = 'margin-top:150px;'>ERROR!!! <br/>You have entered the wrong information!!!</p></center>"); 
	        else
                out.println("<center><h2 id = 'curr'>Your Current Balance is <b><br/>Rs. "+ origBal + "</b></h2>");
	        
	        currentBal = Double.parseDouble(origBal);	     	      	       	        	        	
		    out.println("<p class = 'choice'><br/> 1. Display Balance <br/> 2. Deposit<br/> 3. Withdraw <br/> 4. Log Out</p>");
		    out.println("<form method = 'get' action = 'result'><input type = 'text' name = 'menuChoice' style = 'padding:20px;'/>" +
		        		"<input type = 'hidden' name = 'CurrentBalance' value= " + currentBal + ">" +
		        		"<input type = 'hidden' name = 'NewBalance' value = " + newBalance + ">" +
		        		"<br/><br/><button name = 'submit' id = 'button'>Submit</button></form></center>");  
	 		out.println("</body></html>");
		}finally{
		out.close();
		}
	}
	 public static String checkID(String acctNum, String pwd)
	 {
	        String result = "error";
	        //order of storage - "account_number acc_holder_name balance"
	        String user1 = "12345 abc 12500.67";
	        String user2 = "23456 bcd 54340.70";
	        String user3 = "34567 cde 21900.90";
	        
	        if (acctNum.equals(user1.substring(0, user1.indexOf(" "))) && 
	                pwd.equals(user1.substring(user1.indexOf(" ")+1,user1.lastIndexOf(" "))))
	            return result = user1.substring(user1.lastIndexOf(" ") + 1);

	        if (acctNum.equals(user2.substring(0, user2.indexOf(" "))) && 
	                pwd.equals(user2.substring(user2.indexOf(" ")+1,user2.lastIndexOf(" "))))
	            return result = user2.substring(user2.lastIndexOf(" ") + 1);

	        if (acctNum.equals(user3.substring(0, user3.indexOf(" "))) && 
	                pwd.equals(user3.substring(user3.indexOf(" ") + 1,user3.lastIndexOf(" "))))
	            return result = user3.substring(user3.lastIndexOf(" ") + 1);

	        return result;
	 }
	 @Override
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
	      doGet(request, response);
	   }
}
