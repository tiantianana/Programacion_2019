package Ejercicio4;

import java.util.Scanner;

public class Matriz {
    public void llenar(int[][] matriz) {
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el número de la posición " + i + ", " + j + ":");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    public void impimir(int[][] matriz) {
        for(int[] vector:matriz) {
            for(int numero:vector) {
                System.out.print(numero + "  ");
            }
            System.out.println();
        }
    }

    public int minimo(int[][] matriz) {
        Integer peq = null;
        for(int[] vector:matriz) {
            for(int numero:vector) {
                if(peq == null || peq > numero) {
                    peq = numero;
                }
            }
        }
        return peq;
    }

    public int maximo(int[][] matriz) {
        Integer grande = null;
        for(int[] vector:matriz) {
            for(int numero:vector) {
                if(grande == null || grande < numero) {
                    grande = numero;
                }
            }
        }
        return grande;
    }

    public void intercambiar(int[][] matriz1, int[][] matriz2) {
        int minimos1 = this.minimo(matriz1);
        int maximos2 = this.maximo(matriz2);

       
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[i].length; j++) {
                if(matriz1[i][j] == minimos1) {
                    matriz1[i][j] = maximos2;
                }
            }
        }
        
        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[i].length; j++) {
                if(matriz2[i][j] == maximos2) {
                    matriz2[i][j] = minimos1;
                }
            }
        }
    }
}
