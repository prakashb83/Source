<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movies List</title>
<style>


.outputBuild, .outputBuild1{
    width: 170px;
	padding: 10px;
    display: block;
	margin-left : 0px;
}
a{
decoration-style:none;
}
</style>
</head>
<body bgcolor="#C3CDE6">
<center><h1>Recent Movies</h1></center>

 <FORM NAME="form1" ACTION="TicketBooking.jsp" METHOD="POST">
  <INPUT TYPE="HIDDEN" NAME="buttonName">
<table cellpadding="60">
<tr>	
    <td  hspace="50px"><button class = "innerButton outputBuild" name="Velaikaran"    ONCLICK="button1()">Book</button>
	<img src="Velaikaran.jpg"  alt="" height = "150" width = "170"/></td>
	
	<td><button class = "innerButton outputBuild" name="Aruvi"  ONCLICK="button2()" >Book</button>
	<img src="Aruvi.jpg" alt="" height = "150" width = "170"/></td>
	
	<td><button class = "innerButton outputBuild" name="Bhrama"  ONCLICK="button3()">Book</button>
	<img src="Bhrama.jpg" alt="" height = "150" width = "170"/></td>
	
	<td><button class = "innerButton outputBuild" name="Tiger"  ONCLICK="button4()">Book</button>
	<img src="Tiger Zinda hai.jpg" alt="" height = "150" width = "170"/></td>
	
	<td><button class = "innerButton outputBuild" name="Bhaagamathie"  ONCLICK="button5()">Book</button>
     <img src="Bhaagamathie.jpg" alt="" height = "150" width = "170"/></td>
     <tr>
  </table>
    
     </form>
      <SCRIPT LANGUAGE="JavaScript">
           
               function button1()
               {
                   document.form1.buttonName.value = "Velaikaran"
                   form1.submit()
               }    
               function button2()
               {
                   document.form1.buttonName.value = "Aruvi"
                   form1.submit()
               }    
               function button3()
               {
                   document.form1.buttonName.value = "Bhrama"
                   form1.submit()
               }    
               function button4()
               {
                   document.form1.buttonName.value = "Tiger Zinda hai"
                   form1.submit()
               }    
               function button5()
               {
                   document.form1.buttonName.value = "Bhaagamathie"
                   form1.submit()
               }    
        </SCRIPT>
</body>
</html>