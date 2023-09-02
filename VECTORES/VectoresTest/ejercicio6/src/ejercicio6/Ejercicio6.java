/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        tecla.useLocale(Locale.US);
        float vector[] = new float[1000], num, pro =0, pro1=0, cont11=0, cont12=0;
        
        System.out.println("Defina la cantidad de estudiantes: \n");
        num = tecla.nextFloat();
        
        for(int i=0;i<num;i++)
        { int c=i+1;
            System.out.println("Ingrese la estatura del estudiante "+c+": ");
            vector[i] = tecla.nextFloat();
        }
        for(int i=0;i<num;i++)
        {
            System.out.print("\t"+vector[i]);
        }
        //----------------------------------------
        for(int i=0;i<num;i++)
        {
            pro += vector[i];
            pro1 = pro/num;
        }
        System.out.println("\n\nLa media es: "+pro1);
        for(int i=0;i<num;i++)
        {
           if(vector[i]<pro1)
           {
               cont11++;
           }
           else if(vector[i]>pro1)
           {
               cont12++;
           }
        }
        System.out.println("\nHay "+cont11+" estudiantes por debajo de la media y "+cont12+" estudiantes por encima de la media");
    }
    
}