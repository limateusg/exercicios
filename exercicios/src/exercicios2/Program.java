package exercicios2;

import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter product data: ");
		System.out.print("Product name: ");
		String name = sc.nextLine();
		System.out.print("Product price: ");
		double price = sc.nextDouble();
		System.out.print("Product quantity: ");
		int quantity = sc.nextInt();
		Product p = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println(p);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity1 = sc.nextInt();
		p.addProducts(quantity1);
		System.out.println("Updated data: " + p);
		
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantity2 = sc.nextInt();
		p.removeProducts(quantity2);
		System.out.println("Updated data: " + p);

		
	}

}
