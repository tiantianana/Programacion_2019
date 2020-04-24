
public class Ejercicio07 {

	public static void main(String[] args) {
		
		int a=5,b=3;
		boolean r=true,s=false;
		a+=b+8*b;
		r&=s;
		System.out.println("a:" + a);		// El resultado da 32. Esto se debe a que cuando se pone una expresión del tipo a+=2, significa a = a + 2. En este caso la operación sería a = 5 + 3 + 8*5 
		System.out.println("b:" + b);		// El resultado es 3 ya que b es igual a tres desde el principio que se declara e inicializa la variable.
		System.out.println("r:" + r);		// La expresión r&=s es equivalente a poner r = r & s. Como r es true, pasa a comprobar el valor de s. Al ser este false, el valor que se devuelve es false.
		System.out.println("s:" + s);		// Devuelve false ya que el valor de s no se modifica desde que se declara e inicializa la variable.

	}

}
