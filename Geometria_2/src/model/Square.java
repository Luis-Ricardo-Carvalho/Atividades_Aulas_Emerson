package model;

public class Square extends Shape {
	private double side;

	public Square(String description, double side) {
		super(description);
		
		validateSide(side);
		
		this.side = side;
	}

	@Override
	public String getDescription() {
		return "Quadrado: " + super.getDescription();
	}

	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		validateSide(side);
		
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * side;
	}
	
	private void validateSide(double side) {
		// DRY (Dont Repeat Yourself)
		if (side <= 0)
			throw new IllegalArgumentException(
					"Lado do quadrado não pode ser menor ou igual a zero.");
	}
}
