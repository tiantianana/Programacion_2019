package Ejercicio1;

public class Futbol {
	private String nombre, apellido, posicion, equipo;
	private int a�os;
	
	String[] posicionesvalidas = new String[] {"portero", "defensa", "centrocampista", "delantero"};
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private void setPosicion(String posicion) {
		boolean valorvalido = false;
		for (String valor : posicionesvalidas) {
			valorvalido = valor == posicion ? true : false;
		}
		if (valorvalido) {
			this.posicion = posicion;
		} else {
			this.posicion = posicionesvalidas[(int)(Math.random()*4)];
		}
	}
	private void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	private void setA�os(int a�os) {
		if (a�os > 16 && a�os < 50) {
			this.a�os = a�os;
		} else {
			this.a�os = 25;
		}
	}
	
	public Futbol(String nombre, String apellido, int a�os, String posicion, String equipo) {
		setNombre(nombre);
		setApellido(apellido);
		setA�os(a�os);
		setPosicion(posicion);
		setEquipo(equipo);
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	protected String getApellido() {
		return this.apellido;
	}
	protected int getA�os() {
		return this.a�os;
	}
	protected String getPosicion() {
		return this.posicion;
	}
	protected String getEquipo() {
		return this.equipo;
	}
}