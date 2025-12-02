package view.console;

import model.Square;

public class SquareConsoleDrawer {
	private Square square;
	
	public SquareConsoleDrawer(Square square) {
		if (square == null)
			throw new IllegalArgumentException(
					"É necessário uma instância válida de Square.");
		
		this.square = square;
	}
	
	public void draw() {
		for (int i = 0; i < square.getSide(); i++) {
			for (int j = 0; j < square.getSide(); j++)
				System.out.print(". ");
			
			System.out.println();
		}
	}
}
