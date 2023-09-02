/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifrasindividuales;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class CifrasIndividuales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int vect[] = new int[10], num,i=0, cont=0, aux=0;
        int k,n;
        
        System.out.println("Ingrese un numero: ");
        num = tecla.nextInt();
       
        while(num>0)
        {
            vect[i] = num%10;
            num /=10;
            i++;
        }
        for(k=0;k<i;k++)
        {
            for( n=1;n<=vect[k];n++)
            {
                if(vect[k]%n==0)
                {
                    cont++;
                }
            }
            if(cont==2)
            { 
                aux++;
            }
            cont=0;
        }
        
        System.out.print("Hay digitos primos: "+aux+" \nPosiciones: "+k);
    }    
}