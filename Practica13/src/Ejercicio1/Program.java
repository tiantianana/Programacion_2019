package Ejercicio1;

import Ejercicio3.Estudiante;

public class Program {
	
	public static void main(String[] args) {
		
	EAsalariado empleado1 = new EAsalariado("569587A", "Javier", "Gómez", 2008, 1225);
    EComision empleado2 = new EComision("695235B", "Javier", "Gómez", 2010, 179, 8.10F);
    
    EComision empleado3 = new EComision();
    empleado3.setNombre("Jose");
    empleado3.setApellido("Ruiz");
    empleado3.setNumDNI("741258C");
    empleado3.setAñoIngreso(2012);
    empleado3.setClientesCaptados(81);
    empleado3.setImportePorCliente(7.9F);
    
    EAsalariado empleado4 = new EAsalariado();
    empleado4.setNombre("María");
    empleado4.setApellido("Núñez");
    empleado4.setNumDNI("896325D");
    empleado4.setAñoIngreso(2013);
    empleado4.setSueldoBasico(1155);

    Empleado[] empleados = new Empleado[]
    	{
             empleado1,
             empleado2,
             empleado3,
             empleado4
    	};
    
	}

	
}
