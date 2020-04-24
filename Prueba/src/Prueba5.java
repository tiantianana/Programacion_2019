public class Prueba5 {
	
	public static void main(String[] args){

	int i=0, cantidad=5, rango=100;
	int[] array = new int[cantidad];

	array[i]= (int)(Math.random()*rango);
	for(int i=1; i<cantidad; i++)
	{
		array[i]= (int)(Math.random()*rango);
		for(int j=0; j<i; j++)
		{
			if(array[i]==array[j])
			{
				i--;
			}
		}
	}

	for(int k=0; k<cantidad; k++)
	{
		System.out.print((k+1)+ " " +array[k]+);
		System.out.print();
	}

	}
}