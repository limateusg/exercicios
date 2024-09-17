package exercicios;

import java.util.*;

public class Dollar {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		double finalValue = CurrencyConverter.conversor(dollarPrice, dollars);
		System.out.print("Amount to be pais in reais: " + finalValue);
	}
}
