
public class FactoryNivel{
	private int nivel = 1;
	
	public FactoryNivel() {
		construir();
	}
	
	public void Subir() {
			++nivel;
			construir();
	}
	
	private void construir() {
		switch (nivel) {
			case 1:
				int[][] posicionesenjambre1 = new int[][] {
					{30, 100},
					{40, 100},
					{50, 100},
					{60, 100},
					{70, 100},
					{30, 110},
					{40, 110},
					{50, 110},
					{60, 110},
					{70, 110},
				};
				Enjambre enjambre1 = new Enjambre(posicionesenjambre1, 1);
				int[][] posicionesenjambre2 = new int[][] {
					{35, 90},
					{45, 90},
					{55, 90},
					{65, 90},
					{35, 80},
					{45, 80},
					{55, 80},
					{65, 80},
					
				};
				Enjambre enjambre2 = new Enjambre(posicionesenjambre2, 2);
				
				int[][] posicionesenjambre3 = new int[][] {
					{40, 70},
					{50, 70},
					{60, 70},
					{40, 60},
					{50, 60},
					{60, 60},
						
				};
				Enjambre enjambre3 = new Enjambre(posicionesenjambre3, 3);
				
				
				
				//Enemigo[] test = enjambre1.getEnjambre();
				//test[1].getId();
		}
	}
}
