
<html>

<head>
</head>
  
<style>
.center {
    text-align: center;
    margin: auto;
    width: 60%;
    border: 3px solid #73AD21;
    padding: 10px;
}


table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

<body>
<div class="center">
      <%session.setAttribute("operation","admin"); %>
         
        <div id="verify">
        
           <%
      try
      {
    	   String details=(String) session.getAttribute("details");
    	   String data[]=details.split(" ");
    		   %><h1>Welcome <%= data[0]+" "+data[1] %><h1>
    		   <p> Here Your Details : <p>
<table>
  <tr>
    <td>Name</td>
    <td> <%= data[0]+" "+data[1] %> </td>
  </tr>
    <tr>
    <td>Degree</td>
    <td><%= data[2]%></td>
  </tr>
  <tr>
    <td>Branch</td>
    <td><%= data[3]%></td>
  </tr>
  <tr>
    <td>College</td>
    <td><%= data[4]%></td>
  </tr>
</table><%
      }
      catch(Exception e)
      {
    	  
      }
      %> 
<a type="submit" href="/StudentRegistration/success.jsp">SUBMIT</a>
	  
</form>

</div>
</body>

</html>