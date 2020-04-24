
public class Jugador extends Caracteristicas implements Runnable{
	private int disparos;
	private int aciertos;
	
	public Jugador(int vida, String imagen, int x, int y, int id, long puntos, int disparos, int aciertos) {
		setVida(vida);
		setImagen(imagen);
		setX(x);
		setY(y);
		setId(id);
		setDisparos(disparos);
		setAciertos(aciertos);
		
	}	

	public void setDisparos(int param) {
		this.disparos = param;
	}
	public void setAciertos(int param) {
		this.aciertos = param;
	}
	
	public int getDisparos() {
		return disparos;
	}
	public int getAciertos() {
		return aciertos;
	}
	
	public void mover(int direccion, int pasos) { 
			setX(getX() + Constantes.MOVES[direccion][0] * pasos);
	}
	
	@Override
	public void run() {	
		int contador_id_temporal = Program.contador_id;
		for (int contador = getX(); contador < 100000; contador++) {
			Program.board.gb_moveSpriteCoord(contador_id_temporal, 85, contador);
			System.out.println(contador);
		}
		
		
		
		
		
	}
	
}
