Package Practica3
public class Ejercicio12 {
	public static void main(String[] args) {
		long varlong1 = 12345678910111213L;
		long varlong2 = 987654321987654L;
		long varlong3 = varlong1 + varlong2;
		System.out.println(varlong3);
		varlong3 = varlong1 - varlong2;
		System.out.println(varlong3);
		varlong3 = varlong1 * varlong2;
		System.out.println(varlong3);
		varlong3 = varlong1 / varlong2;
		System.out.println(varlong3);
		
		int varEntera1 = 2000000;
		int varEntera2 = 1000000;
		int varEntera3 = varEntera1 + varEntera2;
		System.out.println(varEntera3);
		varEntera3 = varEntera1 - varEntera2;
		System.out.println(varEntera3);
		varEntera3 = varEntera1 * varEntera2;
		System.out.println(varEntera3);
		varEntera3 = varEntera1 / varEntera2;
		System.out.println(varEntera3);
		
		short varShort1 = 50;
		short varShort2 = 20;
		/*short varShort3 = varShort1 + varShort2; 
		System.out.println(varShort3);
		varShort3 = varShort1 - varShort2;
		System.out.println(varShort3);
		varShort3 = varShort1 * varShort2;
		System.out.println(varShort3);
		varShort3 = varShort1 / varShort2;
		System.out.println(varShort3);*/ //Cuando operas dos variables short, java toma el resultado como una variable int, por lo que salta el error de que no se puede meter un valor int en una variable short. Para solucionar ésto, habría que hacer un casting explícito (por ejemplo: short varShort3 = (short)varShort1 - varShort2)
		
		byte varByte1 = 2;
		byte varByte2 = 1;
		/*byte varByte3 = varByte1 + varByte2;
		System.out.println(varByte3);
		varByte3 = varByte1 - varByte2;
		System.out.println(varByte3);
		varByte3 = varByte1 * varByte2;
		System.out.println(varByte3);
		varByte3 = varByte1 / varByte2;
		System.out.println(varByte3);*/ //Cuando operas dos variables byte, java toma el resultado como una variable int, por lo que salta el error de que no se puede meter un valor int en una variable byte. Para solucionar ésto, habría que hacer un casting explícito (por ejemplo: byte varByte3 = (byte)varByte1 - varByte2)

		char a = 'a';
		char b = 'b';
		char c = 'c';
	}

}

