public class Ejercicio12 {

	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduce una cantidad: ");
		long cantidadinicial = teclado.nextLong();
		System.out.println("Introduce el tipo de inter�s: ");
		float tipodeinteres = teclado.nextFloat(); //El tipo de inter�s se tiene que dar en formato "porcentaje/100" Ejemplo: 20% => 0.2
		System.out.println("Introduce el tiempo en a�os: ");
		int tiempo = teclado.nextInt();
		System.out.println("El capital final con el inter�s simple aplicado es de: " + cantidadinicial * (1+tipodeinteres*tiempo));
		System.out.println("El capital final con el interes compuesto aplicado es de " + cantidadinicial * Math.pow(1+tipodeinteres, tiempo));
		teclado.close();
	}

}
