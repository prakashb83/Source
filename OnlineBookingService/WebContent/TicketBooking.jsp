<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#C3CDE6"> 
 <%@ page import="java.io.PrintWriter" %>
        <% String Mname= (String) request.getParameter("buttonName");  %>
        	
        <h1 style ="text-transform: uppercase;"><center>THEATRES IN  <%= Mname %></center></h1>	
        
<form name="form2" action ="final.jsp" method="post">
        	<%
        	if(Mname.equals("Velaikaran") )
        	{
        	%>
<center>
	  <INPUT TYPE="HIDDEN" NAME="MovieName" value="Velaikaran"/>
<h1>LIST OF THEATRES</h1>
 <select name="Velaikaran">
  <option value="Sathyam Cinemas">Sathyam Cinemas</option> 
  <option value="Escape Cinemas">Escape Cinemas</option> 
  <option value="Ega Theatre">Ega Theatre</option> 
 </select><br><br><br>

 <h1>TICKET CLASS</h1> 
 <input type="radio" name="TicketClass" value="Platinum">PLATINUM(Rs 200)
 <input type="radio" name="TicketClass" value="Diamond">DIAMOND(Rs 180)
 <input type="radio" name="TicketClass" value="Gold">GOLD(Rs 150)<br><br><br>
<h1>NUMBER OF TICKETS <br><br><input type="number" name="no" value="no" required/><br><br><br></h1>
  </center>
        	<%
        	}
        	if(Mname.equals("Aruvi") )
        	{
        	%>
<center>
  <INPUT TYPE="HIDDEN" NAME="MovieName" value="Aruvi"/>
<h1>LIST OF THEATRES</h1>
 <select name="Aruvi">
  <option value="Kamala Cinemas">Kamala Cinemas</option> 
  <option value="Sangam MultiPlex ">Sangam MultiPlex</option> 
  <option value="Vetri Theatre">Vetri Theatre</option> 
 </select><br><br><br>

 <h1>TICKET CLASS</h1> 
 <input type="radio" name="TicketClass" value="Platinum">PLATINUM(Rs 200)
 <input type="radio" name="TicketClass" value="Diamond">DIAMOND(Rs 180)
 <input type="radio" name="TicketClass" value="Gold">GOLD(Rs 150)<br><br><br>
<h1>NUMBER OF TICKETS <br><br><input type="number" name="no" value="no" required/><br><br><br></h1>
  </center><%
        	}
        	if(Mname.equals("Bhrama") )
        	{
        	%>
        	
<center>
  <INPUT TYPE="HIDDEN" NAME="MovieName" value="Bhrama"/>
<h1>LIST OF THEATRES</h1>
 <select name="Bhrama">
  <option value="AGS Cinemas">AGS Cinemas</option> 
  <option value="Udhayam Theatre">Udhayam Theatre</option> 
  <option value="Albert Theatre">Albert Theatre</option> 
 </select><br><br><br>

 <h1>TICKET CLASS</h1> 
 <input type="radio" name="TicketClass" value="Platinum">PLATINUM(Rs 200)
 <input type="radio" name="TicketClass" value="Diamond">DIAMOND(Rs 180)
 <input type="radio" name="TicketClass" value="Gold">GOLD(Rs 150)<br><br><br>
<h1>NUMBER OF TICKETS <br><br><input type="number" name="no" value="no" required /><br><br><br></h1>
  </center>
           	<%
        	}
        	if(Mname.equals("Tiger Zinda hai") )
        	{
        	%>
        	<center>
        	  <INPUT TYPE="HIDDEN" NAME="MovieName" value="Tiger Zinda hai"/>
<h1>LIST OF THEATRES</h1>
 <select name="Tiger Zinda hai">
  <option value="Jothi Cinemas">Jothi Cinemas</option> 
  <option value="Rasi Theatre">Rasi Theatre</option> 
  <option value="Kasi  Theatre">Kasi  Theatre</option> 
 </select><br><br><br>

 <h1>TICKET CLASS</h1> 
 <input type="radio" name="TicketClass" value="Platinum">PLATINUM(Rs 200)
 <input type="radio" name="TicketClass" value="Diamond">DIAMOND(Rs 180)
 <input type="radio" name="TicketClass" value="Gold">GOLD(Rs 150)<br><br><br>
<h1>NUMBER OF TICKETS <br><br><input type="number" name="no" value="no" required/><br><br><br></h1>
  </center>
        	<%
        	}
        	if(Mname.equals("Bhaagamathie") )
        	{
        	%>
        	<center>
        	 <INPUT TYPE="HIDDEN" NAME="MovieName" value="Bhaagamathie"/>
<h1>LIST OF THEATRES</h1>
 <select name="Bhrama">
  <option value="AGS Cinemas">AGS Cinemas</option> 
  <option value="Udhayam Theatre">Udhayam Theatre</option> 
  <option value="Albert Theatre">Albert Theatre</option> 
 </select><br><br><br>

 <h1>TICKET CLASS</h1> 
 <input type="radio" name="TicketClass" value="Platinum">PLATINUM(Rs 200)
 <input type="radio" name="TicketClass" value="Diamond">DIAMOND(Rs 180)
 <input type="radio" name="TicketClass" value="Gold">GOLD(Rs 150)<br><br><br>
<h1>NUMBER OF TICKETS  <br><br><input type="number" name="no" value="no" required/><br><br><br></h1>
  </center><%
        	}
        	%>
 <center><input type="submit" value="GO"/>    </center>   	
 </form>
</body>
</html>