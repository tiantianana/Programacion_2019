
	public class Prueba4 {

		public static void main(String[] args) {
			int dia, mes, a�o, numsuerte=0, sum;
			java.util.Scanner teclado = new java.util.Scanner(System.in);
			System.out.println("Introduce tu dia de nacimiento");
			dia = teclado.nextInt();
			System.out.println("Introduce tu mes de nacimiento");
			mes = teclado.nextInt();
			System.out.println("Introduce tu a�o de nacimiento");
			a�o = teclado.nextInt();
			suma = dia + mes + a�o;
			System.out.println(suma);
			
			
		}
	}
