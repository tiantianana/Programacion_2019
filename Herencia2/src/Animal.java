
public abstract class Animal 
{
	private double Edad;
	
	public abstract void Envejecer();
	
	
	public void Envejecer(double a�os)
	{
		if(a�os > 0)
		{
				Edad += a�os;
		}
	}
	
	public double getEdadEnDias()
	{
		return Edad * 365;
	}
	
	
	
	
	
}
