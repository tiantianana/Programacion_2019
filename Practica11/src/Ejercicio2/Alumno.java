package Ejercicio2;

public class Alumno {
	private String nombre;
	private String apellidos;
	
	public Alumno(String nombre, String apellidos) {
		setNombre(nombre);
		setApellidos(apellidos);
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected String getNombre() {
		return nombre;
	}
	protected String getApellidos() {
		return apellidos;
	}
	protected String nombreFormulario() {
		String nombrecompleto = nombre + " " + apellidos;
		String nombrefinal = "";
		if(nombrecompleto.length() > 15) {
			for (int contador = 0, letra = 0; letra <= 15 && contador <= 1; letra++) {
				switch (nombrecompleto.charAt(letra)) {
					case ('Á'):
						nombrefinal += 'a';
					break;
					case ('á'):
						nombrefinal += 'a';
					break;
					case ('É'):
						nombrefinal += 'e';
					break;
					case ('é'):
						nombrefinal += 'e';
					break;
					case ('Í'):
						nombrefinal += 'i';
					break;
					case ('í'):
						nombrefinal += 'i';
					break;
					case ('Ó'):
						nombrefinal += 'o';
					break;
					case ('ó'):
						nombrefinal += 'o';
					break;
					case ('Ú'):
						nombrefinal += 'u';
					break;
					case ('ú'):
						nombrefinal += 'u';
					break;
					default:
						nombrefinal += nombrecompleto.charAt(letra);
					break;
				}
				if (nombrecompleto.charAt(letra) == ' ') {
					++contador;
				}
			}
		} else for (int letra = 0; letra < nombrecompleto.length(); letra++) {
					switch (nombrecompleto.charAt(letra)) {
					case ('Á'):
						nombrefinal += 'a';
					break;
					case ('á'):
						nombrefinal += 'a';
					break;
					case ('É'):
						nombrefinal += 'e';
					break;
					case ('é'):
						nombrefinal += 'e';
					break;
					case ('Í'):
						nombrefinal += 'i';
					break;
					case ('í'):
						nombrefinal += 'i';
					break;
					case ('Ó'):
						nombrefinal += 'o';
					break;
					case ('ó'):
						nombrefinal += 'o';
					break;
					case ('Ú'):
						nombrefinal += 'u';
					break;
					case ('ú'):
						nombrefinal += 'u';
					break;
					default:
						nombrefinal += nombrecompleto.charAt(letra);
					break;
				}
			}
		return nombrefinal.toUpperCase();
	}
	
}
