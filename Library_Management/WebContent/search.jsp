<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Topic Name</title>
</head>
<style>
.center {
    text-align: center;
    margin: auto;
    width: 60%;
    border: 3px solid #73AD21;
    padding: 10px;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}

</style>

<body>

<div class="form">
      <%session.setAttribute("operation","search"); %>
       
        <div id="login">   
          <h1>Enter Topic Name to Search</h1>

   <form action="/Library_Management/MainServlet" method="post" name="form2">
            <br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
          <div class="center">
              <h2><label><b>TopicName : </b></label>
              <select name="tname" id="tname">
                    <option value="Java">Java</option>
                    <option value="Python">Python</option>
                    <option value="JavaScript">JavaScript</option>
                    <option value="SQL">SQL</option>
                    <option value="PHP">PHP</option>
   
</select></h2><br>
                    
          <button class="button">Search</button>
          </div>
          </form>
          </div>
    </div>

</body>
</html>