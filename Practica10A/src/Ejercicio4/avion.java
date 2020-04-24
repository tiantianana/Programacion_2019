package Ejercicio4;

public class avion {
	private String IDvuelo;
	private isla origen;
	private isla destino;
	private int asientos;
	private estadoavion estado;
	private String compa�ia;
	
	public avion(String IDvuelo, isla origen, isla destino, int asientos, estadoavion estado, String compa�ia) {
		setValues(IDvuelo, origen, destino, asientos, estado, compa�ia);
	}
	
	private void setValues(String IDvuelo, isla origen, isla destino, int asientos, estadoavion estado, String compa�ia) {
		if (IDvuelo.length() == 0) {
			throw new java.lang.Error("El campo IDvuelo en avion no puede estar vac�o");
		} else this.IDvuelo = IDvuelo;
		this.origen = origen;
		this.destino = destino;
		this.asientos = asientos;
		this.estado = estado;
		if (compa�ia.length() == 0) {
			throw new java.lang.Error("El campo compa�ia en avion no puede estar vac�o");
		} else this.compa�ia = compa�ia;
	}
	protected String getIDvuelo() {
		return IDvuelo;
	}
	protected String getOrigen() {
		return origen.getNombre();
	}
	protected String getDestino() {
		return destino.getNombre();
	}
	protected int getAsientos() {
		return asientos;
	}
	protected estadoavion getEstado() {
		return estado;
	}
	protected String getCompa�ia() {
		return compa�ia;
	}
}
