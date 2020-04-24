package Ejercicio1;
import java.util.Scanner;
public class Program1 {

	 public static void main(String[] args) {
	        java.util.Scanner teclado = new Scanner(System.in);
	        Hora hora1 = new Hora(true);
	        System.out.println("1. Introduce las horas");
	        hora1.setHoras(teclado.nextByte());
	        System.out.println("1. Introduce los minutos");
	        hora1.setMinutos(teclado.nextByte());
	        
	        Hora hora2 = new Hora(false);
	        System.out.println("2. Introduce las horas");
	        hora2.setHoras(teclado.nextByte());
	        System.out.println("2. Introduce los minutos");
	        hora2.setMinutos(teclado.nextByte());

	        System.out.println("Hora 1: " + hora1);
	        System.out.println("Hora 2: " + hora2);

	        if(hora1.equals(hora2)) {
	            System.out.println("Las horas son iguales.");
	        }
	        else {
	            System.out.println("Las horas no son iguales.");
	        }
	        teclado.close();
	        
	 }
}
