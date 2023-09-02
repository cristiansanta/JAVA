/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Diseñe un algoritmo donde se ingresen dos números y genere las siguientes salidas:
    SUMA
    RESTA
    MULTIPLICACIÓN
    DIVISIÓN

 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int sum, rest, mult, div, numero1, numero2;
        
        System.out.println("Ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        
        sum = numero1 + numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        rest = numero1 - numero2;
        
        System.out.println("La resultado de la suma es: "+sum);
        System.out.println("La resultado de la multiplicacion es: "+mult);
        System.out.println("La resultado de la division es: "+div);
        System.out.println("La resultado de la resta es: "+rest);
    }
    
}
