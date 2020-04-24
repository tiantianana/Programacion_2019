package Ejercicio4;

public class Producto {

	private String nombre;
	private float precio;
	private int valores;
	
	public Producto(String nombre, float precio, int valores) 
	{
		this.nombre = nombre;
		this.precio = precio;
		this.valores = valores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getValores() {
		return valores;
	}

	public void setValores(int valores) {
		this.valores = valores;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		if (valores != other.valores)
			return false;
		return true;
	}

	public String toString() {
		return "Producto" + this.nombre + this.precio + this.valores;
				
				
	}	
}
