/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starten3;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Starten3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int vector[] = new int[4], auxVector[]=new int[11],pos=0;
        for(int i=0;i<vector.length;i++)
        {
            System.out.print("Ingrese un numero: ");
            vector[i] = tecla.nextInt();
        }
        for(int i=0;i<vector.length;i++)
        {
            System.out.print("\t"+vector[i]);
        }System.out.println("");
        
        for(int i=0;i<vector.length;i++)
        {
            while(vector[i]!=0)
            {
                vector[i]/=10;
                if(vector[i]==3 && vector[i]>=1 && vector[i]<=9)
                {
                    auxVector[pos] = i;
                    pos++;
                }
            }
        }
        System.out.println("Numeros que inician con 3 hay: "+pos+"\nEn las posiciones: ");
        for(int i=0;i<pos;i++)
        {
            System.out.print("\t"+auxVector[i]);
        }System.out.println();
    }    
}