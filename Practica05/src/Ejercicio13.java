	public class Ejercicio13 {
		public static void main(String[] args) {
			java.util.Scanner teclado = new java.util.Scanner(System.in);	
			System.out.println("Dime un año");
			int N = teclado.nextInt();
			
			if (N%4==0) {
				if(N%100==0) {
					if(N%400==0) {
						System.out.println("Si es bisiesto");
					}else System.out.println("No es bisiesto");
				}else System.out.println("Es bisiesto");
			}else System.out.println("No es bisiesto");
			teclado.close();

		}
	}

