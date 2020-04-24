
public class Comer 
{
	private Animal Animal;
	
	public Comer (Animal animal)
	{
		Animal = animal;
	}
	
	public void Alimentars(Animal animal, int vida)
	{
		Animal.setVida(vida);
	}

}
