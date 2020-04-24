
public class Objetos2 {

	public static void main(String[] args) {

		
		if(!args[0].equals("dia") && !args[0].equals("noche")) 
		{
			System.out.println("El parametro dia/noche es incorrecto");
			return;
		}
		
		boolean esDia = args[0].equals("día");
		int soldados = Integer.parseInt(args[1]);
		int maquinas = Integer.parseInt(args[2]);
		boolean veneno = args[3].equals("veneno");
		boolean llueve = args[4].equals("llueve");
		
		/*
		if (!esDia) {
			{
			if(soldados > 500);
			{
				if (maquinas >= 50);
				{
					System.out.println("La estrategia recomendada es la A: Ataque silecioso");
					}
				}
			}
		}
		*/
		
		// Este código es muy largo, la serie de condiciones if se puede reducir a switch-case.
		
		if (args[0].equals("noche") && soldados > 500 && maquinas >= 50 && !llueve) 
		{		
			System.out.println("La estrategia recomendades la A: Ataque silencioso");
		}
		if(esDia && soldados > 10000) {
		{ 
			System.out.println("La estrategia recomendada es la B: Fuego cruzado");
		}
		if(!esDia && soldados >= 1 && veneno)
		{
			System.out.println("La estrategia recomendada es la C: Matada al rey");
		}
		else 
		{
			System.out.println("No se cumplen los requisitos de ninguna estrategia al completo pero te describo lo que satisfaces de cada una de ellas para que tú tomes la decisión");
			System.out.println();
		}
			
			String cumple = "Cumple", no_cumple = "No cumple";
			System.out.print("Estrategia A:");
			if(!esDia)
			{
				cumple += "es de noche,";
			} else
			{
				no_cumple += "es de día,";
			}
			if(soldados > 500)
			{
				cumple += "hay soldados suficientes,";
			}
			else 
			{
				no_cumple += "no hay soldados suficientes,";	
			}
			if(maquinas >= 50)
			{
				cumple += "hay maquinas,";	
			}
			else {
				no_cumple += "no hay maquinas,";	
			}
			if(!llueve)
			{
				cumple += "llueve,";	
			}
			else {
				no_cumple += "no llueve,";	
			}
			
			int random = (int)(Math.random()*3)+1; // Random to choose strtategy A B o C*
			int baratheonH_money = 100000; // Initial money in budget, try  100000 to
			int wood, iron, herbs;
			System.out.println("Initial budget" +baratheonH_money);
			int nsoldados;
			int nmaquinas;
			
			
			/*
			 * 
			 * 
			switch(random)
			{
				case 1:
					nsoldados = 501 - soldados;
					nmaquina = 50 - maquina;
					nveneno = 0;
					strategy = 'A';
					break;
			}
			case 2: 
			{
			*/
				
			}
			
			
		}
	}
}



