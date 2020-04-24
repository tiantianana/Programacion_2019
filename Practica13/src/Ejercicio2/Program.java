package Ejercicio2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter(System.getProperty("line.separator"));

        Cliente cliente = new Cliente();
        System.out.println("�Cual es el nombre del titular de los dep�sitos normal y estructurado");
        cliente.setNombre(teclado.nextLine());

        System.out.println("Dep�sito normal: ");
        Deposito deposito = new Deposito();
        deposito.setTitular(cliente);
        System.out.println("Introduce el plazo en d�as del dep�sito");
        deposito.setPlazo(teclado.nextInt());
        System.out.println("Introduce el capital del dep�sito");
        deposito.setCapital(teclado.nextFloat());
        System.out.println("Introduce el tipo de inter�s del dep�sito");
        deposito.setInteres(teclado.nextFloat());

        System.out.println("Una vez finalizado el plazo, la liquidaci�n ser� de: " + deposito.LiquidarDeposito() + "�");
        System.out.println("El intereses de la operaci�n es : " + deposito.ConsultarIntereses() + "�");

        System.out.println(" Dep�sito estructurado: ");
        DepositoEstructurado depositoEstructurado = new DepositoEstructurado();
        depositoEstructurado.setTitular(cliente);
        System.out.println("Introduce el plazo en d�as del dep�sito estructurado");
        depositoEstructurado.setPlazo(teclado.nextInt());
        System.out.println("Introduce el tramo fijo del dep�sito estructurado");
        depositoEstructurado.setTramoFijo(teclado.nextInt());
        System.out.println("Introduce el tramo variable del dep�sito estructurado");
        depositoEstructurado.setTramoVariable(teclado.nextInt());
        System.out.println("Introduce el capital del dep�sito estructurado");
        depositoEstructurado.setCapital(teclado.nextFloat());
        System.out.println("Introduce el tipo de inter�s del dep�sito estructurado");
        depositoEstructurado.setInteres(teclado.nextFloat());

        System.out.println("Una vez finalizado el plazo, la liquidaci�n ser� de: " + depositoEstructurado.LiquidarDeposito() + "�");
        System.out.println("Intereses de la operaci�n: " + depositoEstructurado.ConsultarIntereses() + "�");
    }
}
