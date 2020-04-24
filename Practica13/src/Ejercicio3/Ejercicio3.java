package Ejercicio3;

import java.util.Scanner;
import Ejercicio3.Programación;

public class Ejercicio3 {
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter(System.getProperty("line.separator"));
        Programación program = new Programación();
        
        
        for(int i = 1; i <= 6; i++) 
        {
            Estudiante t = new Estudiante();
            System.out.println("Nombre del estudiante " + i);
            t.setNombre(teclado.nextLine());
            System.out.println("Apellidos del estudiante " + i);
            t.setApellidos(teclado.nextLine());

            if(i <=5 && program.añadirEstudiante(t)) {
                System.out.println(t.getNombre() + " añadido correctamente.");
            }
            else {
                System.out.println(t.getNombre() + " no se pudo añadir correctamente.");
            }

            
            if(i == 6) 
            {	
                int busca = program.buscarEstudiante(t);
                if(busca != -1) {
                    System.out.println("Estudiante " + t.getNombre() + " encontrado en la posición " + busca);
                }
                else {
                    System.out.println("Estudiante " + i + " no encontrado.");
                }
            }
        }
        teclado.close();
    }
}



