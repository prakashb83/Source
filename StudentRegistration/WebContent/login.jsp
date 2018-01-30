
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
 <style>
form {
    border: 5px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 35%;
    padding: 12px;
    margin: 8px 50px;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

.center {
    text-align: center;
    margin: auto;
    width: 40%;
    border: 3px solid #73AD21;
    padding: 25px;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 35%;
}

button:hover {
    opacity: 0.8;
}

.button-block {
  display: block;
  width: 35%;
}

.cancelbtn {
    display: block;
    width: 35%;
}

.imgcontainer {
    text-align: center;
    margin: 12px 0 12px 0;
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
       width: 50%;
    }
}
</style>
<body>
 <div class="form">
      <% session.setAttribute("invalidoperation","valid");
         session.setAttribute("operation","login"); %>
         
        <div id="login">   
          <h1>Admin's Login page</h1>
          
          <form action="/StudentRegistration/LoginServlet" method="post" name="form2">
          
     <div class="imgcontainer">
    <img src="https://www.glsen.org/sites/default/files/LOGIN.jpg" alt="Avatar" class="avatar">
    </div>
          
          <div class="center">
              <label><b>UserName</b></label>
              <input type="text" name="uname" id="uname"/><br>
              <label><b>Password</b></label>
              <input type="password" name="pass" id="pass"/><br>
          
          <button class="button"/>Log In</button><br>
          <button class="button" type="reset"/>cancel</button>
          </div>
          </form>

        </div>
       <%
      try
      {
    	  String page1=(String) session.getAttribute("invalidoperation");
    	  
    	  if(page1.equals("invalid"))
    	  {
    		   %><script type="text/javascript" language="javascript"> alert("Invalid username & Password")</script><%
    	  }
      }
      catch(Exception e)
      {
    	  
      }
      %>
</div> 
</body>
</html>
