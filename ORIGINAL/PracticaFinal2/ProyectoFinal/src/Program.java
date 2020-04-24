import java.util.Locale;
import edu.uc3m.game.GameBoardGUI;

public class Program {
	protected static int contador_id = 0;
	protected static GameBoardGUI board = new GameBoardGUI(Constantes.BOARD_WIDTH, Constantes.BOARD_HEIGHT);
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en"));
		
		Jugador Jugador = new Jugador(3, "player.png", 85, 200, contador_id, 0, 0, 0);
		contador_id++;
		
		FactoryNivel factory = new FactoryNivel();
		
		for (int ii = 0; ii < Constantes.BOARD_WIDTH; ii++) {
			for (int jj = 0; jj < Constantes.BOARD_HEIGHT; jj++) {
				board.gb_setSquareColor(ii, jj, 0, 0, 0);
			}
		}
		
		
		board.gb_moveSpriteCoord(Jugador.getId(), Jugador.getX(), Jugador.getY());
		board.gb_setSpriteVisible(Jugador.getId(), true);
		board.gb_setTextPlayerName("Gálaga");
		board.gb_setTextPointsUp("Points");
		board.setVisible(true);
		
		do {
			String lastAction = board.gb_getLastAction().trim();
			if (lastAction.length() > 0) {
				board.gb_println(lastAction);
				System.out.println(lastAction);
				switch (lastAction) {
				case "right":
					if((Jugador.getX()+5) < 170){
						Jugador.mover(Constantes.DIR_E, 1);
					}
					break;
				case "left":
					if((Jugador.getX()-5) > 0){
						Jugador.mover(Constantes.DIR_W, 1);
					}
					break;
				case "tab":
					break;
				case "space":
					board.gb_addSprite(contador_id, "torpedo100.png", true);
					board.gb_setSpriteVisible(contador_id, true);
					new Thread(Jugador).start();
					++contador_id;
					break;
				}
				
				//board.gb_setSpriteImage(Jugador.getId(), Jugador.getImagen());
				//board.gb_moveSpriteCoord(Jugador.getId(), Jugador.getX(), Jugador.getY());

			}
			try {
				Thread.sleep(50L);
			} catch(Exception e) {
				System.out.println("Error");
			}

		} while (true);
	}

}
