package practica3;

public class Ejercicio5 {

	public static void main(String[] args) {

			long varLong;
			varLong = 12345678910111213L;
			System.out.println(varLong);
			//varLong = 123456789101112135434689L; //Se produce un error ya que el numeros supera el tamaño de bits que acepta la variable.
			//System.out.println(varLong);
			
					
			int varEntera;
			varEntera = 200;
			System.out.println(varEntera);
			//varEntera = -2147483649; //Se produce un error ya el numero supera el tamaño de bits.
			//System.out.println(varEntera);
			
			short varShort;
			varShort = 32767;
			System.out.println(varShort);
			//varShort = 32768; 	//Se produce un error ya que el numero esta fuera de rango
			//System.out.println(varShort);
			
			byte varByte;
			varByte = 10;
			System.out.println(varByte);
			//varByte = -200; 	//Se produce un error ya que el numero esta fuera de rango
			//System.out.println(varByte);
			
			float varFloat;
			varFloat = 876.234E+34F;
			System.out.println(varFloat);
			//varFloat = 876234.888F;	//Se produce un error ya que el numero supera el rango de bits que la variable permite.
			//System.out.println(varFloat);
			
			double varDouble; 
			varDouble = 9.876;
			System.out.println(varDouble);
			//varDouble = 98767898654654E; 	//Se produce un error ya que el numero asignado esta fuera de rango de bits que la variable permite.
			//System.out.println(varDouble);


	}

}
