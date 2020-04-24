
public class Prueba6{       
	public static void main(String[] args) {     
		
	// Numero random y adivinar cual es.
	int numero;
	int recibido;
	
	java.util.Scanner teclado = new java.util.Scanner(System.in);
 	numero = (int)((Math.random()*100)+1);
 
		System.out.println("Piensa un numero del 1 al 100");
		System.out.println("Puede adivinarlo?");
		System.out.println("Por favor introduzca un numero: ");
		recibido = teclado.nextInt();
	
	System.out.println(numero);

	while ( recibido != numero )
	{   
		if ( recibido > numero )
		{ 
			System.out.println("El numero es muy grande, por favor intenta de nuevo.");
			recibido = teclado.nextInt();
		}   
		else
		{ 
 			System.out.println("El numero es muy pequeño, por favor intenta de nuevo.");
			recibido = teclado.nextInt();
		}   

	}   
		System.out.println("HAS ADIVINADO EL NUMERO!");
	teclado.close();
	}          
	
} 