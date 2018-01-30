package mypkg;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class userInputTest {
	private userInput user;
	
	private String user_name = "ABC";
	private String institution = "DEF";
	private String gender = "GHI";
	private int age =10 ;
	private String languages ="JKL";
	private String instructions ="MNO";
	
	@Before
	public void setup(){
		user = new userInput();
		user.setUserName(user_name);
		user.setUserInstitution(institution);
		user.setUserGender(gender);
		user.setUserAge(age);
		user.setUserLanguages(languages);
		user.setUserInstruction(instructions);
	}
	
	@Test
	public void nameTest() {
		Assert.assertEquals(user_name,user.getUserName());
	}
	
	@Test
	public void insTest(){
		Assert.assertEquals(institution, user.getUserInstitution());
	}
	
	@Test
	public void genderTest() {
		Assert.assertEquals(gender,user.getUserGender());
	}
	
	
	@Test
	public void ageTest() {
		Assert.assertEquals(age,user.getUserAge());
	}
	
	@Test
	public void languageTest() {
		Assert.assertEquals(languages,user.getUserLanguages());
	}
	
	@Test
	public void instructionTest() {
		Assert.assertEquals(instructions,user.getUserInstruction());
	}
	
}
