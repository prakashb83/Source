package com.roo.sample.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.room.sample.view.aaa;

public class customerTest {

	aaa cust;
	
	String name = "ABC"; 
	String email = "ABC@XYZ.COM";
	String bdate = "123456";
	
	@Before
	public void setup(){
		cust = new aaa();
		
		cust.setName(name);
		cust.setEmailid(email);
		cust.setBdate(bdate);
		
	}
	
	@Test
	public void testgetName() {
		Assert.assertEquals(name,cust.getName());
	}
	
	@Test
	public void testsetName() {
		name = "XYZ";
		cust.setName(name);
		Assert.assertEquals(name,cust.getName());
	}
	
	@Test
	public void testgetEmail() {
		Assert.assertEquals(email,cust.getEmailid());
	}
	
	@Test
	public void testsetEmail() {
		email = "ABCDEF@XYZ.COM";
		cust.setEmailid(email);
		Assert.assertEquals(email,cust.getEmailid());
	}
	
	@Test
	public void testgetBdate() {
		Assert.assertEquals(bdate,cust.getBdate());
	}
	
	@Test
	public void testsetBdate() {
		email = "123456";
		cust.setBdate(bdate);
		Assert.assertEquals(bdate,cust.getBdate());
	}
}

