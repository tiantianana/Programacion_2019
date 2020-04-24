cvpackage Ejercicio4;

public class Cliente {
	private String nombre; 
	private String correoElectronico;
	private String contraseña; 
	private double dinero;
	
	public Cliente(String nombre, String correoElectronico, String contraseña, double dinero) 
	{
		
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
		if (contraseña == null) {
			if (other.contraseña != null)
				return false;
		} else if (!contraseña.equals(other.contraseña))
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
		return "Cliente" + this.nombre + this.correoElectronico + this.contraseña + this.dinero;
				
	} 	
}
