package practica3;

public class Ejercicio6 {

	public static void main(String[] args) {

		float f1 = 1234567890.0F;
		System.out.println(f1);
		float f2 = 1234567899.0F;
		System.out.println(f1 - f2);  // Da el valor 0 ya que ambos números superan los 24 bits de precisión de float, por lo que se pierde información.
		
		int i1 = 1234567890;
		int i2 = 1234567899;
		System.out.println(i1 - i2);  // Da el valor -9, ya que esta en el limite de los 32 bits.
	}

}
