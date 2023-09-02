/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int min, totalMin, dia; float impuestos, totalPagar;
        
        System.out.println("Ingrese la cantidad de minutos: ");
        min = tecla.nextInt();
        System.out.println("Ingrese el numero del dia que hizo la llamada\nSi es un DIA FESTIVO ingrese el numero 8: ");
        System.out.println("1.Lunes\n2.Martes\n3.Miercoles\n4.Jueves\n5.Viernes\n6.Sabado\n7.Domingo.");
        dia = tecla.nextInt();
        
        if( min <= 5 )
        {
            totalMin = min * 1;
        }
        else if(min > 5 && min <=8)
        {
            totalMin = min * 80;
        }
        else if(min > 8 && min <= 10)
        {
            totalMin = min * 70;
        }
         else
        {
            totalMin = min * 50;
        }
        
        if( dia == 7 )//Dia DOMINGO
        {
          impuestos = totalMin * .03f;//(totalMin * .03f)+totalMin
          totalPagar = totalMin + impuestos;
            System.out.println("El total a pagar por la llamada es de: $"+ totalPagar);
        }
        else if(dia >= 1 && dia <= 6)//Dias habiles
        {
            impuestos = totalMin * .15f;//(totalMin * .03f)+totalMin
            totalPagar = totalMin + impuestos;
            System.out.println("El total a pagar por la llamada es de: $"+ totalPagar);
        }
        else if(dia == 8 )//FESTIVO
        {
            impuestos = totalMin * .10f;//(totalMin * .03f)+totalMin
            totalPagar = totalMin + impuestos;
            System.out.println("El total a pagar por la llamada es de: $"+ totalPagar);
        }        
    }
}
