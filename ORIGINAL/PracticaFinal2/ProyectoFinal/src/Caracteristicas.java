
public abstract class Caracteristicas {
	private int vida;
	private String imagen;
	private int x;
	private int y;
	private int id;
	private long puntos;
	
	
	protected void setVida(int param) {
		this.vida = param;
	}
	protected void setImagen(String param) {
		this.imagen = param;
	}
	protected void setX(int param) {
		if (param >= 0) {
			this.x = param;
		}
	}
	protected void setY(int param) {
		if (param >= 0) {
			this.y = param;
		}
	}
	protected void setId(int param) {
		this.id = param;
	}
	protected void setPuntos(long param) {
		this.puntos = param;
	}
	
	
	protected int getVida() {
		return vida;
	}
	protected String getImagen() {
		return imagen;
	}
	protected int getX() {
		return x;
	}
	protected int getY() {
		return y;
	}
	protected int getId() {
		return id;
	}
	protected long getPuntos() {
		return puntos;
	}
	public String getSprite() {
		return imagen;
	}
	
	
	
	/*public void mover() {
		
	}*//*
	public void disparar() {
		
	}*/
	public void morir() {
		
	}
	
	
}
