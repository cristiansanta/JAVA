/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Elevar al cubo un número ingresado por el usuario.
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        double cubo;
        
        System.out.println("Ingrese el numero: ");
        numero = teclado.nextInt();
        cubo = Math.pow(numero,3);
        System.out.println("El cubo del numero ingresado es: "+  cubo);
    }
    
}
