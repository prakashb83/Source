package logindetails;

import org.junit.*;

public class infotest {

	String name;
	String emailId;
	long contactNo;
	String bank;
	long cardNo;
	details dt=new details();
	
	@Test
	public void testgetName() {
		Assert.assertEquals(name, dt.getName());
		
	}
	
	@Test
	public void testsetName() {
		name="fdsa";
		dt.setName(name);
		Assert.assertEquals(name,dt.getName());
		
	}
	@Test
	public void testgetemailId() {
		Assert.assertEquals(emailId, dt.getEmailId());
	}
	@Test
	public void testsetemailId() {
		emailId="abc@gmail.com";
		dt.setEmailId(emailId);
		Assert.assertEquals(emailId,dt.getEmailId());
	}
	@Test
	public void testgetcontactNo() {
		Assert.assertEquals(contactNo, dt.getContactNo());
	}
	@Test
	public void testsetContactNo() {
		contactNo=123;
		dt.setContactNo(contactNo);
		Assert.assertEquals(contactNo,dt.getContactNo());
	}
	@Test
	public void testgetbank() {
		Assert.assertEquals(bank, dt.getBank());
		
	}
	@Test
   public void testsetbank() {
	   bank="HDFC";
	   dt.setBank("HDFC");
	   Assert.assertEquals(bank, dt.getBank());
   }
	
	
	
}
