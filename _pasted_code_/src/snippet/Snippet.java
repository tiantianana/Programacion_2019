package snippet;

public class Snippet {
		float f1 = 1234567890.0F;
		float f2 = 1234567899.0F;
		
		System.out.println(f2 - f1);  // Devuelve 0 puesto que ambos n�meros superan los 23 bits de precisi�n de float, por lo que se pierde informaci�n.
		
		int i1 = 1234567890;
		int i2 = 1234567899;
		
		System.out.println(i2 - i1);  // Devuelve 9, la respuesta correcta, puesto que los n�meros se pueden contener en 31 bits sin desbordar.
	}
}

