/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numcantidadpar;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class NumCantidadPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int vect[] = new int[3], dig, auxVect[]=new int[11],pos=0;
        
        for(int i=0;i<vect.length;i++)
        {
            System.out.println("Ingrese un numero: ");
            vect[i] = tecla.nextInt();
        }
        for(int i=0;i<vect.length;i++)
        {
            System.out.print("\t"+vect[i]);
        }System.out.println();
        
        for(int i=0;i<vect.length;i++)
        {
            while(vect[i]!=0)
            {
                dig = vect[i]%10;
                vect[i] /=10;
                System.out.println("ESTE-->"+dig);
                if(dig%2==0)
                {
                    auxVect[pos]=i;
                    vect[i]=0;
                    pos++;
                }
            }
        }
        System.out.println("Numeros con digitos pares hay: "+pos+"\nEn las posiciones: ");
        for(int i=0;i<pos;i++)
        {
            System.out.print("\t"+auxVect[i]);
        }System.out.println();
    }    
}