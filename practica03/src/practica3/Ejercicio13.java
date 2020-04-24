package practica3;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int varEntera1 = 5;
		int varEntera2 = 0;
		int varEntera3 = varEntera1/varEntera2;
		System.out.println(varEntera3);
		// Da error ya que 5/0 sale infinito, lo cual es un error matematico.
		
		long varLong1 = 5;
		long varLong2 = 0;
		long varLong3 = varEntera1/varEntera2;
		System.out.println(varEntera3);
		// Sigue dando error, ya que el infinito, lo cual es un error matematico.
		
		// En ninguno de los casos dará un resultado ya que las variables determinan valores reales y el infinito no es un valor real.
	

	}

}
