package exercicios1;

public class Retangulo {

	private double width;
	private double height;

	public Retangulo(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return this.height * this.width;
	}

	public double perimetro() {
		return 2 * this.height + 2 * this.width;
	}

	public double diagonal() {
		return Math.sqrt((this.height * this.height) + (this.width * this.width));
	}
}
