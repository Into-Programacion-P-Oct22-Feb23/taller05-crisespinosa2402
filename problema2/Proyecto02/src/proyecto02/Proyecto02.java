/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoPedido;
        double cantidad;
        double precioUnitario;
        double unidades = 50;
        double descuento = 15;
        double valorDescuento;

        System.out.println("Ingrese la cantidad que requiere");
        cantidad = entrada.nextDouble();

        System.out.println("Ingrese el precio unitario");
        precioUnitario = entrada.nextDouble();

        costoPedido = cantidad * precioUnitario;

        if (cantidad > unidades){
            valorDescuento = (costoPedido * descuento) / 100;
            costoPedido = costoPedido - valorDescuento;
        }
        System.out.printf("El costo del pedido es: \n" + costoPedido);
    }

}
