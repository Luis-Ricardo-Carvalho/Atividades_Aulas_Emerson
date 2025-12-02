package model;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(String description, 
			double length, double width) {
		super(description);
		validateLength(length);
		validateWidth(width);
		
		this.width = width;
		this.length = length;
	}


	@Override
	public String getDescription() {
		return "Retângulo: " + super.getDescription();
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	@Override
	public double area () {
		return width * length;
	}

	private void validateWidth(double width) {
		if (width <= 0)
			throw new IllegalArgumentException(
					"Largura do retângulo não pode ser menor ou igual a zero.");
	}
	
	private void validateLength(double length) {
		if (length <= 0)
			throw new IllegalArgumentException(
					"Comprimento do retângulo não pode ser menor ou igual a zero.");
	}
}
