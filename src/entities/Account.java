package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	private static final double TAX = 5.00;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount){
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + TAX;
		
	}
	
	@Override
	public String toString() {
		return "Account data: "
				+ "\nAccount: "
				+ number
				+ "\nHolder: "
				+ holder
				+ "\nBalance: $"
				+ String.format("%.2f", balance);
	}
}
