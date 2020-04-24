
public class Program {
	public static void main(String[] args) 
	{
		Reino lannister = new Reino ("Lannister", "Hear me roar!", 100, 70, 30, 20);
		Reino baratheon = new Reino ("barethon", "Ours is the fury!", 60, 50, 30, 17);
		Reino stark = new Reino ("stark", "Winter is coming!", 30, 10, 7, 3);
		
		Casa casaA = new Casa("CasaA", "Comer y dormir", 0, 1, lannister, TipoVivienda.FAMILIAR);
		Casa casaB = new Casa("CasaB", "Comer y dormir", 0, 1, baratheon, TipoVivienda.FAMILIAR);
		Casa casaC = new Casa("CasaC", "Comer y dormir", 0, 1, stark, TipoVivienda.FAMILIAR);
				
		
	}

}
