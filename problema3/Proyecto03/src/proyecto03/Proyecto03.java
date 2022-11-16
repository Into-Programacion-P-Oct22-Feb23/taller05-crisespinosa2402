/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double impuestoPagar;
        double precioVenta;
        double impuesto1 = 20;
        double impuesto2 = 30;
        double impuesto3 = 15;
        double impuesto4 = 8;
        String marcaAutomovil;
        String origenAutomovil;
        double costoAutomovil;

        System.out.println("Ingrese la marca del Automovil");
        marcaAutomovil = entrada.nextLine();

        System.out.println("Ingrese el origen del Automovil");
        origenAutomovil = entrada.nextLine();

        System.out.println("Ingrese el costo del Automovil");
        costoAutomovil = entrada.nextDouble();

        if (origenAutomovil.equals("Alemania")) {
            impuestoPagar = (costoAutomovil * impuesto1) / 100;
            precioVenta = costoAutomovil + impuestoPagar;
            System.out.printf("El impuesto a pagar es:\n%f\nEl precio de "
                    + "venta es:\n%2f\n", impuestoPagar, costoAutomovil);
        } else {
            if (origenAutomovil.equals("Japón")) {
                impuestoPagar = (costoAutomovil * impuesto2) / 100;
                precioVenta = costoAutomovil + impuestoPagar;
                System.out.printf("El impuesto a pagar es:\n%f\nEl precio de "
                        + "venta es:\n%2f\n", impuestoPagar, costoAutomovil);
            }else{
            if (origenAutomovil.equals("Italia")) {
                impuestoPagar = (costoAutomovil * impuesto3) / 100;
                precioVenta = costoAutomovil + impuestoPagar;
                System.out.printf("El impuesto a pagar es:\n%f\nEl precio de "
                        + "venta es:\n%2f\n", impuestoPagar, costoAutomovil);
            }else{
            if (origenAutomovil.equals("USA")) {
                impuestoPagar = (costoAutomovil * impuesto4) / 100;
                precioVenta = costoAutomovil + impuestoPagar;
                System.out.printf("El impuesto a pagar es:\n%f\nEl precio de "
                        + "venta es:\n%2f\n", impuestoPagar, costoAutomovil);
                    }
                }
            } 
        }
    }
}
