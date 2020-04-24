package Persona;

public class Program
{
	public static void main(String[] args)
	{
		String nombre = null;
		String apellidos = "";
		int edad = -1;
		
		try {
			Persona p = new Persona(nombre, apellidos, edad);
		} 
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	
		System.out.println("Sigo ejecutando");
		
	}
}