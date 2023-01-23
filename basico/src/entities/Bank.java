package entities;

public class Bank {
	public static final double TAX = 5.00;
	
	private int account;
	private String name;
	private double balance;
	
	public Bank() {
		
	}
	
	public Bank(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	
	public Bank(int account, String name, double balance) {

		this.account = account;
		this.name = name;
		this.balance = balance;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	
	public void addBalance(double value) {
		balance += value;
	}
	public void saqueBalance(double value) {
		balance -= value + TAX;
	}
	
	public String toString() {
		return "Update account data: \n"
				+ "Account "
				+ account
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ balance;
	}
	

}
