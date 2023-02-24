/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MinutosAHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int minutos,horas,segundos;
        System.out.print("Ingrese la cantidad de minutos a convertir: ");
        minutos = entrada.nextInt();

        horas = minutos / 60;
        minutos = minutos % 60;
        

        System.out.println(" Los minutos ingresados son:  " + horas + " horas y " + minutos + " minutos");

    }

}
