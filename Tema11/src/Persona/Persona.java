package Persona;

public class Persona
{
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public Persona(String nombre, String apellidos, int edad)
	throws Exception
	{
		setNombre(nombre);
		
		if(nombre == null || nombre.length() <3 )
		{
			throw new Exception("Nombre incorrecto");
		}
		if(apellidos == null || apellidos.length() <5)
		{
			throw new Exception("Apellidos incorrectos");
		}
		if(edad < 0 || edad > 120)
		{ 
			throw new Exception("Edad incorrecta");
		}
	
	
	Apellidos = apellidos;
	Edad = edad;	
	}
	
	
	public void setNombre(String nombre)
			throws Exception
	{
		if(nombre ==null || nombre.length() < 3)
		{
			throw new Exception("Nombre incorrecto");
		}
		
	}
	
	
	
	
}
