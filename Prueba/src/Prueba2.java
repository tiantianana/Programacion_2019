public class Prueba2 {

	
	public static void main(String[]args){

		int[] conjunto1 = new int[] {1, 2, 5};
		int[] conjunto2 = new int[3];
		int[] suma = new int[3];
		
		for(int i=0; i < conjunto1.length; i++)
		{
			suma[i] = conjunto1[i] + conjunto2[i];
		}
		
		int sumaTotal = 0;
		for(int i=0; i< suma.length; i++) 
		{
			sumaTotal += suma[i];
		}
		System.out.println(sumaTotal);
	}
}