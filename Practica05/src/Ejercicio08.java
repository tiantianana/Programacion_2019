
public class Ejercicio08 {
	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduce un caracter: ");
		String num = teclado.next();
		if(num.length() == 1) {
			
			switch(num) {
			case "0":
				System.out.println("Es un número");
			break;
			case "1":
				System.out.println("Es un número");
			break;
			case "2":
				System.out.println("Es un número");
			break;
			case "3":
				System.out.println("Es un número");
			break;
			case "4":
				System.out.println("Es un número");
			break;
			case "5":
				System.out.println("Es un número");
			break;
			case "6":
				System.out.println("Es un número");
			break;
			case "7":
				System.out.println("Es un número");
			break;
			case "8":
				System.out.println("Es un número");
			break;
			case "9":
				System.out.println("Es un número");
			break;
			default:
				System.out.println("Lo introducido no es un número");
			} 
		} else System.out.println("Introduce solo un caracter");
		teclado.close();
	}
}
