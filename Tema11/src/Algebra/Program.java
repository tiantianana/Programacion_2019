package Algebra;

public class Program 
{
	public static void main (String[] args)
	{
		Animal mosquito = new Mosquito();
		mosquito.Comer.Alimentarse(5);
		
		Matriz m = new Matriz();
		Factorizar f = new Cholesky();
		m.Factorizar(f);
	}
}
