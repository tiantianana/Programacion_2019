
public class While; 
	
	public static void main(String[] args) {
		int contador = 1;
		while (contador < 6);
			System.out.println(contador);
			// contador++;
		//Nunca entra en bucle por que la condici�n es siempre falsa.
			
	
		while (contador2 != 10)
		//Condici�n
			System.out.println(contador2);
			contador2 += 2; // actualizaci�n
		// El bucle es infinito ya que la condici�n siempre se cumple.
			
		int contador = 1; // inicializaci�n
		while (contador < 6) // condici�n
		System.out.println(contador);
		contador++; // actualizaci�n
		// El bucle nunca termina porque el valor de la variable de bucle no se actualiza dentro del bucle
	
		import java.util.Scanner;
			public class Rango {
				public static void main(String[] args) {
					Scanner teclado = new Scanner(System.in);
					int numero;
					do{
						System.out.println("Introduce numero (0-10):");
						numero = teclado.nextInt();
					}while((numero>=0)&&(numero>=10));
					System.out.println("Correcto");
					teclado.close();
					
		for (int a=0, b=0; a<10 && b<10, a++, b++)
			System.out.println(a);
			// System.out.println(b); La variable b no va a ser visible fuera del bucle porque ha sido declarada en el mismo bucle.
				
			for (int i = 0; i < 10; i++) {
			for (char c = 97; c <= 122; c++){
				System.out.print(c);
				}
				System.out.println();
				}
					
		for (char c = 97; c<= 122; c++)
			System.out.print(c);
		
		int a = 5;
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0){
					continue;
				}
				a = a + i;
				if (a > 20){
					break;
				}
				System.out.print(a);
		


				
		String s = "Hola mundo";
			int longitud = s.length(); //Te dice el numero de caracteres de la variable s
			char c = s.charAt(1); //charAt te devuelve el valor que est� en la posici�n que le digas, en �ste caso, en la posicion 1 est� la "o"
			
			String x = "Hola mundo";
			int longitud = x.length(); //length saca la longitud del string

			
			
			}
	}	
		
		



