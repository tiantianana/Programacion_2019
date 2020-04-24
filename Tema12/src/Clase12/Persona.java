package Clase12;

public abstract class Persona 
{
	private String Nombre;
	private int Edad;
	
	public Persona(String nombre, int edad) throws Exception
	{
		setNombre(nombre);
		setEdad(edad);
	}
	
	public void setNombre(String nombre) throws Exception // Tenemos que usar el metodo try catch ya que una persona tiene que tener un nombre si o si (cadena de texto).
	{
		if(nombre == null || nombre.length()< 3) throw new Exception("Nombre incorrecto");
		Nombre = nombre;
	}
	
	public void setEdad(int edad) // throws Exception (No usamos el metodo throw ya que si no tendriamos que añadir un try catch para comprobar si es correcto el valor.
	{								
		if (edad<0 || edad>120 ) // throw new Exception("Edad incorrecta");
		Edad = edad;
	}
	
	
}
