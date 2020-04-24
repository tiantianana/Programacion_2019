
public class Program 
{
	public static void main(String[] args)
	{
		Animal X = new Perro();
		Animal Y = new Humano();
		Y.Envejecer();
		X.Envejecer();
		
		Animal[] animales = new Animal[2];
		animales[0] = X;
		animales[1] = Y;
		
		int dias = 0;
		for (Animal animal: animales)
		{
			dias += animal.getEdadEnDias();
		}
		System.out.println(dias);
		
		
	}
}
