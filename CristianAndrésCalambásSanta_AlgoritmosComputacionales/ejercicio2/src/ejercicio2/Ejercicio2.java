/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Christian
 * Obtener el área de una circunferencia, teniendo en cuenta que: 
   Área = PI * R2, donde PI: 3,1416

 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int radio;
        double radioResult, area;
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = teclado.nextInt();
        radioResult = Math.pow(radio,2);
        area = 3.1416 * radioResult;
        System.out.println("El area de la circunferencia es: "+area+"cm²");
    }
    
}
