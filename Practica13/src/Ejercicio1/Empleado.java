package Ejercicio1;

public class Empleado {
	
	private String numDNI;
	private String nombre;
	private String apellido;
	private int añoIngreso;
	
	protected Empleado(String numDNI, String nombre, String apellido, int añoIngreso)
	{
		this.numDNI = numDNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.añoIngreso = añoIngreso;
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

    public int getAñoIngreso() 
    {
        return añoIngreso;
    }

   public void setAñoIngreso(int añoIngreso) 
    {
        this.añoIngreso = añoIngreso;
    }
      
    public void Imprimir()
    {
    	System.out.println(this.numDNI + this.apellido + this.añoIngreso);
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
		if (añoIngreso != other.añoIngreso)
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
				+ (apellido != null ? "apellido=" + apellido + ", " : "") + "añoIngreso=" + añoIngreso + "]";
	}
    
 
    
    
    
    
    
}
