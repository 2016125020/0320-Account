public class checkingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	checkingAccount(double a, double b, double c){
		credit_limit = a;
		interest = b;
		loan_interest = c;
	}
	
	@Override
	public void debit(double a){
		if(a>credit_limit){
			System.out.print("Over credit limit!\n");
		}else{
			balance = balance-a;
			if(balance < 0){
				System.out.print("You have minus balance!\n");
			}
		}
	}
	
	public double nextMonth(){
		if(balance < 0){
			balance = balance + balance * loan_interest;
		}else{
			balance = balance + balance * interest;
		}
		
		return balance;
	}
}
