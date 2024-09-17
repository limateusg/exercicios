package exercicios;

public class CurrencyConverter {

	public static final double IOF = 1.06;

	public static double conversor(double reais, double dolares) {
		return reais * dolares * IOF;
	}

}
