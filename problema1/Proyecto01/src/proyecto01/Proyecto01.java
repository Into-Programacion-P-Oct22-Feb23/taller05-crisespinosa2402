/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner entrada = new Scanner(System.in);
            entrada.useLocale(Locale.US);
            
            double costoKilovatio;
            double numeroKilovatios;
            int edad;
            double descuento = 10;
            double valorPlanilla;
            double valorDescuento;
            
            System.out.println("Ingrese el costo por kilovatio/hora");
            costoKilovatio = entrada.nextDouble();
            
            System.out.println("Ingrese el número de kilovotaios consumidos en"
                    + " el mes");
            numeroKilovatios = entrada.nextDouble();
            
            System.out.println("Ingrese su edad por favor");
            edad = entrada.nextInt();
            
            valorPlanilla = costoKilovatio * numeroKilovatios;
                    
            if(edad > 65){
               valorDescuento = (valorPlanilla * descuento) / 100;
               valorPlanilla = valorPlanilla - valorDescuento;
               }
            
            System.out.printf("El valor a cancelar es: \n" + valorPlanilla);
    
    }
    
}
