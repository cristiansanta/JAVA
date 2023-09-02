/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Realizar un programa que me pida ingresar información personal y  muestre en
 * pantalla el nombre completo de cada uno de ustedes.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido;
        
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.println("Ingrese su apellido: ");
        apellido = teclado.next();
        System.out.println("Su nombre completo es: "+ nombre + " "+apellido);
    }
    
}
