package exercicios4;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--- CALCULATING TWO DIMENSIONS SHAPES ---");
		System.out.println("FIRST, LETS'S CALCULATE THE DIMENSIONS OF A RECTANGLE:");
		
		System.out.println("ENTER THE HEIGHT: ");
		double h = sc.nextDouble();
		System.out.println("ENTER THE WIDTH: ");
		double w = sc.nextDouble();
		
		Rectangle r1 = new Rectangle(h, w);
		
		if (r1.isSquare()) {
			System.out.println("THE RECTANGLE IS A SQUARE");
		} else {
			System.out.print("");
		}
		
		System.out.println("THE AREA OF THE RECTANGLE IS: ");
		System.out.println(r1.area());
		System.out.println(r1.showDim());
		
		System.out.println("\nNOW, LET'S CALCULATE THE DIMENSIONS OF A TRIANGLE:");
		System.out.println("ENTER THE HEIGHT: ");
		double he = sc.nextDouble();
		System.out.println("ENTER THE WIDTH: ");
		double wi = sc.nextDouble();
		
		Triangle t1 = new Triangle(he, wi);
		
//		System.out.println("DO YOU WANT TO PUT A STYLE IN THE TRIANGLE? YES OR NO");
//		String answer = sc.nextLine();
//		if (answer.matches("yes")) {
//			System.out.println("WHAT STYLE? ");
//			String st = sc.nextLine();
//			Triangle t2 = new Triangle(he, wi, st);
		
		
		System.out.println("THE AREA OF THE TRIANGLE IS: ");
		System.out.println(t1.area());
		System.out.println(t1.showDim());

	}

}
