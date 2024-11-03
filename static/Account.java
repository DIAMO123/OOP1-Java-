import java.lang.*;


public class Account{
	private int accountNo;
	private double balance;
	public static double perDayTransactionLimit= 500;
	
	public Account( ){ }
	public Account(int an, double b){
		accountNo = an;
		balance = b;
	}
	int getaccountNo()
	{
		return accountNo;
	}
	double getbalance()
	{
		return balance;
	}
	public void addInterest(double rate){
		balance  = balance + (balance * rate / 100);
	}
	 void viewdetails( ){
		System.out.println("AccountNo: "+accountNo);
		System.out.println("Balance: "+balance);
	}
	public static void main (String[] args)
	{
		Account a =new Account();
		Account a1 =new Account(1232,200);
		a1.viewdetails( );
	}
	
}
