public class Futbol {
	private String nombre;
	private String apellido;
	private String posicion;
	private int a�os;
	private String equipo;
	
	String[] posicionesvalidas = new String[] {"portero", "defensa", "centrocampista", "delantero"};

	public Futbol(String nombre, String apellido, String posicion, int a�os, String equipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.a�os = a�os;
		this.equipo = equipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellidos) {
		this.apellido = apellidos;
	}
	
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
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
	public int getA�os() {
		return a�os;
	}
	
	public void setA�os(int a�os) {
		if (a�os > 16 && a�os < 50) {
			this.a�os = a�os;
		} else {
			this.a�os = 25;
		}
	}

	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String toString() {
		return this.nombre + " " + this.apellido + ", " + this.a�os + " a�os. Juega de " + this.posicion + " en " + this.equipo + ".";
	}

	
	public Futbol(String nombre, String apellido, int a�os, String posicion, String equipo) 
	{
		setNombre(nombre);
		setApellido(apellido);
		setA�os(a�os);
		setPosicion(posicion);
		setEquipo(equipo);
	}				
}
	
