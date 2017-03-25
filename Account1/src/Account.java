public class Account {
	protected double balance;
	
	public void credit(double a){ //deposit money
		balance = balance + a;
	}
	
	public void debit(double a){ //withdrawal money
		balance = balance - a;
	}
	
	public double getBalance(){ //show balance
		return balance;
	}
	
	public void setBalance(double a){ //set balance
		balance = a;
	}
}
