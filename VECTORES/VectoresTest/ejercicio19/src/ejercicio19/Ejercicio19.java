/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int vector[] = new int[100], menor=0, mayor=0, digM, digMay,acuM=0, acuMen=0, total, cont=0;
        
        for(int n=0;n<10;n++)
        {
            System.out.println("Ingrese un numero: ");
            vector[n] = tecla.nextInt();
        }
        for(int n=0;n<10;n++)
        {
            System.out.print("\t"+vector[n]);
        }System.out.println("");
        //-------------------------
        for(int n=0;n<10;n++)
        {
            if(vector[n]<menor){
                menor = vector[n];
            }
            digM = vector[n]%10;
            acuMen += digM;
        }
        System.out.println("El menor es: "+menor);
        for(int n=0;n<10;n++)
        {
            if(vector[n]>mayor)
            {
                mayor = vector[n];
            }
            digMay = vector[n]%10;
            acuM += digMay;
        }
        System.out.println("El mayor es: "+mayor);
        total = acuMen + acuM;
        for(int n=0;n<10;n++)
        {
            for(int m=1;m<=total;m++)
            {
                cont++;
            }
        }
        if(cont==2)
        {
          //  System.out.print("La semisuma entre el valor mayor y el menor es "+total+" y es numero primo");
        }
    }
}
