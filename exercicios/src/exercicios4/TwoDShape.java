package exercicios4;

public class TwoDShape {
	
	protected double height;
	protected double width;
	
	public TwoDShape() {
	}
	
	public TwoDShape(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public String showDim() {
		return "Width and height are: " + String.valueOf(width) + ", " + String.valueOf(height);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return height * width;
	}

}
