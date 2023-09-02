/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;
/**
 *
 * @author Christian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        int number_people, Total;
        System.out.println("TARIFAS LA LANGOSTA AHUMADA\n");
        System.out.println("1.Platillo por persona es de $95.00.");
        System.out.println("2.Si hay entre 200 y 300 personas el platillo vale $85.00");
        System.out.println("3.Si hay mas de 300 personas el platillo le cuesta $75.00");
        
        System.out.println("\nIngrese el numero de personas: ");
        number_people = key.nextInt();
        
        if(number_people>200 && number_people<=300)
        {
            Total = number_people * 85;
            System.out.println("\nEl platillo por persona vale $ 85.00 y el total a pagar para las "+number_people+" personas es: $ "+Total);
        }
        else if(number_people > 300)
        {
            Total = number_people * 75;
            System.out.println("\nEl platillo por persona vale $ 75.00 y el total a pagar para las "+number_people+" personas es: $ "+Total);
        }
        else{
            Total = number_people * 95;
            System.out.println("\nEl total a pagar por platillo es: $ "+Total);
        }
    }
    
}