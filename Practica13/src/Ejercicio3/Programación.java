package Ejercicio3;

public class Programación {
	private int i = 0;
    private Estudiante[] estudiantes;

    public Programación() 
    {
        this.estudiantes = new Estudiante[5];
    }

    public boolean añadirEstudiante(Estudiante t)
    {
        boolean añadir = false;
            if(i < this.estudiantes.length && this.estudiantes[i] == null) {
                this.estudiantes[i] = t;
                añadir = true;
            }
            i++;
        return añadir;
    }
    
    public String toString() 
    {	
    	String nombres = null;
    	for (Estudiante objeto : estudiantes) {
    		nombres += (objeto.getNombre() + " " + objeto.getApellidos() + System.getProperty("line.separator"));
    	}
    	return nombres;
    	/*
        StringBuilder str = new StringBuilder();
        for(Estudiante t : this.estudiantes) {
            str.append(t).append(System.getProperty("line.separator"));
        }
        return str.toString();*/
    }

    public int buscarEstudiante(Estudiante t) 
    {
        for(int j = 0; j < this.estudiantes.length; j++) {
            if(t.toString().toLowerCase().equals(this.estudiantes[j].toString().toLowerCase())) {
                return j;
            }
        }
        return -1;
    }

}



