
public class Ejercicio05 {
	public static void main(String[] args) {
		
		String a, b;
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.print("Introduce un nombre");
		a = teclado.next();
		
		System.out.println("Introduce otro nombre");
		b = teclado.next();
		
		int num1, num2;
		
		System.out.println("Introduce la edad de " +a);
		num1 = teclado.nextInt();
		
		System.out.println("Introduce la edad de " +b);
		num2 = teclado.nextInt();
		
		if(num1==num2)
			System.out.println(a+ " y " +b+ "tienen la misma edad" );
		else if (num1>num2)
			System.out.println(a+ " es mayor que " +b);
		else if (num1<num2)
			System.out.println(b+ " es mayor que " +b);
		
		teclado.close();
		

	}
}
