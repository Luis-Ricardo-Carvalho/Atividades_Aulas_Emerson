package view.console;

import model.Circle;

public class CircleConsoleDrawer {
	private Circle circle;
	
	public CircleConsoleDrawer(Circle circle) {
		if (circle == null)
			throw new IllegalArgumentException(
					"É necessário uma instância válida de Circle.");
		
		this.circle = circle;
	}
	
	public void draw() {
		// Variáveis locais do método
		double localRadius = circle.getRadius();

		// Para padronizar o desenho
		if (localRadius % 2 == 0)
			localRadius = localRadius + 1;
		
		// O modificador 'final' declara variáveis que não
		// podem ter seus valores alterados, portanto, declara constantes
		final String empty = "  ";
		final String character = ". ";
		
		double length = localRadius * 2;
		double initialEliminationPercentage = 30.0;
		double percentageRemainingElimination = 100.0 - initialEliminationPercentage;
		double percentageElimination = initialEliminationPercentage;

		// Primeiro e segundo quadrantes
		double remove = Math.round(percentageElimination/100.0 * length);
		for (int i = 0; i < localRadius; i++) {
			for (int j = 0; j < length; j++) {
				if (i % 2 == 1 || j < remove || j >= length - remove) {
					System.out.print(empty);
				} else {
					System.out.print(character);
				}
			}

			System.out.println();
			
			percentageElimination = percentageElimination - percentageRemainingElimination / localRadius;
			remove = Math.round(percentageElimination / 100.0 * length);
		}
		
		// Terceiro e quarto quadrantes
		remove = 0;
		for (int i = 0; i < localRadius + 1; i++) {
			for (int j = 0; j < length; j++) {
				if (i % 2 == 0 || j < remove || j >= length - remove) {
					System.out.print(empty);
				} else {
					System.out.print(character);
				}
			}

			System.out.println();
			
			percentageElimination = percentageElimination + percentageRemainingElimination / localRadius;
			remove = Math.round(percentageElimination / 100.0 * length);
		}
	}
}
