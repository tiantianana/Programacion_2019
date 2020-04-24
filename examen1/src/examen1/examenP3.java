package examen1;

public class examenP3 {

	int N, m, M;
	java.util.Scanner teclado = new java.util.Scanner(System.in);
	
	do 
	{
		System.out.println("Introduce N rectangulos");
		N = teclado.nextInt();
	}
	while (N>1);
	
	do 
	{
		System.out.println("Introduce un valor para M");
		M = teclado.nextInt();
	}
	while (M>1);
	
	do 
	{
		System.out.println("Introduce un valor para m");
		m = teclado.nextInt();
	}
	while (m>1);
	
	teclado.close();
	
	int [][] rectangulos = new int[N][2];
	int areaTotal =0, maxArea=0, posicion=0;
	for (int i=0; i<N; i++)
	{
		int x = (int)(Math.random()* (M-m))+1;
		int y = (int)(Math.random()*(M-m))+1;
		
		int area = x*y;
		areaTotal += area;
		
		// rectangulo[i][0]=x;
		// rectangulo[i][1]=x;
		
		if (x==y)
		{
			System.out.println("El rectangulo " +(i+1)+ " es cuadrado");
		}
		
		if (area>maxArea)
		{
			maxArea=area;
			posicion=i;
		}
		
	}
	
	if(areaTotal - maxArea <= maxArea) 
		{
		System.out.println("El rectangulo " +(posicion+1)+ "con area" + maxArea + "(" + rectangulos[posicion][0] +"," +rectangulos[posicion][1]+ ") contiene a todos los demas rectangulos.");
		}
	else
		{
		System.out.println("No existe el rectangulo");
		}
	System.out.prinln("Introduce el area total: " +areaTotal);
	}
}
