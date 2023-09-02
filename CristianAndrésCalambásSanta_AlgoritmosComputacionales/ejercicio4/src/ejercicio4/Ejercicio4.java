/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Christian
 * Se necesita obtener el promedio simple de un estudiante a partir de sus tres notas.
 * Teniendo en cuenta que el promedio es igual a la suma de los datos dividido el
 * número de datos. Por ejemplo: (dato1+dato2+dato3)/3
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        teclado.useLocale(Locale.US);
        
        float nota1, nota2, nota3, totalNota;
        
        System.out.println("Ingrese la primera nota: ");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = teclado.nextFloat();
        
        totalNota = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio total de la nota es: "+totalNota);
    }
    
}
