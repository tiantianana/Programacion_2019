
public class Ejercicio09 {
	public static void main(String[] args) {
		int num;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		if(num == 1) {
			System.out.println("11111");
		}else if(num == 2) {
			System.out.println("22222");
		}else {
			System.out.println("Otro");
		}
		teclado.close();
	}
}
