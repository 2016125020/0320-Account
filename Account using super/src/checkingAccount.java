public class checkingAccount extends Account {
	private double credit_limit = 500;
	private double interest = 0.01;
	private double loan_interest = 0.07;
	private double bal;
	
	public checkingAccount(double a){
		super(a);
		this.bal = a;
	}
	
	@Override
	public void debit(double a){
		if(a>credit_limit){
			System.out.print("Over credit limit!\n");
		}else{
			bal = bal-a;
			if(bal < 0){
				System.out.print("You have minus balance!\n");
			}
		}
	}
	
	public void nextMonth(){
		if(bal < 0){
			bal = bal + bal * loan_interest;
		}else{
			bal = bal + bal * interest;
		}
		setBalance(this.bal);
	}
}
