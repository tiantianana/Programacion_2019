
public class Prueba1 {

	public static void main(String[] args) {
				int num1, num2;
				java.util.Scanner teclado = new java.util.Scanner(System.in);
				
				System.out.println("Introduce un n�mero");
				num1 = teclado.nextInt();
				
				System.out.println("Introduce un n�mero");
				num2 = teclado.nextInt();
				
				if (num1 != num2) {
					if (num1 > num2) {
					System.out.println("El n�mero " +num2+ " es mayor " +num1);}
					else	{
						System.out.println("El n�mero " +num1+ " es menor que " +num2 );
					}
				}
				else {
					System.out.println("El n�mero " +num1+ " es igual que " +num2);
				}
				teclado.close();
	}
}
