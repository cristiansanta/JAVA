/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package start34;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Start34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int vect[] = new int[4], cont=0, vectorAux[] = new int[11],pos=0;
        
        for(int i=0;i<vect.length;i++)
        {
            System.out.print("Ingrese un numero: ");
            vect[i] = tecla.nextInt();
        } 
        System.out.println("\nEl vector original es:");
        for(int i=0;i<vect.length;i++)
        {
            System.out.print("\t"+vect[i]);
        }System.out.println();
        
        for(int i=0;i<vect.length;i++)
        {
            while(vect[i]!=0)
            {
                vect[i]/=10;
                if(vect[i]>=10 && vect[i]<=99 && vect[i]==34)
                {
                    cont++;
                    vectorAux[pos] = i;
                    pos++;
                }
            }
        }
        System.out.println("\nEn el vector comienzan por 34: "+cont+" numeros\n\nEn las posiciones:");
        for(int i=0;i<cont;i++)
        {
            System.out.print("\t"+vectorAux[i]);
        }System.out.println();
    }
    
}
