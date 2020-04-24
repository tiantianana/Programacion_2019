
public class Reino
{

	private String Nombre;
	private String Lema;
	private int LimitePoblacion;
	private int LimiteEdificios;
	private int PoblacionActual;
	private int Edificios;
	
	public Reino(String nombre, String lema, int limitePoblacion, int limiteEdificios, int poblacion, int edificios)
	{

		Nombre = nombre;
		Lema = lema;
		LimitePoblacion= Math.max(1, limitePoblacion);
		LimiteEdificios = Math.max(1, limiteEdificios);
		PoblacionActual = poblacion <= LimitePoblacion ? poblacion :LimitePoblacion;
		// PoblacionActual = Math.max(1, Math.min(poblacion, LimitePoblacion)); Otra manera de expresar el operador ternario.
		
		
		
		
		
	
		

		
		
	}
	
}

