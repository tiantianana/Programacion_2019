public class Futbol {
	private String nombre;
	private String apellido;
	private String posicion;
	private int años;
	private String equipo;
	
	String[] posicionesvalidas = new String[] {"portero", "defensa", "centrocampista", "delantero"};

	public Futbol(String nombre, String apellido, String posicion, int años, String equipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.años = años;
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
	public int getAños() {
		return años;
	}
	
	public void setAños(int años) {
		if (años > 16 && años < 50) {
			this.años = años;
		} else {
			this.años = 25;
		}
	}

	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String toString() {
		return this.nombre + " " + this.apellido + ", " + this.años + " años. Juega de " + this.posicion + " en " + this.equipo + ".";
	}

	
	public Futbol(String nombre, String apellido, int años, String posicion, String equipo) 
	{
		setNombre(nombre);
		setApellido(apellido);
		setAños(años);
		setPosicion(posicion);
		setEquipo(equipo);
	}				
}
	
