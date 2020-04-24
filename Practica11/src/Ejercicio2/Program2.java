package Ejercicio2;

public class Program2 {

	public static void main(String[] args) {
		Alumno[] alumnos = new Alumno[]{
				new Alumno("Ana", "Villanueva Conde"),
				new Alumno("Enrique", "Benvenutto"),
				new Alumno("Miguel", "Sepúlveda"),
				new Alumno("Tello", "Daroca"),
				new Alumno("Pedro", "Jimenez Nuñez"),
				};

				for(Alumno alumno : alumnos) {
					System.out.println(alumno.nombreFormulario());
				}
				buscarAlumno(alumnos,"ANA");
	}
	
	public static void buscarAlumno(Alumno[] alumnos, String nombreBuscado) {
		for(Alumno alumno:alumnos) {
			if(alumno.getNombre().toLowerCase().equals(nombreBuscado.toLowerCase())) {
				System.out.println("Alumno encontrado! " + nombreBuscado);
			}
		}
	}
}
