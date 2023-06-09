package entitites;

public class DatasBank {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public DatasBank(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= (withdraw + 5);
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+accountHolder
				+", Balance: $ "
				+String.format("%.2f", balance);
	}
		
	
}