package Ejercicio1;

public class Empleado {
	
	private String numDNI;
	private String nombre;
	private String apellido;
	private int a�oIngreso;
	
	protected Empleado(String numDNI, String nombre, String apellido, int a�oIngreso)
	{
		this.numDNI = numDNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.a�oIngreso = a�oIngreso;
	}


    public String getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(String numDNI) {
        this.numDNI = numDNI;
    }
    
    public String getNombre()
    { 
    	return nombre;
    }
    public void setNombre(String nombre)
    {
    	this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public int getA�oIngreso() 
    {
        return a�oIngreso;
    }

   public void setA�oIngreso(int a�oIngreso) 
    {
        this.a�oIngreso = a�oIngreso;
    }
      
    public void Imprimir()
    {
    	System.out.println(this.numDNI + this.apellido + this.a�oIngreso);
    }




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (a�oIngreso != other.a�oIngreso)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numDNI == null) {
			if (other.numDNI != null)
				return false;
		} else if (!numDNI.equals(other.numDNI))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Empleado [" + (numDNI != null ? "numDNI=" + numDNI + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellido != null ? "apellido=" + apellido + ", " : "") + "a�oIngreso=" + a�oIngreso + "]";
	}
    
 
    
    
    
    
    
}
