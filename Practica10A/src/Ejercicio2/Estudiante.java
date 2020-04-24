package Ejercicio2;

public class Estudiante {
	private String nombre;
	private String apellido;
	private double notaprogramacion;
	private double notainformacion;
	private double notaescritura;
	
	public Estudiante(String nombre, String apellido, double notaprogramacion, double notainformacion, double notaescritura) {
		setNombre(nombre);
		setApellido(apellido);
		setNotaprogramacion(notaprogramacion);
		setNotainformacion(notainformacion);
		setNotaescritura(notaescritura);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private void setNotaprogramacion(double notaprogramacion) {
		if (notaprogramacion > 0 && notaprogramacion < 10) {
			this.notaprogramacion = notaprogramacion;
		} else {
			this.notaprogramacion = 0;
		}
	}
	private void setNotainformacion(double notainformacion) {
		if (notainformacion > 0 && notainformacion < 10) {
			this.notainformacion = notainformacion;
		} else {
			this.notainformacion = 0;
		}
	}
	private void setNotaescritura(double notaescritura) {
		if (notaescritura > 0 && notaescritura < 10) {
			this.notaescritura = notaescritura;
		} else {
			this.notaescritura = 0;
		}
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	protected String getApellido() {
		return this.apellido;
	}
	protected double getNotaprogramacion() {
		return this.notaprogramacion;
	}
	protected double getNotainformacion() {
		return this.notainformacion;
	}
	protected double getNotaescritura() {
		return this.notaescritura;
	}
	
	
	
}
