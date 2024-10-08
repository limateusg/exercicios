package exercicios3;

public class Account {

	private int number;
	private String holder;
	protected double balance;

	public Account() {
		System.out.println("Construtor Padrão de Account");
	}

	public Account(int number, String holder, double balance) {
		System.out.println("Construtor Parametrizado de Account: " + number + ", " + holder + ", " + balance);
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	

}
