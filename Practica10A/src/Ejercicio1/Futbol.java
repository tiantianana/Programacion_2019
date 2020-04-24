package Ejercicio1;

public class Futbol {
	private String nombre, apellido, posicion, equipo;
	private int años;
	
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
	private void setAños(int años) {
		if (años > 16 && años < 50) {
			this.años = años;
		} else {
			this.años = 25;
		}
	}
	
	public Futbol(String nombre, String apellido, int años, String posicion, String equipo) {
		setNombre(nombre);
		setApellido(apellido);
		setAños(años);
		setPosicion(posicion);
		setEquipo(equipo);
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	protected String getApellido() {
		return this.apellido;
	}
	protected int getAños() {
		return this.años;
	}
	protected String getPosicion() {
		return this.posicion;
	}
	protected String getEquipo() {
		return this.equipo;
	}
}