/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Una tienda ofrece un descuento del 15% sobre el total de
 * la compra y un cliente desea saber cuánto deberá pagar finalmente por su compra.
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pagar; float descuento;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el total de la compra: ");
        pagar = teclado.nextInt();
        descuento = pagar - (pagar* .15f);
        
        System.out.println("El valor total a pagar con el descuento es de: "+descuento);
    }
    
}
