
public class Ejercicio03 {

	public static void main(String[] args) {
		int num1, num2;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce un n�mero");
		num2 = teclado.nextInt();
		
		if (num1%num2==0)
			System.out.println("El n�mero " +num1+ " es divisible entre el n�mero " +num2);
			else 
				System.out.println("El n�mero " +num1+ " no es divisible entre el n�mero " +num2 );

		teclado.close();
	}
}
