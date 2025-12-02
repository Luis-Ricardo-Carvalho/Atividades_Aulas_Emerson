package model;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String description, double radius) {
		super(description);
		
		validateRadius(radius);
		
		this.radius = radius;
	}
	
	@Override
	public String getDescription() {
		return "Circulo: " + super.getDescription();
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double area() {
		// A classe Math tem uma série de constantes e métodos para cálculos
		// Como 'PI' e 'pow' para exponencial
		return Math.PI * Math.pow(radius, 2);
	}
	
	private void validateRadius(double radius) {
		if (radius <= 0)
			throw new IllegalArgumentException(
					"Raio do círculo não pode ser menor ou igual a zero.");
	}
}
