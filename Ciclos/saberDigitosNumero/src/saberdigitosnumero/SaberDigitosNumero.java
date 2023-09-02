/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saberdigitosnumero;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class SaberDigitosNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int num, i=0, aux=0;
        System.out.println("Ingrese un numero de cualquier valor: ");
        num = tecla.nextInt();
        
        while(num!=0)
        {
            num /= 10;
            if(num>=10 && num<=99 && num==34)
            {
                aux = num;
            }
            i++;
        }
        if(aux==34)
            {
                System.out.println("\nEl numero tiene "+i+" cifras y empieza por 34: "+aux+"!!!");
            }
        else
            {
                System.out.println("\nEl numero tiene "+i+" cifras PERO NO empieza por 34: !!!");
            }

    }
    
}
