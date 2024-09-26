package exercicios3;

public class SavingsAccount extends Account{
	
	private double interestRate;

	public SavingsAccount() {
		super();
		System.out.println("Construtor Padrão de Savings Account");
	}

	public SavingsAccount(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
		System.out.println("Construtor Parametrizado de Businnes Account: " + interestRate);

	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public void updateBalance(double amount) {
		balance += balance * interestRate;
	}
	

}
