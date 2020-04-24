cvpackage Ejercicio4;

public class Cliente {
	private String nombre; 
	private String correoElectronico;
	private String contrase�a; 
	private double dinero;
	
	public Cliente(String nombre, String correoElectronico, String contrase�a, double dinero) 
	{
		
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.contrase�a = contrase�a;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (contrase�a == null) {
			if (other.contrase�a != null)
				return false;
		} else if (!contrase�a.equals(other.contrase�a))
			return false;
		if (correoElectronico == null) {
			if (other.correoElectronico != null)
				return false;
		} else if (!correoElectronico.equals(other.correoElectronico))
			return false;
		if (Double.doubleToLongBits(dinero) != Double.doubleToLongBits(other.dinero))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String toString() {
		return "Cliente" + this.nombre + this.correoElectronico + this.contrase�a + this.dinero;
				
	} 	
}
