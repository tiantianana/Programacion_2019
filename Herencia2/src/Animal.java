
public abstract class Animal 
{
	private double Edad;
	
	public abstract void Envejecer();
	
	
	public void Envejecer(double años)
	{
		if(años > 0)
		{
				Edad += años;
		}
	}
	
	public double getEdadEnDias()
	{
		return Edad * 365;
	}
	
	
	
	
	
}
