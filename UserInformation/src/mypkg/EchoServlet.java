package mypkg;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
 
public class EchoServlet extends HttpServlet {
 
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();
 
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<style>body{background-color:#DCDCDC;} h2{color: #00008B;}b{color: #191970;}");
         out.println(" a:link,a:visited {background-color: black; color: white; padding: 10px 21px;text-align: center; text-decoration: none;display: inline-block;}");
         out.println("b {font-size:120%;}</style>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Echo Servlet</title></head>");
         out.println("<body><center><fieldset><legend><h2>Your Information</h2></legend>");
        
         String username = request.getParameter("username");
         if (username == null
               || (username = htmlFilter(username.trim())).length() == 0) {
            out.println("<p><b>Name: </b> MISSING</p>");
         } else {
            out.println("<p><b>Name: </b> " + username + "</p>");
         }
         
         String institution = request.getParameter("institution");
         if (institution == null
               || (institution = htmlFilter(institution.trim())).length() == 0) {
            out.println("<p><b>Institution: </b>MISSING</p>");
         } else {
            out.println("<p><b>Institution: </b>" + institution + "</p>");
         }
 
         String gender = request.getParameter("gender");
         if (gender == null) {
            out.println("<p><b>Gender: </b>MISSING</p>");
         } else if (gender.equals("m")) {
            out.println("<p><b>Gender: </b>Male</p>");
         } else {
            out.println("<p><b>Gender: </b>Female</p>");
         }

         String age = request.getParameter("age");
         if (age == null) {
            out.println("<p><b>Age: </b>MISSING</p>");
         } else if (age.equals("18")) {
            out.println("<p><b>Age: </b>&lt; 18 years old</p>");
         } else if (age.equals("50")) {
            out.println("<p><b>Age: </b>18 to 50 years old</p>");
         } else {
            out.println("<p><b>Age: </b>&gt; 50 years old</p>");
         }
 
         String language = request.getParameter("language");
         if (language == null || language.length() == 0) {
            out.println("<p><b>Language Known: </b>NONE</p>");
         } else {
            out.println("<p><b>Language Known: </b>");
               if (language.equals("c")) {
                  out.println("C/C++ ");
               } else if (language.equals("cs")) {
                  out.println("C# ");
               } else if (language.equals("java")) {
                  out.println("Java ");
               }
            }
            out.println("</p>");
         
 
         String instruction = request.getParameter("instruction");
         if (instruction == null
              || (instruction = htmlFilter(instruction.trim())).length() == 0
              || instruction.equals("Enter your instruction here...")) {
            out.println("<p><b>About Yourself: </b>NONE</p>");
         } else {
            out.println("<p><b>About Yourself: </b>" + instruction + "</p>");
         }
 
         /*Enumeration names = request.getParameterNames();
         out.println("<p><b>Request Parameter Names </b>: ");
         if (names.hasMoreElements()) {
            out.print(htmlFilter(names.nextElement().toString()));
         }
         do {
            out.print(", " + htmlFilter(names.nextElement().toString()));
         } while (names.hasMoreElements());
         out.println(".</p>");*/
 
         out.println("<a href='form_input.html'>BACK</a></center>");
         out.println("</body></html>");
      } finally {
         out.close();  
      }
   }
 

   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      doGet(request, response);
   }
 
  
   private static String htmlFilter(String message) {
      if (message == null) return null;
      int len = message.length();
      StringBuffer result = new StringBuffer(len + 20);
      char aChar;
 
      for (int i = 0; i < len; ++i) {
         aChar = message.charAt(i);
         switch (aChar) {
             case '<': result.append("&lt;"); break;
             case '>': result.append("&gt;"); break;
             case '&': result.append("&amp;"); break;
             case '"': result.append("&quot;"); break;
             default: result.append(aChar);
         }
      }
      return (result.toString());
   }
}