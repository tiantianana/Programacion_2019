

import java.util.Scanner;


public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rondas, ncartas, numJuegos;
		int parejas, trios, escaleras;
		int juego[];
		int rep;
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero de cartas por ronda?");
		ncartas = sc.nextInt();
		System.out.println("Numero de malas rondas?");
		numJuegos = sc.nextInt();
		
		rondas = 0;
		while(rondas < numJuegos){
			parejas = 0;
			trios = 0;
			escaleras = 0;
			juego = sacarJuego(ncartas);
			printArray(juego);
			

			
			for (int j = 1; j<7; j++){
				rep = repetido(j, juego);
				if (rep == 3)
					trios++;
				else if (rep == 2)
					parejas++;
				
				insercionDirecta(juego);
				if (escalera(juego))
					escaleras++;
				
			}
			
			if (parejas == 0 && trios ==0){
				System.out.println("Ronda Mala");
				rondas++;	
			}
			else{
				System.out.print(parejas + " parejas y " + trios + " trios");
				if (escaleras>0)
					System.out.println( " con escalera ");
				else
					System.out.println(" sin escalera ");
			}
			System.out.println();
		}
		System.out.println("Final de Partida!");
		sc.close();
		
	}
	
	public static int[] sacarJuego(int nc){
		
		int nums[] = new int[nc];
		for (int i=0; i<nc ;i++){
			nums[i] = (int)(Math.random() * 7) + 1;
		}
		return nums;
	}
		

	public static void printArray(int[] cartas){
		for (int i = 0; i< cartas.length; i++){
			System.out.print(cartas[i] + " ");
		}
		System.out.println();
	}
	
	public static int repetido (int n, int[] cartas){
		int veces = 0;
		for (int i = 0 ; i < cartas.length; i++){
			if (cartas[i] == n)
				veces++;
		}
		return veces;
		
	}
	
	public static boolean escalera(int[] cartas){
		boolean hayEscalera = true;
		int nsaltos = 0;
		for (int i = 0; i<cartas.length-1; i++){
			if (cartas[i+1] - cartas[i]>1)
				hayEscalera = false;
			else if (cartas[i+1] - cartas[i]==1){
				nsaltos++;
			}
		}
		if (nsaltos < 3)
			hayEscalera = false;
		
		return hayEscalera;
	}
	
	public static void insercionDirecta (int [] lista){
		// empezamos por el segundo elemento de la lista y llegamos hasta el último
		// estamos por lo tanto en cada iteración definiendo una sublista que empieza
		// en el elemento "i"
		for (int i=1; i<lista.length; i++){
			//guardamos en la variable auxiliar el valor del primer elemento de la sublista
			int auxiliar = lista[i];
			// ponemos otro índice en el elemento anterior al primero de la sublista
			int j=i-1;
			//nos mantenemos en el bucle siempre que el contador descendente sea mayor que 
			//cero y que el valor que queremos insertar sea menor que el valor del 
			//elemento j de la lista
			while (j>=0 && auxiliar<lista[j]){
				//movemos el elemento j a la posición j+1
				lista [j+1]=lista[j];
				// decrementamos j para seguir recorriendo la lista hacia atrás
				j--;
			}// fin while
			//una vez localizada la posición en la que debe ir el elemento, ponemos su valor
			lista[j+1]=auxiliar;
			// y empieza el bucle para el siguiente elemento
		}// fin for
	}// fin insercionDirecta

	
	
}

