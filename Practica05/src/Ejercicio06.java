
public class Ejercicio06 {
	

	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		int num, p;
		
		System.out.println("Introduzca su edad");
		num = teclado.nextInt();
		p = 9; // precio
		
		if (num <5) {
			System.out.println("El precio es de " + (int)(p-p*0.6)+ " euros ");
		}
		else if (num>5 && num<20) {
			System.out.println("El precio es de " + (p-p*0.2)+ " euros");
		}
		else if (num>65) {
			System.out.println("El precio es de " + (p-p*0.4)+ " euros");
		}
		else if (num>20 && num<65) {
			System.out.println("El precio es de " + (p)+ "euros");
		}	
		teclado.close();	
	}
}
