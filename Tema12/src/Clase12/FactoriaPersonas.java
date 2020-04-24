package Clase12;

public class FactoriaPersonas {
	
	public static Persona Create(String tipo, String nombre)
	{
		return Create(tipo, nombre, 0);
	}

	public static Persona Create(String tipo, String nombre, int edad)
	{
		try 
		{
			if(tipo == "Empleado")
			{
			return new Empleado(nombre, edad);
			}
			else 
			{
				return new Autonomo(nombre, edad);
			}
		} 
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
			return null;
		}
		
	}
}
