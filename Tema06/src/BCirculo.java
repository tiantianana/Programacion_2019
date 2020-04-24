
public class BCirculo implements BFigura  //ya no utilizamos extend porque la clase ya no es abstracta
{
	private double Radio;
	
	public BCirculo(double radio)
	{
		Radio = radio;
	}
	
	@Override //abstract 

	public double getPerimetro()
	{
		return Math.PI*Radio;
	}
	
	public static double getArea(double radio)
	{
		return Math.PI*radio*radio;
	}
	
	
	
}
