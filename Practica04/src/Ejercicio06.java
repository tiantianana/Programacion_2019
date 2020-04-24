
public class Ejercicio06 {

	public static void main(String[] args) {
		
		int a = 4;
		float b = 13.3F;
		boolean c = false;
		a += 2; 	//El resultado es 6 ya que suma a (4) mas 2 = 6.
		System.out.println(a); 		
		a -= 3;			// El resultado es 3, ya que a=6 y le restamos 3.
		System.out.println(a);
		a *= 3;			// El resultado es 9, ya que al resultado anterior 3, le multiplicamos *3 que da 9.
		System.out.println(a);
		a /= 2;			// El resultado es 4 ya que 9/2 es 4.5 pero como es una variable int no tiene en cuenta los decimales.
		System.out.println(a);
		a %= 4;			// El resultado es 0, ya que 4/4 es q y su resto es cero.
		System.out.println(a);
		b /= 2;			// El resultado 6.65 ya que es el resultado de 13.3 entre 2.
		System.out.println(b);
		c &= true; 		// Es falso ya que c es false que es distinto que true, por lo que no cumple el operador &.
		System.out.println(c);
		c |= true;		// Es true ya que con que el operador || ("OR")solo hace falta que uno de los dos operadores sea verdadero.
		System.out.println(c);
		
		
		
	}

}