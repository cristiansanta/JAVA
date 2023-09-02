/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Elabore un programa que lea 2 números y que muestre la suma
 * y la multiplicación de estos.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, numero2,sum,mult;
        System.out.println("Ingrese el primer numero: ");
        numero = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        sum = numero + numero2;
        mult = numero * numero2;
        System.out.println("La suma es: "+sum);
        System.out.println("La multiplicacion es: "+ mult);
    }
    
}
