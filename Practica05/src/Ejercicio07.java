
public class Ejercicio07 {
	
	public static void main(String[] args) {

		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduce un numero");
		int a = teclado.nextInt();
		System.out.println("Introduce otro numero");
		int b = teclado.nextInt();
		System.out.println("Introduce otro numero");
		int c = teclado.nextInt();
            if ((a > b) && (a > c))
            {
                if (b > c)
                {
                    System.out.print(c + " " + b + " " + a);
                }
                else
                {
                	System.out.print(b + " " + c + " " + c);
                }
            }
            else if ((b > a) && (b > c))
            {
                if (a > c)
                {
                	System.out.println(c + " " + a + " " + b);
                }
                else
                {
                	System.out.println(a + " " + c + " " + b);
                }
            }
            else if ((c > a) && (c > b))
            {
                if (a > b)
                {
                	System.out.println(b + " " + a + " " +  c);
                }
                else
                {
                	System.out.println(a + " " + b + " " + c);
                }
            }
            teclado.close();
}

}
