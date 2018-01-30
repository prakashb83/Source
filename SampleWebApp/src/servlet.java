import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


import org.apache.jasper.tagplugins.jstl.core.Out;

import com.room.sample.view.aaa;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet") 
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = request.getParameter("username");
		String email = request.getParameter("emailid");
		String bdate = request.getParameter("bdate");
		/*response.getWriter().println(name);
		response.getWriter().println(email);
		response.getWriter().println("This is from servlet page");*/
		aaa customer=new aaa();
        customer.setName(name);
        customer.setEmailid(email);   
        customer.setBdate(bdate);
        String data;
        if(name.equals("suren") && email.equals("suren@gmail.com") && bdate.equals("123456"))
        { 
        	try
    		{
        		System.out.println("hi if");
        		session.setAttribute("cust",name);
    			session.setAttribute("bbb",bdate);
                response.sendRedirect("ip.jsp");
    		}
        	catch (Exception e) 
    		{
    			// TODO: handle exception
    		}
        }
        else
        {
        	PrintWriter out = response.getWriter();
            session.setAttribute("invalid","invalid");
            response.setContentType("text/html"); 
            out.println("<script type='text/javascript'>");
            out.println("alert('invalid')");
            out.println("</script>");
            out.println("<a href='index.jsp'>Go to previous page</a>");
        }
		
	}

}
