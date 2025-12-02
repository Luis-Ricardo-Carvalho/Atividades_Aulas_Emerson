package model;

public class Triangle extends Shape {
	private double bottom;
	private double height;
	
	public Triangle(String description, 
			double bottom, double height) {
		
		super(description);
		
		validateBottom(bottom);
		validateHeight(height);
		
		this.bottom = bottom;
		this.height = height;
	}
	
	@Override
	public String getDescription() {
		return "Triângulo: " + super.getDescription();
	}
	
	public double getBottom() {
		return bottom;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public double area() {
		return (bottom * height) / 2;
	}
	
	private void validateBottom(double bottom) {
		if (bottom <= 0)
			throw new IllegalArgumentException(
					"Base do triângulo não pode ser menor ou igual a zero.");
	}
	
	private void validateHeight(double height) {
		if (height <= 0)
			throw new IllegalArgumentException(
					"Altura do triângulo não pode ser menor ou igual a zero.");
	}
}
