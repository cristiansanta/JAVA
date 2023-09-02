/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cappicua;
import java.util.Scanner;
/**
 *
 * @author Christian
 */
public class Cappicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int capi, aux, reverse=0, digito;
        
        do{
            System.out.println("Ingrese un numero: ");
            capi = tecla.nextInt();
            
        }while(capi < 100);
        
        aux = capi;
        while(aux > 0)
        {
            digito = aux % 10;
            reverse = reverse*10 + digito;
            aux /= 10;//DETERMINA EL TRABAJO DEL CICLO
        }
        
        if(reverse == capi)
        {
            System.out.println("Es capicua");
        }
        else{
            System.out.println("No es capicua");
        }
    }
    
}