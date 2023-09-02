/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *Leer 10 numeros enteros, almacenarlos en un vector y determinar cuantos de
 *los números leídos son números primos terminados en 3
 * @author Christian
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int vector[] = new int[100], cont=0, contAux=0, dig;
        
        for(int n=0;n<=5;n++)
        {
            System.out.println("Ingrese un numero: ");
            vector[n] = tecla.nextInt();
        }
        System.out.println("\nVector Original: ");
        for(int n=0;n<=5;n++)
        {
            System.out.print("\t"+vector[n]);
        }
        System.out.println("\n");
        //---------------------------------------
        for(int n=0;n<=5;n++)
        {
            for(int k=1;k<=vector[n];k++)
            {
                if(vector[n] %k== 0)
                {
                    cont++;
                }
            }
            
        }
        //---------------------------------------
        System.out.println("\n\nPrimos terminados en 3: ");
        for(int n=0;n<=5;n++)
        {
            for(int k=1;k<=vector[n];k++)
            {
                if(vector[n] %k== 0)
                {
                    contAux++;
                }
            }
            if(contAux==2)
            {
                dig = vector[n]%10;
                if(dig == 3)
                {
                    System.out.print("\t"+vector[n]);
                }
            }
            contAux=0;
        }
        
    }
    
}
