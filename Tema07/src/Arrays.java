
public class Arrays {

	public static void main(String[] args) {
		
		/*
		
		// double [] temperaturas = new double [7];
		
		int [] arr1 = new int [4]; // Ocupa 4*4 que son 16 bytes de espacios.
		arr1[0] = 5; 	// Utilizamos esta expresión para acceder a una de las cuatro variables que contiene el array.
		System.out.println(arr1);
		
		int [] edades = new int (4) { 1 , 2 , 3 , 4 };
		System.out.println(edades);
		
		int [] edades = new int [] { 10, 25 , 30 , 29 };
		edades [4] = 1;		// Esto peta ya que originalmentese ha asignado el valor de la array 0.
		System.out.println(edades);
				
		int [] edades1 = new int [] { 10 , 25 , 30 , 49 };
		int [] edades2 = new int [] { 10 , 25 , 30 , 49 }:
			System.out.println(edades1.length);
				
				
		int [][] arr = new int [][] {
			{1,2,3},
			{4,5},
			{6,7,8,9} };
				System.out.println(arr);
			
		for(int[] filas : arr)
		{
			for(int elemento: filas)
			{
				System.out.println(elemento + "");
			}
			System.out.println();
			
		
		int[] edades = new int[] {10, 20, 30, 40};
		for (int contador=0; contador<4; contador++)
			System.println(edades[contador]);
		// Imprime el array de edades definido anteriormente.
		
		int [][] matrix = new int [2][4]; // El primer corchete [] son el número de filas y el segundo [] son el número de columnas.
		
		*/
		
		//numero perfecto
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Dime un número");
		int num = teclado.nextInt();
		int contador, sum= 0;
		
		for (contador=1; contador<num; contador++)
			if (num%contador==0)
				sum+=contador;
		if (sum==num)
			System.out.println("El número es perfecto");
		else {System.out.println("El número no es perfecto");}
		
		teclado.close();		
		}
	}

