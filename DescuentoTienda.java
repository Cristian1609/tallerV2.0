/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class DescuentoTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double valorVenta,descuento;
       
        System.out.println("Digite el valor total de su compra: ");
        valorVenta=entrada.nextDouble();
        System.out.println("Su descuento es: ");
        descuento=valorVenta*15/100;
        System.out.println(descuento);
        
        
    }
    
}
