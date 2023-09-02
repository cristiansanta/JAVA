/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int kilos, precioInicial, tamano;
        double Total;
        String tipo;
        
        System.out.println("Ingrese la cantidad de Kilogramos de uva: ");
        kilos = teclado.nextInt();
        System.out.println("Ingrese el precio incial por Kilogramo de la UVA: ");
        precioInicial = teclado.nextInt();
        System.out.println("Ingrese el tipo de la Uva A o B: ");
        tipo = teclado.next(); teclado.nextLine();
        System.out.println("Ingrese el tamaño de la UVA 1 o 2: ");
        tamano = teclado.nextInt();
        if((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && ((tamano==1 || tamano==2)))
        {
            if(tipo.toUpperCase().equals("A") && tamano==1)
            {
                Total = (precioInicial*kilos) + (kilos*.2);
                System.out.println("La ganancia es de: "+Total);
            }
            else if(tipo.toUpperCase().equals("A") && tamano==2)
            {
                Total = (precioInicial*kilos) + (kilos*.3);
                System.out.println("La ganancia es de: "+Total);
            }
            else if(tipo.toUpperCase().equals("B") && tamano==1)
            {
                Total = (precioInicial*kilos) - (kilos*.3);
                System.out.println("La ganancia es de: "+Total);
            }
            else if(tipo.toUpperCase().equals("B") && tamano==2)
            {
                Total = (precioInicial*kilos) - (kilos*.5);
                System.out.println("La ganancia es de: "+Total);
            }
        }
        else{
            System.out.println("Valor de Tamanio o Tipo Incorrecto, Vuelva a introducir!!");
        }
    }
    
}
