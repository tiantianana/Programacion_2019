package Ejercicio3;

import java.util.Scanner;
import Ejercicio3.Programaci�n;

public class Ejercicio3 {
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter(System.getProperty("line.separator"));
        Programaci�n program = new Programaci�n();
        
        
        for(int i = 1; i <= 6; i++) 
        {
            Estudiante t = new Estudiante();
            System.out.println("Nombre del estudiante " + i);
            t.setNombre(teclado.nextLine());
            System.out.println("Apellidos del estudiante " + i);
            t.setApellidos(teclado.nextLine());

            if(i <=5 && program.a�adirEstudiante(t)) {
                System.out.println(t.getNombre() + " a�adido correctamente.");
            }
            else {
                System.out.println(t.getNombre() + " no se pudo a�adir correctamente.");
            }

            
            if(i == 6) 
            {	
                int busca = program.buscarEstudiante(t);
                if(busca != -1) {
                    System.out.println("Estudiante " + t.getNombre() + " encontrado en la posici�n " + busca);
                }
                else {
                    System.out.println("Estudiante " + i + " no encontrado.");
                }
            }
        }
        teclado.close();
    }
}



