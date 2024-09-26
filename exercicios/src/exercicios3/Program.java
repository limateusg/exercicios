package exercicios3;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("--- INSTANCIAÇÃO DO OBJETO DE ACCOUNT ---");
		Account conta0 = new Account();
		Account conta1 = new Account(1121, "Mateus", 20000.00);
		
		System.out.println("\n--- INSTANCIAÇÃO DO OBJETO DE BUSINESS ACCOUNT ---");
		BusinessAccount conta2 = new BusinessAccount();
		BusinessAccount conta3 = new BusinessAccount(1121, "Mateus", 20000.00, 100000.00);
		
		System.out.println("\n--- INSTANCIAÇÃO DO OBJETO DE SAVINGS ACCOUNT ---");
		SavingsAccount conta4 = new SavingsAccount();
		SavingsAccount conta5 = new SavingsAccount(1121, "Mateus", 20000.00, 10.0);
		System.out.println("\n--- FIM ---");
	}

}
