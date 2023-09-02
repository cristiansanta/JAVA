/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Hacer un programa que me muestre la raíz cuadrada de
 * cualquier número ingresado.
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero, result;
        System.out.println("Ingresar un numero: ");
        numero = teclado.nextInt();
        result = Math.sqrt(numero);
        System.out.println("La raiz cuadrada del numero ingresado es: "+result);
    }

}
