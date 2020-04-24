package Ejercicio3;

public class Estudiante2 {
	private String nombre;
	private String apellido;
	private double[] notas = new double[3];
	
	public Estudiante2(String nombre, String apellido, double notaprogramacion, double notainformacion, double notaescritura) {
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
			notas[1] = notaprogramacion;
		} else {
			notas[1] = 0;
		}
	}
	private void setNotainformacion(double notainformacion) {
		if (notainformacion > 0 && notainformacion < 10) {
			notas[2] = notainformacion;
		} else {
			notas[2] = 0;
		}
	}
	private void setNotaescritura(double notaescritura) {
		if (notaescritura > 0 && notaescritura < 10) {
			notas[3] = notaescritura;
		} else {
			notas[3] = 0;
		}
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	protected String getApellido() {
		return this.apellido;
	}
	protected double getNotaprogramacion() {
		return notas[1];
	}
	protected double getNotainformacion() {
		return notas[2];
	}
	protected double getNotaescritura() {
		return notas[3];
	}
	
	
	
}
