
public class Ejercicio3 {

	public static void main(String[] args) {

		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		int num, mult;
		int contador = 0;
		System.out.println("Introduce un numero");
		num = teclado.nextInt();
		
		System.out.println("¿Cuántos multiplos de " +num+ " quieres?");
		mult= teclado.nextInt();
		
		for (contador=1; contador <= mult ; contador++) {
			System.out.println(num*contador);
		}
			
		teclado.close();	
		
	}
}