package view.console;

import model.Rectangle;

public class RectangleConsoleDrawer {
	private Rectangle rectangle;
	
	public RectangleConsoleDrawer(Rectangle rectangle) {
		if (rectangle == null)
			throw new IllegalArgumentException(
					"É necessário uma instância válida de Rectangle.");
		
		this.rectangle = rectangle;
	}
	
	public void draw() {
		for (int i = 0; i < rectangle.getWidth(); i++) {
			for (int j = 0; j < rectangle.getLength(); j++) {
				System.out.print(". ");
			}

			System.out.println();
		}
	}
}
