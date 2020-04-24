
public abstract class Edificio 
{
	private String Nombre;
	private String Descripcion;
	private int Trabajadores;
	private int Vacantes;
	private Reino Reino;
	protected static TipoVivienda TipoVivienda;
	
	public Edificio(String nombre, String descripcion, int trabajadores, int vacantes, Reino reino, TipoVivienda tipoVivienda)
	{
		Nombre = nombre;
		Descripcion = descripcion;
		Vacantes = Math.min(0, vacantes);
		Reino = reino;
		TipoVivienda = tipoVivienda;
		
	}
	
}
