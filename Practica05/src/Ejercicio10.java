
public class Ejercicio10 {
	public static void main(String[] args) {
	
		int num;
		num = 0;
	
		java.util.Scanner teclado = new java.util.Scanner(System.in);
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
	
			switch(num) {
			case 1: 
				System.out.println("11111");
				break;
			case 2: 
				System.out.println("22222");
				break; 
			default: 
				System.out.println("Otro");
				break;
			}
		teclado.close();
		}
	}	