package exercicios3;

public class BusinessAccount extends Account{
	
	private double loanLimit;
	
	public BusinessAccount() {
		super();
		System.out.println("Construtor Padrão de Businnes Account");
	}
	
	public BusinessAccount(int n, String h, double b, double l) {
		super(n, h, b);
		this.loanLimit = l;
		System.out.println("Construtor Parametrizado de Businnes Account: " + l);
	}
	

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

}
