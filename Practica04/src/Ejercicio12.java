public class Ejercicio12 {

	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduce una cantidad: ");
		long cantidadinicial = teclado.nextLong();
		System.out.println("Introduce el tipo de interés: ");
		float tipodeinteres = teclado.nextFloat(); //El tipo de interés se tiene que dar en formato "porcentaje/100" Ejemplo: 20% => 0.2
		System.out.println("Introduce el tiempo en años: ");
		int tiempo = teclado.nextInt();
		System.out.println("El capital final con el interés simple aplicado es de: " + cantidadinicial * (1+tipodeinteres*tiempo));
		System.out.println("El capital final con el interes compuesto aplicado es de " + cantidadinicial * Math.pow(1+tipodeinteres, tiempo));
		teclado.close();
	}

}
