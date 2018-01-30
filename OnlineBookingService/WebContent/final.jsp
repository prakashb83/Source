<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
p
{
font-size:30px;
}
</style>
</head>
<body bgcolor="#C3CDE6">
 <%@ page import="java.io.PrintWriter" %>
 <%!int ticket=20,ticket1=20,ticket2=20,ticket3=20,ticket4=20,cost=0;
 
 %>

        <% String Mname= (String) request.getParameter("MovieName");  
          String TheatreName = (String)request.getParameter((String) request.getParameter("MovieName"));
          String TicketClass =(String)request.getParameter("TicketClass");
          int Tickets=Integer.parseInt(request.getParameter("no"));
        %>
     <center>   
     <p> <b>  Movie name :</b> <%= Mname %></p>
    <p>	<b>Theatre  name : </b><%=  TheatreName  %></p> 
   	  <p><b> Ticket Class :</b> <%=TicketClass %> </p>
   	<p><b> No of Tickets :</b> <%= Tickets %></p>
   	</center>
  <%
	if(Mname.equals("Velaikaran") )
	{
		if(ticket >=Tickets )
		{
			if(TicketClass.equals("Diamond"))
			{
				cost=Tickets*180;
			}
			if(TicketClass.equals("Platinum"))
			{
				cost=Tickets*200;
			}
			if(TicketClass.equals("Gold"))
			{
				cost=Tickets*150;
			}
			ticket=ticket-Tickets;
			%> <center><h1>Total Cost for Our Valuable Service -<%= cost %></h1><br><button ><a href="pay.jsp" style="  text-decoration: none; color:black;">Pay Now</a></button></center><%
		}
		else
		{%>
	<center><h1>Sorry!!!!!!!!!!!!<br>We have only <%= ticket %> Tickets</h1></center>
			
	<%	}
	%>

	<%
	}
	if(Mname.equals("Aruvi") )
	{
	if(ticket1 >=Tickets )
		{
			if(TicketClass.equals("Diamond"))
			{
				cost=Tickets*180;
			}
			if(TicketClass.equals("Platinum"))
			{
				cost=Tickets*200;
			}
			if(TicketClass.equals("Gold"))
			{
				cost=Tickets*150;
			}
			ticket1=ticket1-Tickets;
			%> <center><h1>Total Cost for Our Valuable Service -<%= cost %></h1><br><button ><a href="pay.jsp" style="  text-decoration: none; color:black;">Pay Now</a></button></center><%
		}
		else
		{%>
	<center><h1>Sorry!!!!!!!!!!!!<br>We have only <%= ticket1 %> Tickets</h1></center>
			
	<%	}
	%>

    <%
	}
	if(Mname.equals("Bhrama") )
	{
	if(ticket2 >=Tickets )
		{
			if(TicketClass.equals("Diamond"))
			{
				cost=Tickets*180;
			}
			if(TicketClass.equals("Platinum"))
			{
				cost=Tickets*200;
			}
			if(TicketClass.equals("Gold"))
			{
				cost=Tickets*150;
			}
			ticket2=ticket2-Tickets;
			%> <center><h1>Total Cost for Our Valuable Service -<%= cost %></h1><br><button ><a href="pay.jsp" style="  text-decoration: none; color:black;">Pay Now</a></button></center><%
		}
		else
		{%>
	<center><h1>Sorry!!!!!!!!!!!!<br>We have only <%= ticket2 %> Tickets</h1></center>
			
	<%	}
	%>

   	<%
	}
	if(Mname.equals("Tiger Zinda hai") )
	{
	if(ticket3 >=Tickets )
		{
			if(TicketClass.equals("Diamond"))
			{
				cost=Tickets*180;
			}
			if(TicketClass.equals("Platinum"))
			{
				cost=Tickets*200;
			}
			if(TicketClass.equals("Gold"))
			{
				cost=Tickets*150;
			}
			ticket3=ticket3-Tickets;
			%> <center><h1>Total Cost for Our Valuable Service -<%= cost %></h1><br><button ><a href="pay.jsp" style="  text-decoration: none; color:black;">Pay Now</a></button></center><%
		}
		else
		{%>
	<center><h1>Sorry!!!!!!!!!!!!<br>We have only <%= ticket3 %> Tickets</h1></center>
			
	<%	}
	%>

	<%
	}
	if(Mname.equals("Bhaagamathie") )
	{
	if(ticket >=Tickets )
		{
			if(TicketClass.equals("Diamond"))
			{
				cost=Tickets*180;
			}
			if(TicketClass.equals("Platinum"))
			{
				cost=Tickets*200;
			}
			if(TicketClass.equals("Gold"))
			{
				cost=Tickets*150;
			}
			ticket4=ticket4-Tickets;
			%> <center><h1>Total Cost for Our Valuable Service -<%= cost %></h1><br><button ><a href="pay.jsp" style="  text-decoration: none; color:black;">Pay Now</a></button></center><%
		}
		else
		{%>
	<center><h1>Sorry!!!!!!!!!!!!<br>We have only <%= ticket4 %> Tickets</h1></center>
			
	<%	}
	%>

	<%
	}
	
	%>
 
</body>
</html>