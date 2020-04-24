package Ejercicio3;

import java.text.Normalizer;

public class Estudiante {
	
	private String nombre;
	private String apellidos;

    public Estudiante(String nombre, String apellidos)
    {
    		this.nombre = nombre;
    		this.apellidos = apellidos;
    }

	public Estudiante() {
		
	}

	public String getNombre() 
    {
        return nombre;
    }

 
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }


    public String getApellidos() 
    {
        return apellidos;
    }


    public void setApellidos(String apellidos) 
    {
        this.apellidos = apellidos;
    }
    
    
    public String toString() {
        String upperNoAccents = Normalizer.normalize(this.nombre.toUpperCase() + " " +  this.apellidos.toUpperCase(), Normalizer.Form.NFD);
        if(upperNoAccents.length() > 15) {
            String[] removeSecondSurname = upperNoAccents.split(" ");
            upperNoAccents = removeSecondSurname[0] + " " + removeSecondSurname[1];
        }
        return upperNoAccents;
    }
    
    
    
    public boolean mismoNombre(Estudiante otroEstudiante) 
    {
        return this.nombre.toLowerCase().equals(otroEstudiante.getNombre().toLowerCase());
    }
}
