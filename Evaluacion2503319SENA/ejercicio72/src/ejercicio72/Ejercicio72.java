/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio72;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int alumnos, ac=0, n=0; float nota;
        System.out.println("Ingrese la cantidad de alumnos: ");
        alumnos = teclado.nextInt();
        
        for(int k=1; k <= alumnos; k++)
        {
            System.out.println("\nIngrese la nota del alumno "+k+": ");
            nota = teclado.nextFloat();
            if(nota >= 3.5f && nota <= 5.0f)
            {
                ac++;
            }
            else if (nota<3.5f){
                n++;
            }
            else{
                System.out.println("NOTA INVALIDA!!!");
            }
        }
        System.out.println("\nEl total de alumnos aprobados es: "+ac+"\nEl total de alumnos reprobados es: "+n);
    }
    
}




