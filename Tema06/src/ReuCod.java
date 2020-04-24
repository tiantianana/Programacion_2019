 	public class ReuCod{
			public static void main(String[] args) 
			{
				int result = mult(3, 4);
				System.out.println(result);
				
				int result2 = mult(3, 4, 5);
				
				int fact = factorial(5);
			 	System.out.println(fact);
			}	
			public static int mult(int a, int b, int c){
				int resultado = mult(mult(a, b),c);
				return resultado;
				// return mult(mult(a, b), c);
				}

			

		//Ejemplo de sobrecarga de métodos.
		
		 	public static double perimetro(double radio)
		 	{
		 		return(2 * Math.PI * radio);
		 	}
		 	public static double perimetro(double lado1, double lado2) 
		 	{
		 		return(lado1*lado2);
		 	}
		
			

		 	public static int factorial(int n)
		 	{
		 		int resultado=1;
		 		for(int i=n; i>1; i--)
		 		{
		 			resultado *= i;
		 		}
		 		return resultado;
		 	}

			
			public static int factorial1(int n)
			{
			 	if(n<=1)
			 	{
			 		return 1;
			 	}
			 	int resultado = n * factorial1(n - 1);
			 	return resultado;
			 	
			 }
		 }
