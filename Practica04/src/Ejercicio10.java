
public class Ejercicio10 {

	public static void main(String[] args) {
		int celsius, farenheit;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.println("Introduce un temperatura en grados celsius");
		celsius = teclado.nextInt();
		
		farenheit = ((celsius* 9/5) + 32 );
		System.out.println(farenheit);
		
		teclado.close();
	
		

	}

}
