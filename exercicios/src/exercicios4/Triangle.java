package exercicios4;

public class Triangle extends TwoDShape {
	
	private String style;
	
	public Triangle() {
	}
		
	public Triangle(double h, double w) {
		height = h;
		width = w;
	}
	
	public Triangle(double h, double w, String style) {
		height = h;
		width = w;
		this.style = style;
	}
	
	@Override
	public double area() {
		return height * width / 2;
	}
	
	public String showStyle() {
		return "The style of the triangle is: " + style;
	}

}
