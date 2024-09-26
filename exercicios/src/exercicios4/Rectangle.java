package exercicios4;

public class Rectangle extends TwoDShape {

	public Rectangle() {
	}

	public Rectangle(double h, double w) {
		height = h;
		width = w;
	}

	public boolean isSquare() {
		if (height == width) {
			return true;
		} else {
			return false;
		}
	}

}
