
public class Ejercicio02 {
	public static void main(String[] args) {
		
		int num1, num2;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce un n�mero");
		num2 = teclado.nextInt();
		
		if (num1 == num2) {
			System.out.println("El n�mero " +num2+ " igual que " +num1);
		}
		else if (num1 > num2) {
			System.out.println("El n�mero " +num2+ " es mayor " +num1);
		}
		else if (num1 < num2) {
				System.out.println("El n�mero " +num1+ " es mayor que " +num2 );
		}
			
		teclado.close();
		
	}
}
