/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorDescuento;
        double descuento1 = 10;
        double descuento2 = 15;
        double descuento3 = 20;
        int dias;
        double precioDiario;
        double subtotalPagar;
        double totalPagar;
        
        System.out.println("Ingrese el número de días que se hospedo");
        dias = entrada.nextInt();
        
        System.out.println("Ingrese el precio diario de la habitación");
        precioDiario = entrada.nextDouble();
        
        subtotalPagar = precioDiario * dias;
        
        if(dias > 5){
           valorDescuento = (subtotalPagar * descuento1) / 100;
           totalPagar = subtotalPagar - valorDescuento;
           System.out.printf("El subtotal es:\n%f\nEl descuento es:\n%f\nEl"
                + " total por pagar es:\n%f",subtotalPagar, 
               valorDescuento,totalPagar);
        }
        else{
         if(dias > 10){
            valorDescuento = (subtotalPagar * descuento2) / 100;
           totalPagar = subtotalPagar - valorDescuento;
           System.out.printf("El subtotal es:\n%f\nEl descuento es:\n%f\nEl"
                + " total por pagar es:\n%f",subtotalPagar, 
               valorDescuento,totalPagar);
        }else{
         if(dias > 15){
            valorDescuento = (subtotalPagar * descuento2) / 100;
            totalPagar = subtotalPagar - valorDescuento; 
            System.out.printf("El subtotal es:\n%f\nEl descuento es:\n%f\nEl"
                + " total por pagar es:\n%f",subtotalPagar, 
               valorDescuento,totalPagar);
            }
        }
        
        
        

      }

    }
 }
