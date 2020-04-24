public class Factorial {
	public static void main (String[] args) {
		int num, factorial = 1;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Dime un número");
		num = teclado.nextInt();
		
		for (int contador= num; contador>0; contador--) {
			factorial=factorial*contador;
		}
		System.out.println(factorial);
		
		teclado.close();
	}
}