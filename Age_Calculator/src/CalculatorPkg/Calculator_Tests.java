package CalculatorPkg;


import junit.framework.*;

import java.io.*;
import static org.junit.Assert.*;

import org.junit.Assert;
public class Calculator_Tests extends TestCase{
	private CustomerData cust;
	
	private static  int Day=5;
	private static  int Month=3;
	private static  int Year=2018;
	private  static   int BYear=1997;
	private static  int BDay=5;
	private static 	int BMonth=3;
	public  void setup(){
		cust = new CustomerData();
		cust.setDay(Day);
		cust.setMonth(Month);
		cust.setYear(Year);
		cust.setbirthDay(BDay);
		cust.setbirthMonth(BMonth);
		cust.setbirthYear(BYear);
			}
			public void testDate() throws IOException{
				Day=5;
				cust.setDay(Day);
			assertEquals(Day,cust.getDay());
				
			}
			public void testMonth() throws IOException{	
			Month=1;
			cust.setMonth(Month);
			assertEquals(Month,cust.getMonth());
				
			}
			public void testYear() throws IOException{	
				Year=2018;
				cust.setYear(Year);
				assertEquals(2018,cust.getYear());
				
			}
			public void testbirthDate() throws IOException{	
				BDay=5;
				cust.setbirthDay(BDay);
				assertEquals(5,cust.getbirthDay());
				
							}
			public void testbirthMonth() throws IOException{	
				BMonth=3;
				cust.setbirthMonth(BMonth);
			assertEquals(3,cust.getbirthMonth());
				
			}
			public void testbirthYear() throws IOException{
				BYear=1997;
				cust.setbirthYear(BYear);
				assertEquals(1997,cust.getbirthYear());
				
			}
			public void testAllC()
			{
				assertEquals("0 10 20",cust.calculate1(Day,Month,Year,BDay,BMonth,BYear));
			}
	public static Test suite(){
	return new TestSuite(Calculator_Tests.class);
}
}