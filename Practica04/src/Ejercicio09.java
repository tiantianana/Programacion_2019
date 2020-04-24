
public class Ejercicio09 {

	public static void main(String[] args) {
		int a;
		double b;
		float c;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		a = teclado.nextInt();
		
		System.out.println("Introduce otro número");
		b = teclado.nextDouble();
		
		c = (float) (a + b);
		System.out.println(c);
		
		teclado.close();
		
	}

}