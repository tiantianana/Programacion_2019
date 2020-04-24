import java.util.Scanner;

public class Clase4 {

	public static void main(String[] args) {
		
		byte a1=5, a2=2;
		byte a3=(byte)(a1*a2);
		
		char c = 'a';
		boolean alfan = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c <= '0' && c <= '9');
		
		int j = (int)(Math.random()*10);
		System.out.print(j);
		
		int n;
		int tirada;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de tiradas");
		n = sc.nextInt();
			for (int i = 0; i < n; i++);
			{
				tirada = (int)(1+6 * math.random());
				System.out.println("El resultado de la tirada es " + tirada);
			}
		sc.close();
		
		// Operadores ternarios.
		int a = 5 ==4? 0:10;
		// Expr1 		//True 		//False
		a = 5 ==4?(int)(Math.random);
		

	}


			//Ejemplo clase26sept

			{
				long total = 50000000L;
				float territorio = 15000000F/12;
				long casaRey = 50000000L;
				long plusDescendientes = -1000000L;
				long batallaPerdida = -20000000L;
				float partidaCasa = 0L;
				boolean tieneRey = true, tieneDescendientes = true;
				
				int territorioConquistados = 3;
				int batallaPerdidas = 0;
				
				System.out.println("Introduce la casa");
				Scanner teclado = new Scanner (System.in);
				String casa = teclado.next();
			
				/*
				if (casa.equals("Lannister")) {
				}else
					if (casa.equals("Stark"))
					{}
				else
				{
				}
				*/
				
				/*Otra forma de hacer el if
				switch(casa); {
					case "Lanister":
						break;
					case "Stark":
						break;
					default:
						break;
				}
				*/
						
				if(casa.equals("Lannister"))
				{
					partidaCasa = territorioConquistados*plusterritorioConquistados;
					partidaCasa += (tieneRey ? casaRey : 0);
					partidaCasa += tieneDescendientes ? plusDescendientes : 0);
					partidaCasa += batallaPerdidas*plusBatallaPerdidas;
					
					
				
				}
					
					
					
				
			}
				

		

		