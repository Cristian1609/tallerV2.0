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
public class AreaYPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,altura,area,perimetro,lado1,lado2,lado3;
        System.out.print("Digite la base de su triangulo: ");
        base=entrada.nextDouble();
        System.out.print("Digite la altura de su triangulo: ");
        altura=entrada.nextDouble();
        System.out.println("**********AREA**********");
        System.out.print("El area de su triangulo es: ");
        area=(base*altura)/2;
        System.out.println(area);
        System.out.println("********************");
        System.out.println("Digite los 3 lados de su triangulo: ");
        System.out.print("Lado1: ");
        lado1=entrada.nextDouble();
        System.out.print("Lado2:");
        lado2=entrada.nextDouble();
        System.out.print("Lado3:");
        lado3=entrada.nextDouble();
        perimetro=(lado1+lado2+lado3);
        System.out.println("**********PERIMETRO**********");
        System.out.print("Su perimetro es: ");
        System.out.println(perimetro);
        
        
    }
    
}
