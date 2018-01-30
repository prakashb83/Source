<html>

<head>
</head>
 
 <style>
form {
    border: 3px solid #f1f1f1;
}
  
input[type=text], input[type=password] {
    width: 50%;
    padding: 12px;
    margin: 8px 50px;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 50%;
}

button:hover {
    opacity: 0.8;
}

.center {
    text-align: center;
    margin: auto;
    width: 40%;
    border: 3px solid #73AD21;
    padding: 25px;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
 
<body> 
<div class="form">
      <%session.setAttribute("operation","admin"); %>
         
        <div id="admin">
        
           <%
      try
      {
    	  String page1=(String) session.getAttribute("uname");
    		   %><h1>Welcome Admin</h1><%
      }
      catch(Exception e)
      {
    	  
      }
      %>   

  <form action="/StudentRegistration/LoginServlet" method="post" name="form2">
 
  <div class="center">
  
    <label><b>FirstName</b></label>
    <input type="text" placeholder="Enter FirstName" name="firstname" id="firstname" required><br>

    <label><b>LastName</b></label>
    <input type="text" placeholder="Enter LastName" name="lastname" id="lastname" required><br>

    <label><b>Degree   </b></label>
    <input type="text" placeholder="Enter Degree" name="degree" id="degree" required><br>

    <label><b>Branch   </b></label>
    <input type="text" placeholder="Enter Branch" name="branch" id="branch" required><br>

    <label><b>College  </b></label>
    <input type="text" placeholder="Enter College" name="college" id="college" required> <br>

	<button class="button button-block"/>Check Details</button> 
	  
</form>
 </div>
 
</div> 
	   
</body>

</html>