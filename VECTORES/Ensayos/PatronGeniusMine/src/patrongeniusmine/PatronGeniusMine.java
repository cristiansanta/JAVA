/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrongeniusmine;

import java.util.Scanner;

/**
 *23. Leer 10 números enteros, almacenarlos en un vector y determinar si existe al menos un número repetido.
 * @author Christian
 */
public class PatronGeniusMine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teccla = new Scanner(System.in);
        int vector[] = new int[10], cantRep=0, a,b=4,c=2,div=1,times=0;
        //int vector2[] = new int[10],pos1=0;
        for(int i=0;i<vector.length;i++)
        {
            System.out.println("Ingrese un numero: ");
            vector[i] = teccla.nextInt();
        }
        System.out.println("El vector es: ");
        for (int i=0;i<vector.length;i++)
        {
            System.out.print("\t"+vector[i]);
        }
        
        for(int i=0;i<vector.length;i++)
        {
            for(int j=0;j<vector.length;j++)
            {
                if(i!=j)
                {
                    if(vector[i]==vector[j])
                    { 
                        cantRep++;
                    }
                }
            }
        }
        //------------------------------------------
        /*int auxVcet[]=new int[cantRep],pos=0;
        for(int i=0;i<vector.length;i++)
        {
            for(int j=0;j<vector.length;j++)
            {
                if(i!=j)
                {
                    if(vector[i]==vector[j])
                    {  
                        auxVcet[pos]=i;
                        pos++;
                    }
                }
            }
        }*/
        //-----------------------------------------------
        System.out.println("\nVECTOR INICIAL: ");
        /*for(int i=0;i<cantRep;i++)
        {
            for(int n=0;n<auxVcet.length;n++)
            {
                if(vector[i]!=vector2[n])
                {
                   vector2[n] = auxVcet[i];
                   n++; 
                }
            }
        }
        System.out.println("\nCorrect Positions Array:");
        for(int i=0;i<pos1;i++)
        {
            System.out.print("\t"+auxVcet[i]);
        }*/
        
        //***************************
        System.out.println("\nVALOR incorrecto de REPETICIONES:-->"+cantRep);
        for(int i=1;i<10;i++)
        {
            a = b + c;
            c = a;
            b = b + 2;
            div++;
            if(c==cantRep && cantRep!=2)
            {
                times  = cantRep/div;
                break;
            }
            else
            {
                times = 2;
            }
        }
        System.out.println("REPETICIONES REALES:-->"+times);System.out.println("");
        
    }
    
}
