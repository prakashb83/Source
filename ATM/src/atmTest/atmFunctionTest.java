package atmTest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;



public class atmFunctionTest {
	private atmFunction user;
	
	private String user_name = "db";
	private String password = "sdf";
	private double currentBalance = 5689.87;	
	private double deposit_amt = 7890.98;
	private double withdraw_amt = 5643.40;

	
	/*public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		user_name = request.getParameter("username");
		institution = request.getParameter("institution");
		gender = request.getParameter("gender");
		age = Integer.parseInt(request.getParameter("age"));
		languages = request.getParameter("language");
		instructions = request.getParameter("instruction");
	}*/
	
	
	@Before
	public void setup(){
		user = new atmFunction();
		user.setUserName(user_name);
		user.setUserPassword(password);
		user.setUserCurrentBalance(currentBalance);
		user.setUserDeposit_amt(deposit_amt);
		user.setUserWithdraw_amt(withdraw_amt);
	}
	
	@Test
	public void nameTest() {
		assertEquals(user_name,user.getUserName());
	}
	
	@Test
	public void passTest(){
		assertEquals(password, user.getUserPassword());
	}
	
	@Test
	public void currBalTest() {
		assertEquals("" + currentBalance,user.getUserCurrentBalance());
	}
	
	
	@Test
	public void depositTest() {
		assertEquals("" + deposit_amt,user.getUserDeposit_amt());
	}
	
	@Test
	public void withdrawTest() {
		assertEquals("" + withdraw_amt,user.getUserWithdraw_amt());
	}
	
}
