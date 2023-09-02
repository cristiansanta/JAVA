/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Suponga que un individuo desea invertir su capital en un banco y desea saber
 * cuánto dinero ganara después de un mes si el banco paga a razón de 2% mensual.
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float ganancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del capital a invertir: ");
        int capital = teclado.nextInt();
        ganancia = capital + (capital * .02f);        
        System.out.println("La ganancia en la inversion mensual es: "+ganancia);
    }
    
}
