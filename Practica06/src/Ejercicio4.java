
		public class Ejercicio4 {

			public static void main(String[] args) {
				int random = (int)((Math.random()*100)+1), numintentos = 0;
				System.out.println("Introduzca un numero entero");
				java.util.Scanner teclado = new java.util.Scanner(System.in);
				int intento = teclado.nextInt();
				++numintentos;

				while (intento != random) {
					if (intento < random) {
						++numintentos;
						System.out.println("El numero introducido es menor que el buscado, vuelva a introducir otro numero entero");
						intento = teclado.nextInt();
					}
					else if (intento > random) {
						++numintentos;
						System.out.println("El numero introducido es mayor que el buscado, vuelva a introducir otro numero entero");
						intento = teclado.nextInt();
					}
				}
				if (intento == random) {
					System.out.println("El numero introducido ha coincidido con el buscado: " + random);
					System.out.println("Para ello han hecho falta " + numintentos + " intentos");
				}
				teclado.close();
			}

		}
		