package Algebra;

public class Matriz {

	/*private Factorizar f = new Fctorizar(this);
	public void Factorizar() 
	{
		f = new QR();
		f.Fact(this);
	}
	
	public void FactorizarCholesky()
	{
		f = new Cholesky();
		f.Fact(this);
	}
	*/
	
	public void Factorizar(Factorizar f)
	{
		f.Fact(this);
	}
}
