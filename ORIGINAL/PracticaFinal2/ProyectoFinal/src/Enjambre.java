
public class Enjambre extends Caracteristicas{
	
	private Enemigo[] enjambre;
	
	public Enjambre(int[][] posiciones, int tipoenemigo) {
		enjambre = new Enemigo[posiciones.length];
		if (tipoenemigo == 1) {
			for (int contador = 0; contador < posiciones.length; contador++) {
				enjambre[contador] = new Enemigo(100, "enemy300.png", posiciones[contador][0], posiciones[contador][1], Program.contador_id, 0, Constantes.DIR_N, 1);
				Program.board.gb_addSprite(Program.contador_id, enjambre[contador].getImagen(), true);
				Program.board.gb_moveSpriteCoord(Program.contador_id, enjambre[contador].getX(), enjambre[contador].getY());
				Program.board.gb_setSpriteVisible(Program.contador_id, true);
				++Program.contador_id;
			}
		}
		
		if (tipoenemigo == 2) {
			for (int contador = 0; contador < posiciones.length; contador++) {
				enjambre[contador] = new Enemigo(250, "enemy200.png", posiciones[contador][0], posiciones[contador][1], Program.contador_id, 0, Constantes.DIR_N, 2);
				Program.board.gb_addSprite(Program.contador_id, enjambre[contador].getImagen(), true);
				Program.board.gb_moveSpriteCoord(Program.contador_id, enjambre[contador].getX(), enjambre[contador].getY());
				Program.board.gb_setSpriteVisible(Program.contador_id, true);
				++Program.contador_id;
			}
		}
		
		if (tipoenemigo == 3) {
			for (int contador = 0; contador < posiciones.length; contador++) {
				enjambre[contador] = new Enemigo(400, "enemy100.png", posiciones[contador][0], posiciones[contador][1], Program.contador_id, 0, Constantes.DIR_N, 3);
				Program.board.gb_addSprite(Program.contador_id, enjambre[contador].getImagen(), true);
				Program.board.gb_moveSpriteCoord(Program.contador_id, enjambre[contador].getX(), enjambre[contador].getY());
				Program.board.gb_setSpriteVisible(Program.contador_id, true);
				++Program.contador_id;
			}
		}
	}
	public Enemigo[] getEnjambre() {
		return enjambre;
	}
}
