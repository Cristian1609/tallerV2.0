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
public class SaludaUsuario {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre=entrada.nextLine();
        System.out.println("hola "+nombre+" bienvenido");
    }
    
}
