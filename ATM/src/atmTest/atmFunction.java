package atmTest;

public class atmFunction {
	private String user_name;
	private String password;
	private double currentBalance;
	private double deposit_amt;
	private double withdraw_amt;
	
	
	public void setUserName(String name){
		this.user_name = name;
	}
	
	public String getUserName(){
		return user_name;
	}
	

	public void setUserPassword(String password){
		this.password = password;
	}
	
	public String getUserPassword(){
		return password;
	}
	
	public void setUserCurrentBalance(double currentBalance){
		this.currentBalance = currentBalance;
	}
	
	public String getUserCurrentBalance(){
		return "" + currentBalance;
	}
	
	public void setUserDeposit_amt(double amt){
		this.deposit_amt = amt;
	}
	
	public String getUserDeposit_amt(){
		return "" + deposit_amt;
	}
	
	public void setUserWithdraw_amt(double amt){
		this.withdraw_amt = amt;
	}
	
	public String getUserWithdraw_amt(){
		return "" + withdraw_amt;
	}

}
