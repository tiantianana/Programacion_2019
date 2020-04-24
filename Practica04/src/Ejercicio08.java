
public class Ejercicio08 {

	public static void main(String[] args) {
		
		int a=5,b=3,c=20,d=20; 
		c-=++a/b-3+a%b; 		// El resultado es 21 ya que la operación es c (20) menos lo siguiente: ++a (6) entre b (3) es 2, menos 3 que es -1, más el módulo de 6 entre b, que es 0. Por tanto 20 - (-1) es 21.
		d-=++a/(b+3-4*a)%b; 	// El resultado es 20 ya que la operación es d (20) menos lo siguiente: ++a (que es 7) entre (-14), como el resultado no es un número entero, se trunca y lo toma como 0. Por lo tanto 20 - 0 es 20. 
		   System.out.println("c:" + c); 
		   System.out.println("d:" + d); 

	}

}
