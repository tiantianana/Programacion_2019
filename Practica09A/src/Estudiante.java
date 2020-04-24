import java.util.Scanner;

class Estudiante {
	private String nombre;
	private String apellido;
	private float notaProgramacion;
	private float notaAlgebra;
	private float notaCalculo;
	private float notaFisica;
	private float notaEscritura;
	private float notaInformacion;

	public Estudiante(String nombre, String apellido, float notaProgramacion, float notaAlgebra, float notaCalculo,
			float notaFisica, float notaEscritura, float notaInformacion) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setNotaProgramacion(notaProgramacion);
		this.setNotaAlgebra(notaAlgebra);
		this.setNotaCalculo(notaCalculo);
		this.setNotaFisica(notaFisica);
		this.setNotaEscritura(notaEscritura);
		this.setNotaInformacion(notaInformacion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getNotaProgramacion() {
		return notaProgramacion;
	}

	public void setNotaProgramacion(float notaProgramacion) {
		if(this.validarNota(notaProgramacion)) {
			this.notaProgramacion = notaProgramacion;
		}
		else {
			this.notaProgramacion = 0;
		}
	}

	public float getNotaAlgebra() {
		return notaAlgebra;
	}

	public void setNotaAlgebra(float notaAlgebra) {
		if(this.validarNota(notaAlgebra)) {
			this.notaAlgebra = notaAlgebra;
		}
		else {
			this.notaAlgebra = 0;
		}
	}

	public float getNotaCalculo() {
		return notaCalculo;
	}

	public void setNotaCalculo(float notaCalculo) {
		if(this.validarNota(notaCalculo)) {
			this.notaCalculo = notaCalculo;
		}
		else {
			this.notaCalculo = 0;
		}
	}

	public float getNotaFisica() {
		return notaFisica;
	}

	public void setNotaFisica(float notaFisica) {
		if(this.validarNota(notaFisica)) {
			this.notaFisica = notaFisica;
		}
		else {
			this.notaFisica = 0;
		}
	}

	public float getNotaEscritura() {
		return notaEscritura;
	}

	public void setNotaEscritura(float notaEscritura) {
		if(this.validarNota(notaEscritura)) {
			this.notaEscritura = notaEscritura;
		}
		else {
			this.notaEscritura = 0;
		}
	}

	public float getNotaInformacion() {
		return notaInformacion;
	}

	public void setNotaInformacion(float notaInformacion) {
		if(this.validarNota(notaInformacion)) {
			this.notaInformacion = notaInformacion;
		}
		else {
			this.notaInformacion = 0;
		}
	}

	private boolean validarNota(float nota)
	{
		return nota <= 10 && nota >= 0;
	}
	
	public String toString() {
		return this.getNombre() + ", " + this.getApellido() + ". NOTAS: "
				+ "Programaci�n -> " + this.getNotaProgramacion()
				+ " �lgebra -> " + this.getNotaAlgebra()
				+ " C�lculo -> " + this.getNotaCalculo()
				+ " F�sica -> " + this.getNotaFisica()
				+ " T�cnicas de expresi�n oral y escrita -> " + this.getNotaEscritura()
				+ " T�cnicas de b�squeda y uso de la informaci�n -> " + this.getNotaInformacion();
	}
}

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nombre, apellidos;
		float notaProgramacion, notaAlgebra, notaCalculo, notaFisica, notaEscritura, notaInformacion;
		
		System.out.println("Introduce el nombre del estudiante: ");
		nombre = input.nextLine();
		
		System.out.println("Introduce los apellidos del estudiante: ");
		apellidos = input.nextLine();
		
		System.out.println("Introduce la nota en programaci�n del estudiante: ");
		notaProgramacion = input.nextFloat();

		System.out.println("Introduce la nota en �lgebra del estudiante: ");
		notaAlgebra = input.nextFloat();

		System.out.println("Introduce la nota en c�lculo del estudiante: ");
		notaCalculo = input.nextFloat();

		System.out.println("Introduce la nota en f�sica del estudiante: ");
		notaFisica = input.nextFloat();

		System.out.println("Introduce la nota en t�cnicas de expresi�n oral y escrita del estudiante: ");
		notaEscritura = input.nextFloat();
		
		System.out.println("Introduce la nota en t�cnicas de b�squeda y uso de la informaci�n del estudiante: ");
		notaInformacion = input.nextFloat();

		System.out.println("Introduce la nota en programaci�n del estudiante: ");
		notaProgramacion = input.nextFloat();
		Estudiante estudiante = new Estudiante(nombre, apellidos, notaProgramacion, notaAlgebra, notaCalculo, notaFisica, notaEscritura, notaInformacion);
		
		System.out.println(estudiante);
		
		input.close();
	}
}
