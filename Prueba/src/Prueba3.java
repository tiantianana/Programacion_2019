
public class Prueba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int win_1 = 0;
		int win_2 = 0;
		int win_3 = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			int j1 = (int)(Math.random()*2);
			int j2 = (int)(Math.random()*2);
			int j3 = (int)(Math.random()*2);
			
			if (i != 10) {
				System.out.println("El resultado de la tirada " + i + " es:");
			}else {
				System.out.println("El resultado tras la última tirada es:");
			}
						
			if (j1 == 0) {
				System.out.println("El jugador 1 ha sacado CRUZ");
			}else {
				System.out.println("El jugador 1 ha sacado CARA");
			}
			
			if (j2 == 0) {
				System.out.println("El jugador 2 ha sacado CRUZ");
			}else {
				System.out.println("El jugador 2 ha sacado CARA");
			}
			
			if (j3 == 0) {
				System.out.println("El jugador 3 ha sacado CRUZ");
			}else {
				System.out.println("El jugador 3 ha sacado CARA");
			}
			
			if (j1 != j2  &&  j1 != j3) {
				win_1 += 1; // win_1++
				System.out.println("Ha ganado el jugador 1 en la tirada " + i);
			}else if (j2 != j1  &&  j2 != j3) {
				win_2 += 1;
				System.out.println("Ha ganado el jugador 2 en la tirada " + i);
			}else if (j3 != j1  &&  j3 != j2) {
				win_3 += 1;
				System.out.println("Ha ganado el jugador 3 en la tirada " + i);
			}else {
				System.out.println("Ha habido empate en la tirada " + i);
			}
			
			System.out.println();
			
			if (i != 10) {
				System.out.println("El resultado hasta el momento es:");
			}else {
				System.out.println("El resultado tras la última tirada es:");
			}
			System.out.println("Jugador 1 --> " + win_1 + " puntos");
			System.out.println("Jugador 2 --> " + win_2 + " puntos");
			System.out.println("Jugador 3 --> " + win_3 + " puntos");
			System.out.println();
			
			if (i == 10) {
				if (win_1 > win_2  &&  win_1 > win_3) {
					System.out.println("Ha ganado el jugador 1 con un total de " + win_1 + " puntos");
				}else if (win_2 > win_1  &&  win_2 > win_3) {
					System.out.println("Ha ganado el jugador 2 con un total de " + win_2 + " puntos");
				}else if (win_3 > win_1  &&  win_3 > win_2) {
					System.out.println("Ha ganado el jugador 3 con un total de " + win_3 + " puntos");
				}else if (win_1 == win_2  &&  win_1 > win_3) {
					System.out.println("Los jugadores 1 y 2 han empatado con " + win_1 + " puntos");
				}else if (win_1 == win_3  &&  win_1 > win_2) {
					System.out.println("Los jugadores 1 y 3 han empatado con " + win_1 + " puntos");
				}else if (win_2 == win_3  &&  win_2 > win_1) {
					System.out.println("Los jugadores 2 y 3 han empatado con " + win_2 + " puntos");
				}
			}

		}

	}

}
