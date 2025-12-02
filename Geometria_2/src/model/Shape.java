package model;

public abstract class Shape {
	private String description;
	
	public Shape(String description) {
		if ("".equals(description))
			throw new IllegalArgumentException(
					"A descrição da forma não pode ser vazia.");
		
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double area();
	
}
