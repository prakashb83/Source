package userInf;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class infotest{
	info In=new info();

String name;
String emailId;
long contactNo;
String degree;
	
	@Test
	public void testgetName() {
		Assert.assertEquals(name, In.getName());
		
	}
	
	@Test
	public void testsetName() {
		name="fdsa";
		In.setName(name);
		Assert.assertEquals(name,In.getName());
		
	}
	@Test
	public void testgetemailId() {
		Assert.assertEquals(emailId, In.getEmailId());
	}
	@Test
	public void testsetemailId() {
		emailId="abc@gmail.com";
		In.setEmailId(emailId);
		Assert.assertEquals(emailId,In.getEmailId());
	}
	@Test
	public void testgetcontactNo() {
		Assert.assertEquals(contactNo, In.getContactNo());
	}
	@Test
	public void testsetContactNo() {
		contactNo=123;
		In.setContactNo(contactNo);
		Assert.assertEquals(contactNo,In.getContactNo());
	}
	@Test
	public void testgetdegree() {
		Assert.assertEquals(degree, In.getDegree());
		
	}
	@Test
   public void testsetdegree() {
	   degree="B.E";
	   In.setDegree("B.E");
	   Assert.assertEquals(degree, In.getDegree());
   }
}
