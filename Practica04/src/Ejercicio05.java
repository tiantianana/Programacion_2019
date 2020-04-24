
public class Ejercicio05 {
	public static void main(String[] args) {
		
		int a,b; 
		boolean r,s; 
		a = 3; 
		b = 8; 
		r = a == 0 || b >= a; 
		s = a != 0 && b < a; 
		System.out.println("r:" + r); 		// Es true porque aunque a no sea igual a cero, con el operador "OR" la segunda parte es correcta (8 es mayor que 3).
		System.out.println("s:" + s); 		// Es falso, ya que 8 no es mayor que 3 aunque a sea distinto de 0 y con el operador && ambas partes tienen que ser verdaderas (no solo una).
		
		
		
	}
}
