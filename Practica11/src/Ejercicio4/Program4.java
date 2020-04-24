package Ejercicio4;

import java.util.Scanner;

public class Program4 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        Matriz Matriz = new Matriz();

        // MATRIZ 1 
        int fila1, columna1;
        System.out.println("Introduce el número de fila1s de la matriz 1");
        fila1 = teclado.nextInt();
        System.out.println("Introduce el número de columnas de la matriz 1");
        columna1 = teclado.nextInt();
        int[][] matriz1 = new int[fila1][columna1];
        Matriz.llenar(matriz1);

        System.out.println("La matriz 1 es:");
        Matriz.impimir(matriz1);
        System.out.println("El mínimo elemento de la matriz 1 es: " + Matriz.minimo(matriz1));

        //MATRIZ 2
        int fila2, columna2;
        System.out.println("Introduce el número de fila1s de la matriz 2");
        fila2 = teclado.nextInt();
        System.out.println("Introduce el número de columnas de la matriz 2");
        columna2 = teclado.nextInt();
        int[][] matriz2 = new int[fila2][columna2];
        Matriz.llenar(matriz2);

        System.out.println("El máximo elemento de la matriz 2 es:" + Matriz.maximo(matriz2));
        Matriz.intercambiar(matriz1,matriz2);
        System.out.println("La matriz 1 tras el intercambio de elementos es:");
        Matriz.impimir(matriz1);
        System.out.println("La matriz 2 tras el intercambio de elementos es:");
        Matriz.impimir(matriz2);
        teclado.close();
    }
}


