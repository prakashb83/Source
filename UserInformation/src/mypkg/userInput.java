package mypkg;


public class userInput {
	private String user_name;
	private String institution;
	private String gender;
	private int age;
	private String languages;
	private String instructions;
	
	public void setUserName(String name){
		this.user_name = name;
	}
	
	public String getUserName(){
		return user_name;
	}
	

	public void setUserInstitution(String institution){
		this.institution = institution;
	}
	
	public String getUserInstitution(){
		return institution;
	}
	
	public void setUserGender(String gender){
		this.gender = gender;
	}
	
	public String getUserGender(){
		return gender;
	}
	
	public void setUserAge(int age){
		this.age = age;
	}
	
	public int getUserAge(){
		return age;
	}
	
	public void setUserLanguages(String lang){
		this.languages = lang;
	}
	
	public String getUserLanguages(){
		return languages;
	}
	
	public void setUserInstruction(String ins){
		this.instructions = ins;
	}
	
	public String getUserInstruction(){
		return instructions;
	}

}
