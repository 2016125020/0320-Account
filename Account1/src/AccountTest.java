import java.util.Scanner;
public class AccountTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Account account1 = new checkingAccount(1000,1.01,1.07);
		Account account2 = new checkingAccount(1000,1.01,1.07);
		
		account1.setBalance(100);
		account2.setBalance(100);
		
		System.out.printf("Account1 balance : %f\n", account1.getBalance());
		System.out.printf("Account2 balance : %f\n", account2.getBalance());
		
		System.out.printf("Enter deposit amount for Account1 : ");
		double deposit = input.nextDouble();
		account1.credit(deposit);
		
		System.out.printf("Account1 balance : %f\n", account1.getBalance());
		System.out.printf("Account2 balance : %f\n", account2.getBalance());
		
		System.out.printf("Enter deposit amount for Account2 : ");
		double withdrawl = input.nextDouble();
		account2.debit(deposit);
		
		System.out.printf("Account1 balance : %f\n", account1.getBalance());
		System.out.printf("Account2 balance : %f\n", account2.getBalance());
		System.out.printf("next month!\n");
		
		
		System.out.printf("Account1 balance : %f\n", account1.getBalance());
		System.out.printf("Account2 balance : %f\n", account2.getBalance());
	}
}