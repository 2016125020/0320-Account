public class Account {
	private double balance;
	Account(double balance){
	
	}
	public void credit(double a){
		balance = balance+a;
	}
	
	public void debit(double a){
		balance = balance-a;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double a){
		balance = a;
	}
}
