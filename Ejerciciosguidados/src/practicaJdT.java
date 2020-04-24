import javax.print.DocFlavor.STRING;

public class practicaJdT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lannister = 0;
		double stark = 0;
		double baratheon = 0;
		double tyrell = 0;
		double martell = 0;
		double tully = 0;
		double arryn = 0;
		
		double presopuestoTotal = 50000000;
		int totalTerritorios = 15000000;
		int plusRey = 5000000;
		int plusDescendientes = 1000000;
		int penalBatalla = 2000000;
		double plusTerritorio = totalTerritorios/12.0;
		
		lannister = (3*plusTerritorio) + (1*plusRey) + (1*plusDescendientes) - (0*penalBatalla);
		System.out.println("Presupuesto de la casa Lannister: " + lannister);
		
		stark = (5*plusTerritorio) + (0*plusRey) + (1*plusDescendientes) - (2*penalBatalla);
		System.out.println("Presupuesto de la casa stark: " + stark);
		
		baratheon = (2*plusTerritorio) + (0*plusRey) + (1*plusDescendientes) - (1*penalBatalla);
		System.out.println("Presupuesto de la casa barethon: " + baratheon);
		
		tyrell = (1*plusTerritorio) + (0*plusRey) + (0*plusDescendientes) - (1*penalBatalla);
		System.out.println("Presupuesto de la casa Tyrell: " + tyrell);
		
		martell = (1*plusTerritorio) + (0*plusRey) + (0*plusDescendientes) - (0*penalBatalla);
		System.out.println("Presupuesto de la casa Martell: " + martell);
		
		tully = (0*plusTerritorio) + (0*plusRey) + (0*plusDescendientes) - (0*penalBatalla);
		System.out.println("Presupuesto de la casa Tully: " + tully);
		
		arryn = (0*plusTerritorio) + (0*plusRey) + (0*plusDescendientes) - (0*penalBatalla);
		System.out.println("Presupuesto de la casa Arryn: " + arryn);
		
		
		String casa = "Lannister";
		if(casa.equals("Lannister"))
		{
			System.out.print("Soy Lannister");
		}
		else if (casa.equals("Stark"))
		{
			System.out.print("Soy Stark");
		}
		else 
			System.out.println("No soy ni Stark ni Lannister");
		
		
		switch(casa)		
		{
			case "Lannister":
				System.out.println("Soy Lannister");
			break;
			case "Stark":
				System.out.println("Soy Stark");
			break;
			case "Martell":
				System.out.println("Soy Martell");
			break;
			default: 
				System.out.println("No soy ni Martel ni Stark ni Lannister);"
			break;		}
	}
		teclado.close();
		
}
