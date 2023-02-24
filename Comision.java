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
public class Comision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double venta1,venta2,venta3,comision,sueldo,base=1200000;
        
        System.out.println("Digita precio venta 1: ");
        venta1=entrada.nextDouble();
        System.out.println("Digita precio venta 2: ");
        venta2=entrada.nextDouble();
        System.out.println("Digita precio venta 3: ");
        venta3=entrada.nextDouble();
        
        comision=(venta1+venta2+venta3)*0.1;
        sueldo=comision+base;
        System.out.println("comision "+comision);
        System.out.println("sueldo final "+base+" + " + comision+" = "+sueldo);
        
    }
    
}
