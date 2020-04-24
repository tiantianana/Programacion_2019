package Ejercicio3;


public class Ejercicio3 {
    public static void main(String[] args) {
    	
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        teclado.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Introduce el texto");
        String texto = teclado.next();
        String[] palabras = texto.split(" ");

        for(int i = 1; i <= 10; i++) {
            int wordsWithThisLength = 0;
            for(String palabra:palabras) {
                if(palabra.length() == i) {
                    wordsWithThisLength++;
                }
            }
            System.out.println("Palabras de longitud " + i + ": " + wordsWithThisLength);
        }

        char[] vocales = new char[]{
                'a',
                'e',
                'i',
                'o',
                'u',
        }
        ;
        for(char vocal:vocales) {
            int wordsStartsWithThisLetter = 0;
            for(String palabra:palabras) {
                if(palabra.toLowerCase().charAt(0) == vocal) {
                    wordsStartsWithThisLetter++;
                }
            }
            System.out.println("Palabras que empiezan por " + vocal + ": " + wordsStartsWithThisLetter);
        }

        teclado.close();
    }
}
