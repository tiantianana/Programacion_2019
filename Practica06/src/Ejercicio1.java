
public class Ejercicio1 {

	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduzca un numero entero por favor: ");
		int num = teclado.nextInt();
		int sum=0;
		int contador=0;
		while (num !=0) {
			sum += num; 
			contador++;
			System.out.println("Introduzca otro numero entero: ");
			num = teclado.nextInt();
		}
		System.out.println("La suma de los numeros es " + (float)sum);
		System.out.println("La media de los numeros es " + (float)sum/(float)contador);
		teclado.close();
	}

}