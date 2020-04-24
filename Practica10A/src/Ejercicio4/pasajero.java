package Ejercicio4;

public class pasajero {
	private String nombre;
	private String apellido;
	private String IDpasajero;
	private String IDvuelo;
	private avion vuelo;
	
	public pasajero(String nombre, String apellido, String IDpasajero, avion vuelo) {
		setValues(nombre, apellido, IDpasajero, vuelo);
	}
	
	private void setValues(String nombre, String apellido, String IDpasajero, avion vuelo) {
		if (nombre.length() == 0) {
			throw new java.lang.Error("El campo Nombre en pasajero no puede estar vacío");
		} else this.nombre = nombre;
		if (apellido.length() == 0) {
			throw new java.lang.Error("El campo apellido en pasajero no puede estar vacío");
		} else this.apellido = apellido;
		if (IDpasajero.length() == 0) {
			throw new java.lang.Error("El campo IDpasajero en pasajero no puede estar vacío");
		} else this.IDpasajero = IDpasajero;
		this.IDvuelo = vuelo.getIDvuelo();
	}
	protected String getNombre() {
		return nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected String getIDpasajero() {
		return IDpasajero;
	}
	protected String getIDvuelo() {
		return IDvuelo;
	}
	
}
