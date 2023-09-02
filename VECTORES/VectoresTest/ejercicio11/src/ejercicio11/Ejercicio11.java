/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int vector[] = new int[1000], num;
        boolean comprueba = false;
        for(int n=0;n<10;n++)
        {
            System.out.println("Ingrese un numero: ");
            vector[n] = tecla.nextInt();
        }
        System.out.println("\n");
        for(int n=0;n<10;n++)
        {
            System.out.print("\t"+vector[n]);
        }
        //-----------------------------------------
        System.out.println("\n\nIngrese un numero a buscar en el vector: ");
        num = tecla.nextInt();
        for(int n=0;n<10;n++)
        {
            if(vector[n] == num)
            {
                comprueba = true;
            }
        }
        if(comprueba == true)
        {
            System.out.println("El numero "+num+" si se encuentra en el vector");
        }
        else{
            System.out.println("El numero no se encuentra en el Vector");
        }
    }
    
}