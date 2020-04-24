
public class BTriangulo1 implements BFigura // No es extend porque Figura es un interface.
{
	private double Distancia;
	
	public BTriangulo1(double distancia)
	{
		Distancia = distancia;
	}
	
	public double getPerimetro()
	{
		return Distancia*3;
	}
}
