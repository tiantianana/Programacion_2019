
public class BTriangulo2 implements CPerimetrable, CAreable
{
	private double Distancia;
	
	public BTriangulo2(double distancia)
	{
		Distancia = distancia;
	}
	
	@Override
	public double getPerimetro()
	{
		return Distancia * 3;
	}
	
	@Override
	public double getArea()
	{
		return Math.random();
	}
	
}
