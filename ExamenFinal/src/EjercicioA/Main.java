package EjercicioA;

import java.util.Scanner;

public class Main {
    public static int tamanyoArray = 0;
    public static int repeticionesMaxNumPeque = 0;
    public static int[] ocurrenciasPosiciones;


    // Genera un número aleatorio entre 0 y 19, que es lo que estipula el ejercicio
    public static int getNumeroAleatorio() {
        final int max = 19, min = 0;
        return (int)Math.floor(Math.random()*(max-min+1)+(min));

    }

    public static int getNumPeque(int[] vector) {
        int numPeque = -1; // Se usa un número fuera del rango 0-19 para denotar que
        // tiene que ser actualizado, ya que si no le damos valor toma 0
        // y 0 siempre será el valor mínimo de 0-19 aunque no exista
        // en nuestro vector.
        for(int i = 0; i < vector.length; i++) {
            if(numPeque == -1 || numPeque > vector[i]) {
                numPeque = vector[i];
            }
        }
        return numPeque;
    }

    public static int getRepeticionesNumPeque(int [] vector) {
        int repeticiones = 0, numPeque = getNumPeque(vector);
        for(int i = 0; i < vector.length; i++) {
            if(numPeque == vector[i]) {
                repeticiones++;
            }
        }
        return repeticiones;
    }

    public static void printVector(int[] vector) {
        int numPeque = getNumPeque(vector);
        System.out.println(); //Esto para que la siguiente línea salga abajo y no con esta, ya que usaremos una sola.
        for(int num:vector) {
            if(num == numPeque) {
                System.out.print("<<" + num + ">> ");
            }
            else {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] generarArrayAleatorio() {
        int[] vector = new int[tamanyoArray];
        for(int i = 0; i < vector.length; i++) {
            vector[i] = getNumeroAleatorio();
        }
        return vector;
    }

    public static void generarPrueba() {
        //Hacemos un for ya que tenemos 100 iteraciones de tope independientemente del resto.
        for(int i = 0; i < 100; i++) {
            int[] vector = generarArrayAleatorio();

            printVector(vector);

            aumentarOcurrencias(vector);

            if(getRepeticionesNumPeque(vector) >= repeticionesMaxNumPeque) {
                break;
            }
        }
        System.out.println(); //Sólo para evitar un bug visual, no comerse el tarro con esto
        //Mostramos las ocurrencias una vez ha finalizado el bucle.
        mostrarOcurrencias();

        // Es dudoso? vamos a ello guapxs
        if(esSecuenciaDudosa()) {
            System.out.println("SECUENCIA DUDOSA");
        }
    }

    public static void pedirDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("[Introduce] Tamaño del array: ");
        tamanyoArray = input.nextInt();
        System.out.println("[Introduce] Número de repeticiones aceptable para el número pequeño: ");
        repeticionesMaxNumPeque = input.nextInt();

        input.close();
    }

    //Inicia el array de ocurrencias por posición ya que antes no conocíamos el dato tamanyoArray.
    public static void iniciarOcurrencias() {
        ocurrenciasPosiciones = new int[tamanyoArray];
    }

    public static void aumentarOcurrencias(int[] vector) {
        int numPeque = getNumPeque(vector);
        for(int i = 0; i < vector.length; i++) {
            if(vector[i] == numPeque) {
                ocurrenciasPosiciones[i]++;
            }
        }
    }

    public static void mostrarOcurrencias() {
        System.out.println("Veces mínimo");
        for(int i = 0; i < ocurrenciasPosiciones.length; i++) {
            System.out.println("Pos " + i + ":" + ocurrenciasPosiciones[i]);
        }
    }

    public static boolean esSecuenciaDudosa() {

        for(int i = 0; i < ocurrenciasPosiciones.length; i++) {
            if(ocurrenciasPosiciones[i] > 2 * repeticionesMaxNumPeque) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        pedirDatos();
        iniciarOcurrencias();
        generarPrueba();
    }

}

