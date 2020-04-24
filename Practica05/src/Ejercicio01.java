
public class Ejercicio01 {

	public static void main(String[] args) {

		int num;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.println("Dame un número entero");
		num = teclado.nextInt();
		
		if(num%2 == 0) {
			System.out.println("El número " + num + " es par");
		}
		else {
			System.out.println("El número " + num + " es impar");
		}
		
		teclado.close();
	
	}

}
