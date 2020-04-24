
public class Enemigo extends Caracteristicas{

	private int direccion;
	private int tipoenemigo;
	
	public Enemigo(int vida, String imagen, int x, int y, int id, long puntos, int direccion, int tipoenemigo) {
		setVida(vida);
		setImagen(imagen);
		setX(x);
		setY(y);
		setId(id);
		setPuntos(puntos);
		setDireccion(direccion);
		setTipoenemigo(tipoenemigo);
	}
	
	public void setDireccion(int param) {
		if (direccion >= 0 && direccion < 16) {
			this.direccion = param;
		}
	}
	public void setTipoenemigo(int param) {
		this.tipoenemigo = param;
	}
	
	public int getDireccion() {
		return direccion;
	}
	
	public int getTipoenemigo() {
		return tipoenemigo;
	}
	
	public void colisionar() {
		
	}
}
