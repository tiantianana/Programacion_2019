import java.util.Scanner;

public class Estudiante2 {

	private String nombre;
	private String apellido;
	private double notaProgramacion;
	private double notaAlgebra;
	private double notaCalculo;
	private double notaFisica;
	private double notaEscritura;
	private double notaInformacion;
	
	public Estudiante2(String nombre, String apellido, double notaProgramacion, double notaAlgebra, double notaFisica, double notaEscritura, double notaInformacion) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaProgramacion = notaProgramacion > 10 || notaProgramacion < 10 ? 0: notaProgramacion;
		this.notaAlgebra = notaAlgebra > 10 || notaAlgebra < 10 ? 0: notaAlgebra;
		this.notaCalculo = notaCalculo > 10 || notaCalculo < 10 ? 0: notaCalculo;
		this.notaFisica = notaFisica > 10 || notaFisica < 10 ? 0: notaFisica;
		this.notaEscritura = notaEscritura > 10 || notaEscritura < 10 ? 0: notaEscritura;
		
		// Otra forma de comprobar que los objetos cumplan las condiciones (rango de notas entre 0 y 10).
	
	}
	
	public static void main(String[] args)
	{
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digame su nombre");
		String nombre = teclado.nextLine();
		
		System.out.println("Digame su apellido");
		String apellido = teclado.nextLine();
		
		System.out.println("Digame su nota en programación");
		double notaProgramacion = teclado.nextDouble();
		
		System.out.println("Digame su nota en algebra");
		double notaAlgebra = teclado.nextDouble();
		
		System.out.println("Digame su nota en calculo");
		double notaCalculo = teclado.nextDouble();

		System.out.println("Digame su nota en fisica");
		double notaFisica = teclado.nextDouble();

		System.out.println("Digame su nota en escritura");
		double notaEscritura = teclado.nextDouble();

		
		System.out.println("Digame su nota en informacion");
		double notaInformacion = teclado.nextDouble();

		// Continua igual que el ejercicio Estudiante.
		
	}
	
} 