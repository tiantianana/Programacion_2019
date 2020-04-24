
public class Ejercicio04 {


	public static void main(String[] args) {
		
		int a,b; 
		float c=3; 
		boolean r,s,t,u,v,w,x; 
		a = 3; 
		b = 8; 
		r = a == 0; 
		s = a != 0; 
		t = a <= b; 
		u = b >= a; 
		v = b > a; 
		w = b < a; 
		x = c == 3.0; 
		System.out.println("r:" + r); 		// Es false ya que 3 es distinto de 0 
		System.out.println("s:" + s); 		// Es true por que 3 es distinto de 0
		System.out.println("t:" + t); 		// Es true por que 3 es menor que 8
		System.out.println("u:" + u); 		// Es true ya que 8 es mayor o igual que 3
		System.out.println("v:" + v); 		// Es true ya que 8 es mayor que 3
		System.out.println("w:" + w); 		// Es false ya que 8 no es menor que 3
		System.out.println("x:" + x); 		// El valor es igual aunque sean distintos tipos de variable, por lo tanto se pueden comparar.
		

	}

}

