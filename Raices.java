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
public class Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double numero, raiz2, raiz3, solucion1, solucion2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un numero : ");
        numero = entrada.nextDouble();

        raiz2 = Math.sqrt(numero);
        System.out.println("Raiz cuadrada: " + raiz2);

        raiz3 = Math.cbrt(numero);
        System.out.println("Raiz cubica: " + raiz3);

    }

}
