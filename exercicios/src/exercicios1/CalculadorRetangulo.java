package exercicios1;

import java.util.Scanner;

public class CalculadorRetangulo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter rectangle width and height: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		Retangulo retangulo = new Retangulo(width, height);
		System.out.println("AREA: " + retangulo.area());
		System.out.println("PERIMETER: " + retangulo.perimetro());
		System.out.println("DIAGONAL: " + retangulo.diagonal());

	}

}
