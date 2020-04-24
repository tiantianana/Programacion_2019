
public class BPoligono implements BFigura
{
	private int Lados;
	private double Distancia;
	
	public BPoligono(int lados, double distancia)
	{
		Lados = lados;
		Distancia = distancia;
	}
	
	@Override
	public double getPerimetro()
	{
		return Lados*Distancia;
	}
	
	public int getLados()
	{
		return Lados;
	}
	

}
