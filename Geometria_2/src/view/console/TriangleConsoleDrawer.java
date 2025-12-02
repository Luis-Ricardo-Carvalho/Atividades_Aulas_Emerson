package view.console;

import model.Triangle;

public class TriangleConsoleDrawer {
	private Triangle triangle;

	public TriangleConsoleDrawer(Triangle triangle) {
		if (triangle == null)
			throw new IllegalArgumentException("É necessário uma instância válida de Triangle.");

		this.triangle = triangle;
	}

	public void draw() {
		double localBottom = triangle.getBottom();

		// Aumenta a base par em 1 para o desenho ter centro
		if (triangle.getBottom() % 2 == 0)
			localBottom += 1;

		// Dimensiona a base com a altura
		int linesToJump = 2;
		if (localBottom < triangle.getHeight())
			linesToJump += Math.round(triangle.getHeight() / localBottom);

		int bottomMidle = (int) localBottom / 2;
		int pointsIncrement = 0;

		for (int i = 0; i < triangle.getHeight(); i++) {
			if (i % linesToJump == 0) {
				for (int j = 0; j < localBottom; j++) {
					if (j < bottomMidle - pointsIncrement || j > bottomMidle + pointsIncrement) {
						System.out.print("  ");
					} else {
						System.out.print(". ");
					}
				}

				if (localBottom > triangle.getHeight()) {
					pointsIncrement += Math.round(localBottom / triangle.getHeight());
				} else {
					pointsIncrement++;
				}
			}

			System.out.println();
		}
	}
}
