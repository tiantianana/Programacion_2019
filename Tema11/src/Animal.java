
public abstract class Animal 
{
	public Comer Comer = new Comer(this);
	public Respirar respiracion = new Respirar(this);
	
	private int Edad;
	private int Vida;
	
	public abstract void Comer();
	
	public void setEdad(int edad)
	{
		Edad += edad;
	}
	
	public void setVida(int vida)
	{
		Vida = vida;
	}
	
}
