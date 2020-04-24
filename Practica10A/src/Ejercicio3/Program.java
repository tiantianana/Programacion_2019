package Ejercicio3;

public class Program {
	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.println("Por favor introduzca los siguientes datos del Estudiante: ");
		System.out.println("Nombre:");
		String nombre = teclado.next();
		System.out.println("Apellido:");
		String apellido = teclado.next();
		System.out.println("Nota de Programación:");
		double notaprogramacion = teclado.nextDouble();
		System.out.println("Nota de Información:");
		double notainformacion = teclado.nextDouble();
		System.out.println("Nota de Escritura:");
		double notaescritura = teclado.nextDouble();
		
		Estudiante2 objeto = new Estudiante2(nombre, apellido, notaprogramacion, notainformacion, notaescritura);
		
		System.out.println("Alumn@: " + objeto.getNombre() + " " + objeto.getApellido());
		System.out.println("Nota de Programación: " + objeto.getNotaprogramacion());
		System.out.println("Nota de Información: " + objeto.getNotainformacion());
		System.out.println("Nota de Escritura: " + objeto.getNotaescritura());
		
		teclado.close();
	}
}
