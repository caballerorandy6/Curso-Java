package src.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _24_Tarea2DetalleDeLaFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduzca el nombre de la factura: ");
        String nombreFactura = "";
        nombreFactura = scanner.nextLine();

        System.out.print("\nIntroduzca el primer precio: ");
        double primerPrecio = 0;
        try {
            primerPrecio = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Entrada Incorrecta, revise su numero!");
            main(args);
            System.exit(0);
        }

        System.out.print("\nIntroduzca el segundo precio: ");
        double segundoPrecio = 0;
        try {
            segundoPrecio = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Entrada Incorrecta, revise su numero!");
            main(args);
            System.exit(0);

        }

        double total = primerPrecio + segundoPrecio;

        double impuesto = total / 19;

        double montoDespuesDelImpuesto = total +impuesto;

        System.out.println("La factura producto de oficina tiene un total bruto de " + total + " , con un impuesto de " + impuesto + " y el monto después de impuesto es de " + montoDespuesDelImpuesto);
    }
}
