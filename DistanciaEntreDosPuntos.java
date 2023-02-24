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
public class DistanciaEntreDosPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double dato1, dato2, distancia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite los datos que desea comparar : ");
        System.out.print("dato 1 : ");
        dato1 = entrada.nextDouble();
        System.out.print("dato 2: ");
        dato2 = entrada.nextDouble();

        distancia = (dato1 - dato2);

        System.out.println("La distancia entre " + dato1 + " y " + dato2 + " es " + distancia);
    }

}
