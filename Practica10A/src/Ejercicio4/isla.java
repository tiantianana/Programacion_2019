package Ejercicio4;

public class isla {
	private String nombre;
	private double coordenadaslatitud;
	private double coordenadaslongitud;
	private String pais;
	private boolean habitable;
	
	public isla(String nombre, double coordenadaslatitud, double coordenadaslongitud, String pais, boolean habitable) {
		setValues(nombre, coordenadaslatitud, coordenadaslongitud, pais, habitable);
	}
	
	private void setValues(String nombre, double coordenadaslatitud, double coordenadaslongitud, String pais, boolean habitable) {
		if (nombre.length() == 0) {
			throw new java.lang.Error("El campo Nombre en isla no puede estar vacío");
		} else this.nombre = nombre;
		
		if (coordenadaslatitud == 0.0) {
			throw new java.lang.Error("El campo coordenadaslatitud en isla no puede estar vacío");
		} else this.coordenadaslatitud = coordenadaslatitud;
		
		if (coordenadaslongitud == 0.0) {
			throw new java.lang.Error("El campo coordenadaslongitud en isla no puede estar vacío");
		} else this.coordenadaslongitud = coordenadaslongitud;
		
		if (pais.length() == 0) {
			throw new java.lang.Error("El campo País en isla no puede estar vacío");
		} else this.pais = pais;
		
		this.habitable = habitable;
	}
	protected String getNombre() {
		return nombre;
	}
	protected double getCoordenadaslatitud() {
		return coordenadaslatitud;
	}
	protected double getCoordenadaslongitud() {
		return coordenadaslongitud;
	}
	protected String getPais() {
		return pais;
	}
	protected boolean getHabitable() {
		return habitable;
	}
}
