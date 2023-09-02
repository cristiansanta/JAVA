/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finishdigprim;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class FinishDigPrim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int vect[] = new int[3]; int dig,cont=0,priDig=0, auxVector[]= new int[10];
       
       for(int i=0;i<vect.length;i++)
       {
           System.out.println("Ingrese un numero: ");
           vect[i] = tecla.nextInt();
       }
        System.out.println("El vector original es: ");
       for(int i=0;i<vect.length;i++)
       {
           System.out.print("\t"+vect[i]);
       }
       System.out.println("");
       //-----------------------------------
       for(int i=0;i<vect.length;i++)
       { //dig = vect[i]%10;
           while(vect[i]!=0)
           {
               dig = vect[i]%10;
               vect[i]/=10;
               for(int n=1;n<=dig;n++)
               {
                   if(dig%n==0)
                   {
                       cont++;
                   }
               }
               if(cont==2)
               {
                   auxVector[priDig] = i;
                   priDig++;
                   vect[i]=0;
               }
               else{
                   vect[i] = 0;
               }cont=0;
           } 
       }
        System.out.println("Numeros que terminan en digito primo hay: "+priDig+"\nEn las posiciones: ");
        for(int n=0;n<priDig;n++)
        {
            System.out.print("\t"+auxVector[n]);
        }
        System.out.println();
    }
    
}
