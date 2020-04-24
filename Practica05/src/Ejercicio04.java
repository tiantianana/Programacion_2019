
public class Ejercicio04 {
	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduce un número");
		int numero1 = teclado.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = teclado.nextInt();
		if (numero2 != 0) {
		System.out.println("El resultado de hacer la división de ambos números es: " + (float)numero1/(float)numero2);
		}else {
		System.out.println("No se puede dividir por cero usando enteros");
		}
		teclado.close();
	}
}
