package view;

import model.Square;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import model.Shape;
import view.console.CircleConsoleDrawer;
import view.console.RectangleConsoleDrawer;
import view.console.SquareConsoleDrawer;
import view.console.TriangleConsoleDrawer;

public class Main {
	public static void main(String[] args) {
		Circle circle1 = new Circle("C1", 3);
		Rectangle rectangle1 = new Rectangle("R1", 10, 5);
		Square square1 = new Square("Q1", 10);
		Triangle triangle1 = new Triangle("T1", 10, 10);
		
		Shape square2 = new Square("Q2",12);
		
		System.out.printf(
				"%s - área: %.2f\n", 
				square2.getDescription(),
				square2.area());
		
		System.out.printf(
				"%s - área: %.2f\n", 
				circle1.getDescription(),
				circle1.area());
		
		CircleConsoleDrawer circleConsoleDrawer = 
				new CircleConsoleDrawer(circle1);
		
		System.out.println("Desenho");
		circleConsoleDrawer.draw();
		
		System.out.printf(
				"%s - área: %.2f\n", 
				rectangle1.getDescription(),
				rectangle1.area());
		
		RectangleConsoleDrawer rectangleConsoleDrawer = 
				new RectangleConsoleDrawer(rectangle1);
		
		System.out.println("Desenho");
		rectangleConsoleDrawer.draw();
		
		System.out.printf(
				"%s - área: %.2f\n", 
				square1.getDescription(),
				square1.area());
		
		SquareConsoleDrawer squareConsoleDrawer = 
				new SquareConsoleDrawer(square1);
		
		System.out.println("Desenho");
		squareConsoleDrawer.draw();
		
		System.out.printf(
				"%s - área: %.2f\n", 
				triangle1.getDescription(),
				triangle1.area());
		
		TriangleConsoleDrawer triangleConsoleDrawer = 
				new TriangleConsoleDrawer(triangle1);
		
		triangleConsoleDrawer.draw();
	}
}
