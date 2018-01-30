package com.studentregistration.test;

  
import org.junit.Assert; 
import org.junit.Test;

import com.studentregistration.bean.StudentBean;

public class LoginTesting {

	
	StudentBean studentBean=new StudentBean();
    public String firstname;
    public String lastname;
    public String degree;   
    public String branch;
    public String college;  


@Test
public void testgetFirstName() {
	Assert.assertEquals(firstname,studentBean.getFirstname());
}


@Test
public void testsetFirstname() {
	firstname = "ABC";
	studentBean.setFirstname(firstname);
	Assert.assertEquals(firstname,studentBean.getFirstname());
}

@Test
public void testgetLastname() {
	Assert.assertEquals(lastname,studentBean.getLastname());
}

@Test
public void testsetLastName() {
	lastname = "DEF";
	studentBean.setLastname(lastname);
	Assert.assertEquals(lastname,studentBean.getLastname());
}

@Test
public void testgetDegree() {
	Assert.assertEquals(degree,studentBean.getDegree());
}

@Test
public void testsetDegree() {
	degree = "BE";
	studentBean.setDegree(degree);
	Assert.assertEquals(degree,studentBean.getDegree());
}

@Test
public void testgetBranch() {
	Assert.assertEquals(branch,studentBean.getBranch());
}

@Test
public void testsetBranch() {
	branch = "ECE";
	studentBean.setBranch(branch);
	Assert.assertEquals(branch,studentBean.getBranch());
}

@Test
public void testgetCollege() {
	Assert.assertEquals(college,studentBean.getCollege());
}

@Test
public void testsetCollege() {
	college = "KIT";
	studentBean.setCollege(college);
	Assert.assertEquals(college,studentBean.getCollege());
}


}
