package Clase12;

public class Program 
{
	public static void main(String[] args)
	{
		Persona p = FactoriaPersonas.Create("Autonomo", "Ana", 19);
		if(p instanceof Empleado)
		{
			Empleado e = (Empleado)p;
			p.setEdad(-30);
		}
		
		
	}

}
