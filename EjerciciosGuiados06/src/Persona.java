
public class Persona 
{
	private String Nombre;
	private int Edad;
	private Reino Reino;
	private boolean Trabajo;
	private Edificio Casa;
	private Edificio LugarTrabajo;
	private Habilidad Habilidad;
	
	public Persona(String nombre, int edad, Reino reino, boolean trabajo, Casa casa, Palacio palacio, Habilidad habilidad)
	{
		Nombre = nombre;
		Edad = edad;
		Reino = reino;
		Trabajo = trabajo;
		Habilidad = habilidad;
		
		if(casa instanceof Casa)
		{
			Casa = (Casa)casa;
		}
		if(palacio instanceof Palacio)
		{
			LugarTrabajo = (Palacio)palacio;
		}
		
	}

}
