package Ejercicio4;

public class avion {
	private String IDvuelo;
	private isla origen;
	private isla destino;
	private int asientos;
	private estadoavion estado;
	private String compañia;
	
	public avion(String IDvuelo, isla origen, isla destino, int asientos, estadoavion estado, String compañia) {
		setValues(IDvuelo, origen, destino, asientos, estado, compañia);
	}
	
	private void setValues(String IDvuelo, isla origen, isla destino, int asientos, estadoavion estado, String compañia) {
		if (IDvuelo.length() == 0) {
			throw new java.lang.Error("El campo IDvuelo en avion no puede estar vacío");
		} else this.IDvuelo = IDvuelo;
		this.origen = origen;
		this.destino = destino;
		this.asientos = asientos;
		this.estado = estado;
		if (compañia.length() == 0) {
			throw new java.lang.Error("El campo compañia en avion no puede estar vacío");
		} else this.compañia = compañia;
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
	protected String getCompañia() {
		return compañia;
	}
}
