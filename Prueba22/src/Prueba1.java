
public class Prueba1 {


	public static void main(String[] args) {
	
	int intentos=0;
	int[] array = new int[100];
	array[i]= (int)(Math.random()*100)+1;

	for(int i=0; i<100; i++)
	{
		array[i]= (int)(Math.random()*100)+1;
		for(int j=0; j<i; j++)
		{
			if(array[i]==array[j])
			{
				i--;
			}
		}
	}

	for(int k=1; k<100; k++)
	{
		System.out.print((k+1)+ " " +array[k]);
		System.out.println();
		}
	}
}
