public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("Introduce el número de segundos a convertir: ");
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		int totalsegundos = teclado.nextInt();
		int horas = totalsegundos / 3600;
		int minutos = (totalsegundos % 3600) / 60;
		int segundos = (totalsegundos % 3600) % 60;
		System.out.println(totalsegundos + " segundos son " + horas + " horas, " + minutos + " minutos, y " + segundos + " segundos");
		teclado.close();
	}

}

