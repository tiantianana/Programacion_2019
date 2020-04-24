public class Ejercicio11 {

	public static void main(String[] args) {
		
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		
		int x, y;
		System.out.println("Introduce una coordenada x");
		x = teclado.nextInt();
		
		System.out.println("Introduce una coordenada y");
		y = teclado.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("Las coordenadas se encuentran en el primer cuadrante");}
		else if (x<0 && y>0) {
			System.out.println("Las coordenadas se encuentran en el segundo cuadrante");}
		else if (x<0 && y<0) {
			System.out.println("Las coordenadas se encuentran en el tercer cuadrante");}
		else if (x>0 && y<0) {
			System.out.println("Las coordenadas se encuentran en el cuarto cuadrante");}
		
		teclado.close();

	}

}