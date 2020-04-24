public class Ejercicio12 {

	public static void main(String[] args) {
		
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		int a, b;
		
		System.out.println("Dime tu sueldo");
		a = teclado.nextInt();
		
		System.out.println("Dime los años que llevas operando");
		b = teclado.nextInt();
		
		if (a<500 && b>=10) {
			System.out.println("Tu sueldo es de " +(a+a*0.2));}
		else if (a<500 && b<10) {
			System.out.println("Tu sueldo es de " +(a+a*0.05));}
		else if (a>=500) {
			System.out.println("Tu sueldo es de " +a);}
			
		teclado.close();

	}

}