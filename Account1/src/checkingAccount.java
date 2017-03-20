
public class checkingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	checkingAccount(double bal, double a, double b, double c){
		super(bal);
		credit_limit = a;
		interest = b;
		loan_interest = c;
	}
	 
	@Override
	public void debit(double a){
		if(a > credit_limit){
			System.out.printf("Over credit limit!\n");
		}else{
			bal = bal - a;
			if(bal < 0){
				System.out.printf("minus!\n");
			}
		}
	}
	
	public void nextMonth(){
		if(bal < 0){
			bal = bal + bal*loan_interest;
		}else{
			bal = bal + bal*interest;
		}
	}
}
