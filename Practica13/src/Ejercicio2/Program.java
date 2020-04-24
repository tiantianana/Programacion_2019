package Ejercicio2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter(System.getProperty("line.separator"));

        Cliente cliente = new Cliente();
        System.out.println("¿Cual es el nombre del titular de los depósitos normal y estructurado");
        cliente.setNombre(teclado.nextLine());

        System.out.println("Depósito normal: ");
        Deposito deposito = new Deposito();
        deposito.setTitular(cliente);
        System.out.println("Introduce el plazo en días del depósito");
        deposito.setPlazo(teclado.nextInt());
        System.out.println("Introduce el capital del depósito");
        deposito.setCapital(teclado.nextFloat());
        System.out.println("Introduce el tipo de interés del depósito");
        deposito.setInteres(teclado.nextFloat());

        System.out.println("Una vez finalizado el plazo, la liquidación será de: " + deposito.LiquidarDeposito() + "€");
        System.out.println("El intereses de la operación es : " + deposito.ConsultarIntereses() + "€");

        System.out.println(" Depósito estructurado: ");
        DepositoEstructurado depositoEstructurado = new DepositoEstructurado();
        depositoEstructurado.setTitular(cliente);
        System.out.println("Introduce el plazo en días del depósito estructurado");
        depositoEstructurado.setPlazo(teclado.nextInt());
        System.out.println("Introduce el tramo fijo del depósito estructurado");
        depositoEstructurado.setTramoFijo(teclado.nextInt());
        System.out.println("Introduce el tramo variable del depósito estructurado");
        depositoEstructurado.setTramoVariable(teclado.nextInt());
        System.out.println("Introduce el capital del depósito estructurado");
        depositoEstructurado.setCapital(teclado.nextFloat());
        System.out.println("Introduce el tipo de interés del depósito estructurado");
        depositoEstructurado.setInteres(teclado.nextFloat());

        System.out.println("Una vez finalizado el plazo, la liquidación será de: " + depositoEstructurado.LiquidarDeposito() + "€");
        System.out.println("Intereses de la operación: " + depositoEstructurado.ConsultarIntereses() + "€");
    }
}
