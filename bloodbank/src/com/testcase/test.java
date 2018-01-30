package com.testcase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bloodbank.setandget;

public class test {

	setandget ss;
	String name="ABC";
	String lname ="CDE";
	String ename = "ABC@XYZ.COM";
	String mname =  "1234567890";
	String adname = "123 Main St,New York";
	String gname = "male";
	String aname = "21";
	String bgname = "A+";

	@Before
	public void setup(){
		ss = new setandget();
		
		ss.setName(name);
		ss.setMname(mname);
		ss.setEname(ename);
		ss.setLname(lname);
		ss.setAdname(adname);
		ss.setAname(aname);
		ss.setGname(gname);
		ss.setBgname(bgname);
	}
	
	@Test
	public void testgetName() {
		Assert.assertEquals(name,ss.getName());
	}
	
	@Test
	public void testsetName() {
		name = "ABC";
		ss.setName(name);
		Assert.assertEquals(name,ss.getName());
	}
	
	@Test
	public void testgetMname() {
		Assert.assertEquals(mname,ss.getMname());
	}
	
	@Test
	public void testsetMname() {
		mname = "1234567890";
		ss.setName(mname);
		Assert.assertEquals(mname,ss.getMname());
	}
	
	@Test
	public void testgetEname() {
		Assert.assertEquals(ename,ss.getEname());
	}
	
	@Test
	public void testsetEname() {
		ename = "ABC@XYZ.COM";
		ss.setName(mname);
		Assert.assertEquals(ename,ss.getEname());
	}
		
	
	@Test
	public void testgetLname() {
		Assert.assertEquals(lname,ss.getLname());
	}
	
	@Test
	public void testsetLname() {
		lname = "CDE";
		ss.setName(lname);
		Assert.assertEquals(lname,ss.getLname());
	}
	
	
	@Test
	public void testgetAdname() {
		Assert.assertEquals(adname,ss.getAdname());
	}
	
	@Test
	public void testsetAdname() {
		adname = "123 Main St,New York";
		ss.setName(adname);
		Assert.assertEquals(adname,ss.getAdname());
	}
	
	@Test
	public void testgetAname() {
		Assert.assertEquals(aname,ss.getAname());
	}
	
	@Test
	public void testsetAname() {
		aname = "21";
		ss.setName(aname);
		Assert.assertEquals(aname,ss.getAname());
	}
	
	@Test
	public void testgetGname() {
		Assert.assertEquals(gname,ss.getGname());
	}
	
	@Test
	public void testsetGname() {
		gname = "male";
		ss.setGname(gname);
		Assert.assertEquals(gname,ss.getGname());
	}
	
	@Test
	public void testgetbgname() {
		Assert.assertEquals(bgname,ss.getBgname());
	}
	
	@Test
	public void testsetBgname() {
		bgname = "A+";
		ss.setBgname(bgname);
		Assert.assertEquals(bgname,ss.getBgname());
	}
}
	
