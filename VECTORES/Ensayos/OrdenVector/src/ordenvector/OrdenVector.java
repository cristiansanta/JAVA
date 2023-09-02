/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenvector;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class OrdenVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tecla = new Scanner(System.in );
        int vect[] = new int[10], n=1, aux=0;
        int vectorAux[] = new int[10];
        
        for(int i=0;i<10;i++)
        {
            System.out.print(i+1+". Ingrse un numero: ");
            vect[i] = tecla.nextInt();
        }
        System.out.println("MATRIX ORIGINAL!!!");
        for(int i=0;i<10;i++)
        {
            System.out.print("\t"+vect[i]);
        }
        System.out.println();
        //------------------------------------
        for(int i=vect.length-1;i>=0;i--)
        {
            for( ;n<=9; )
            {
                   vectorAux[n] = vect[i];
                   n+=2;
                   break;               
            }
        }
        
        //----------------------------------------
        for(int i=0;i<vect.length;i++)
        {
            for( ; aux<=9 ; )//FOR Funcionando como WHILE
            {
                vectorAux[aux] = vect[i];
                aux +=2;
                break;
            }
        }
        
        //--------------------------------------
        System.out.println("\nMATRIX COMBINADA!!!!!");
        for(int i=0;i<10;i++)
        {
            System.out.print("\t"+vectorAux[i]);
        }
        System.out.println();
    }
    
}
