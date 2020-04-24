import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		int num = 10;
		boolean espar = num % 2 == 0;
		if(espar)
			System.out.println("El número" + num + "es par");
			System.out.println("El número" + num + "es impar");
			
		
		int num1, num2; 
		java.util.Scanner teclado = new java.util.Scanner(System.in);
			
			System.out.println("Introduce un número");
			num1 = teclado.nextInt();
			
			System.out.println("Introduce un número");
			num2 = teclado.nextInt();
			
			if(num1 % num2 == 0)
		{
				System.out.println("El número" + es "divisible por" + num2);
				System.out.println("El cociente es" + num1 + "no divisible por" + num2);
		}	
			
			int num;
			Scanner reader = new Scanner (System.in);
			System.out.println("Teclea número");
			num = reader.nextInt();
			if(num >= -128 && num <= 127);
			{
				System.out.println("Soy un byte");
			}
			else
			{
				System.out.println("No puedo ser un byte");
			}
			
		// Cuando son muchos "else" se utiliza la varible switch con los diferentes "case", es una manera de optimizar el código.
		// Es posible suprimir el break, sin embargo se produce cierta ambiguedad por lo que siempre se pone, aunque no este optimizando.
			
			
		int num = 1;
		switch(num)
		{
		case 1:
			System.out.println("I");
		case 2:
			System.out.println("II");
		case 3:
			System.out.println("III");
			
	
		// Un operador es la funcion más sencilla. Los operadores matemáticos devuelven un valor numérico, mientras que el boolen devuelve true o false.
		
		// Los operadores ternarios reciben tresparámentros, la condición, la pregunta y la respuesta.
		
		num = num%2==0? -10: -1000
		
			
		teclado.close();
		
		
		if (x>0)
			if (y>0)
				System.out.println("Ambos son mayores que 0");
		else 
			System.out.println(("Alguno no es mayor que 0");
			
			
		if (x>0) {
			if (y>0){
				System.out.println("Ambos son mayores que 0");
			}
		else {
			System.out.println(("Alguno no es mayor que 0");	
			}
		}
			
		
		 
		}
		

		
			
			
	}

}
