
public class Arrays2 {

	public static void main(String[] args) {
		// int[] conjunto = new int[] {1, 3, 5};
		// int[] conjunto; Esto es un null
		// int[] conjunto = null; En este caso, el conjunto es null.
		
		
		int[] conjunto = new int[] {1, 2, 5};
		System.out.println(conjunto.length); //Esta variable nos dice el numero de conjuntos que hay.
		
		int[] conjunto3 = new int[] {1, 2, 5};
		int[] conjunto4 = new int[conjunto.length];
		
		
		if (conjunto3.length == conjunto4.length) {
		int numeroElementos = conjunto3.length; 
		for (int i=0; i<numeroElementos; i++) {
			conjunto4[i] = conjunto3[i];
		}
		}
		
		int[] conjunto1 = new int[] {1, 2, 5};
		int[] conjunto2 = new int[3];
		
		for (int i=0; i < conjunto.length; i++) 
		{
			conjunto2[1] = conjunto[1]*2;
		}
		boolean sonIguales= conjunto2.length == conjunto1.length;
		if (sonIguales) {
			for (int i=0; i < conjunto.length; i++)
			{
				if(conjunto2[i] != conjunto1[i])
				{
					sonIguales = false;
					break;
				}
			}
		}
		System.out.println(sonIguales);
		
		/* Otra forma más compacta de hacer el bucle for:
		for (int elemento1:conjunto1)				
		{
			System.out.println(elemento1);
		}
		*/ 
		int[] suma = new int[3];
		
		for(int i=0; i < conjunto1.length; i++)
		{
			suma[i] = conjunto1[i] + conjunto2[i];
		}
		
		int sumaTotal = 0;
		for(int i=0; i< suma.length; i++) 
		{
			sumaTotal += suma[i];
		}
		System.out.println(sumaTotal);
		
		
		
		// Ejercicio con dos arrays.
		
		double[][] conjunto5 = new double[][]
				{
					{1, 0, 0},
					{0, 1, 0},
					{0, 0, 1},
					{}
				};
		double[][] conjunto6 = new double[][]
				{
					{9, 8, 7},
					{6, 5, 4},
					{3},
					{5, Math.PI}
				};
				
		boolean sonIguales2 = true;
		if(conjunto1.length == conjunto2.length)
		{
			for(int i=0; i<conjunto1.length; i++)
			{
				if(conjunto5[i].length != conjunto6[i].length)
				{
					sonIguales2 = false;
					break;
				}
				else
				{
					for (int j = 0; j< conjunto5.length; j++)
					{
						if (conjunto6[i][j] != conjunto5[i][j]) {
							{
								sonIguales2 = false;
								break;
							}
						}
						
					}
					
					if (!sonIguales)
					{
						break;
					}
				}
			}
		}
	}
}
